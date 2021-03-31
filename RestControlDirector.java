package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Service.IDirector;
import tn.esprit.spring.entities.Director;


@RestController

@CrossOrigin("*")


public class RestControlDirector {
	
	
	@Autowired
	private IDirector idirectorService;
	
	
	
	@GetMapping(value ="getAllDirectors")
	public List<Director>findAllDirectors(){
		return idirectorService.findAllDirectors();
	}
	
	

	
	@DeleteMapping("deleteDirectorById")
	public String deleteDirectorById (@RequestParam int iduser){
		idirectorService.deleteDirectorById(iduser);
		return "Director deleted!";
	}
	
	
	@PutMapping("updateDirector")
	public Director updateDirector(@RequestBody Director director){
		return idirectorService.updateDirector(director);
	}
	
	
	@GetMapping(value = "FindDirectorByName")
	@ResponseBody
	public List<Director>  FindDirectorByName(@PathVariable String username) {
		return idirectorService.FindDirectorByName(username);
	}

	
	 
	}
	
	

