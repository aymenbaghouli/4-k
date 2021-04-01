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

import tn.esprit.spring.entities.Event;
import tn.esprit.spring.entities.Participant;
import tn.esprit.spring.services.ParticipantServiceInt;
import tn.esprit.spring.services.EventServiceInt;
import tn.esprit.spring.services.ParticipantService;

@Controller
@RestController
@RequestMapping("Event")
public class EventController {
	@Autowired
	EventServiceInt ES ; 
	//http://localhost:8087/jardin/Event/addEvent
	//{"name": "EspritEvent","location": "Ariana","description": "esprit event","addDate": "2021-03-11"//}
	@PostMapping("/addEvent")
	@ResponseBody
	public  Event ajouterEvent(@RequestBody Event e){
    return ES.ajouterEvent(e);	
	
	}
	//http://localhost:8087/jardin/Participant/getAllEvent
	@GetMapping("/getAllEvent")
    @ResponseBody
	public List<Event> afficherEvent() {
		
		return ES.afficherEvent();
	}
	//http://localhost:8087/jardin/Event/DeleteEventById/
	@DeleteMapping("/DeleteEventById/{idev}") 
	@ResponseBody 
		
		public void DeleteEventById(@PathVariable("idev")int EventId){
			ES.DeleteEventById(EventId);
		}
	//http://localhost:8087/jardin/Event/modifyEvent
	@PutMapping("/modifyEvent") 
	 @ResponseBody
	 
		public Event UpdateEvent(@RequestBody Event e) 
		{ 	
		 return ES.UpdateEvent(e); 
	    }	
	 

}
