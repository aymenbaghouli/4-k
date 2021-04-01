package tn.esprit.spring.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Donations;
import tn.esprit.spring.repos.DonationsRepository;
import tn.esprit.spring.services.DonationsServiceInt;


@Controller
@RestController
@RequestMapping("Donations")
public class DonationsController {
	@Autowired
	DonationsServiceInt DS ; 
	DonationsRepository DR;
	//http://localhost:8087/jardin/Event/addEvent
	//{"id":1,"name":"eeee","productNumber":2,"description":"esprit event"}//}
	//http://localhost:8087/jardin/Donations/addDonations
	@PostMapping("/addDonations")
	@ResponseBody
	public  Donations ajouterDonations(@RequestBody Donations d){
    return DS.ajouterDonations(d);	
	
	}
	//http://localhost:8087/jardin/Donations/getAllDonation
	@GetMapping("/getAllDonations")
    @ResponseBody
	public List<Donations> afficherDonations() {
		return DS.afficherDonations();
	}
	//http://localhost:8087/jardin/Donations/DeleteDonationsById/
	@DeleteMapping("/DeleteDonationsById/{idev}") 
	@ResponseBody 
		
		public void DeleteDonationsById(@PathVariable("iddon")int DonationsId){
			DS.DeleteDonationsById(DonationsId);
		}
			
	@PutMapping("/modifyDonations") 
	 @ResponseBody
	 
		public Donations UpdateDonations(@RequestBody Donations d) 
		{ 	
		 return DS.UpdateDonations(d); 
	    }	
	//http://localhost:8087/jardin/Donations/getAlldonations
	 @GetMapping("/getAlldonations")
	    public ResponseEntity<List<Donations>> getAlldonations(
	                        @RequestParam(defaultValue = "0") Integer pageNo, 
	                        @RequestParam(defaultValue = "2") Integer pageSize,
	                        @RequestParam(defaultValue = "id") String sortBy) 
	    {
	        List<Donations> list = DS.getAlldonations(pageNo, pageSize, sortBy);
	 
	        return new ResponseEntity<List<Donations>>(list, new HttpHeaders(), HttpStatus.OK); 
	    }
	}

