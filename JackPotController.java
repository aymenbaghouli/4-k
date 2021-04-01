package tn.esprit.spring.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.JackPot;
import tn.esprit.spring.services.JackPotServiceInt;
import tn.esprit.spring.services.JackPotService;
@Controller
@RestController
@RequestMapping("JackPot")	
public class JackPotController {
    @Autowired
    JackPotServiceInt JP ;
    //{"amount": "1200"}
    @PostMapping("/addJackPot")
    @ResponseBody
    public JackPot ajouterJackPot(@RequestBody JackPot jp){
    return JP.ajouterJackPot(jp);
    }
    
    
    @GetMapping("/getAllJackPot")
    @ResponseBody
	public List<JackPot> afficherJackPot() {
		
		return JP.afficherJackPot();
	}
    //http://localhost:8087/jardin/JackPot/DeleteJackPotById/1
   
    @DeleteMapping("/DeleteJackPotById/{idpar}") 
	@ResponseBody 
		
		public void DeleteJackPotById(@PathVariable("idpar")long JackPotId){
			JP.DeleteJackPotById(JackPotId);
		}
    @PutMapping("/modifyJackPot") 
	 @ResponseBody 
	 
		public JackPot UpdateJackPot(@RequestBody JackPot p) 
		{ 	
		 return JP.UpdateJackPot(p); 
	    }	
}
