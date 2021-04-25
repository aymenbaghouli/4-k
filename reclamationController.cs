using PI.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Web;
using System.Web.Mvc;

namespace PI.Controllers
{
    public class reclamationController : Controller
    {
        // GET: rec
        public ActionResult Index()
        {
            HttpClient Client = new HttpClient();
            Client.BaseAddress = new Uri("http://localhost:8082/SpringMVC/");
            Client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
            HttpResponseMessage response = Client.GetAsync("servlet/getAllReclamation").Result;
            if (response.IsSuccessStatusCode)
            {
                var reclamations
                     = response.Content.ReadAsAsync<IEnumerable<Reclamation>>().Result;

                return View(reclamations);

            }


            else
            {
                ViewBag.result = "error";
                return View(new List<Reclamation>());


            }



        }


        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }


        [HttpPost]
        public ActionResult Create(Reclamation reclamation)

        {
            HttpClient client = new HttpClient();
            client.BaseAddress = new Uri("http://localhost:8082/SpringMVC/");

            _ = client.PostAsJsonAsync<Reclamation>("servlet/ajouterReclamation", reclamation).ContinueWith((postTask) => postTask.Result.EnsureSuccessStatusCode());
            return RedirectToAction("Index");

        }





    }


}




