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
    public class userController : Controller
    {
        // GET: user
        public ActionResult Index()
        {
            HttpClient Client = new HttpClient();
            Client.BaseAddress = new Uri("http://localhost:8082/SpringMVC/");
            Client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));

            HttpResponseMessage response = Client.GetAsync("servlet/getAllUsers").Result;
            if (response.IsSuccessStatusCode)
            {
                var Users
                     = response.Content.ReadAsAsync<IEnumerable<User>>().Result;

                return View(Users);

            }


            else
            {
                ViewBag.result = "error";
                return View(new List<User>());


            }



        }


        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }


        [HttpPost]
        public ActionResult Create(User user)

        {
            HttpClient client = new HttpClient();
            client.BaseAddress = new Uri("http://localhost:8082/SpringMVC/");

            client.PostAsJsonAsync<User>("servlet/ajouterUser", user).ContinueWith((postTask) => postTask.Result.EnsureSuccessStatusCode());
            return RedirectToAction("Index");

        }

        [HttpGet]
        public ActionResult Edit(int iduser)
        {

            User user = null;

            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri("http://localhost:8082/SpringMVC/");
                //HTTP GET
                var responseTask = client.GetAsync("servlet/getAllUsers" + iduser.ToString());
                responseTask.Wait();

                var result = responseTask.Result;
                if (result.IsSuccessStatusCode)
                {
                    var readTask = result.Content.ReadAsAsync<User>();
                    readTask.Wait();

                    user = readTask.Result;
                }
            }

            return View(user);
        }


        [HttpPost]
        public ActionResult Edit(User user)
        {
            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri("http://localhost:8082/SpringMVC/");

                //HTTP POST
                var putTask = client.PutAsJsonAsync<User>("servlet/updateUser", user);
                putTask.Wait();

                var result = putTask.Result;
                if (result.IsSuccessStatusCode)
                {

                    return RedirectToAction("Index");
                }
            }
            return View(user);
        }

        [HttpGet]
        public ActionResult Delete()
        {
            return View();
        }


        [HttpPost]
        public ActionResult Delete(int iduser)
        {
            HttpClient Client = new HttpClient();



            var response = Client.DeleteAsync("servlet/deleteUser" + iduser.ToString()).ContinueWith(DeleteTask => DeleteTask.Result.EnsureSuccessStatusCode());


            return RedirectToAction("Index");
        }
    }


}







