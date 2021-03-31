package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Service.IReclamation;
import tn.esprit.spring.entities.Reclamation;


@RestController

@CrossOrigin("*")

public class RestControlReclamation {
	
	@Autowired
	 private IReclamation ireclamationService;
	

	
	
	@GetMapping(value ="getAllReclamation")
	public List<Reclamation>findAllReclamation(){
		return ireclamationService.findAllReclamation();
	}
	
	
	@PostMapping(value="ajouterReclamation")
	public Reclamation ajouterReclamation(@RequestBody Reclamation r) {		
		System.out.println("Reclamation added!");
		ireclamationService.ajouterReclamation(r);
		
		return r;
	}
	

	@GetMapping(value = "FindReclamationByCategorie")
	@ResponseBody
	public List<Reclamation>  FindReclamationByCategorie(@PathVariable String categorie) {
		return ireclamationService.FindReclamationByCategorie(categorie);
	}

	 @GetMapping(value = "/Sort")
	 @ResponseBody
		public List<Reclamation> FindReclamationSortedByCategorie() {

	    	return ireclamationService.FindReclamationSortedByCategorie();
		}
	

} 