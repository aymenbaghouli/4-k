package tn.esprit.spring.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Service.IParent;
import tn.esprit.spring.entities.Parent;


@RestController

@CrossOrigin("*")

public class RestControlParent  {
	
	@Autowired
	 private IParent iparentService;
	
	
	@GetMapping(value ="getAllParent")
	public List<Parent>findAllParents(){
		return iparentService.findAllParents();
	}

	
	@DeleteMapping("deleteParentById")
	public String deleteParentById (@RequestParam int iduser){
		iparentService.deleteParentById(iduser);
		return "Parent deleted!";
	}
	
	
	@PutMapping("updateParent")
	public Parent updateParent(@RequestBody Parent parent){
		return iparentService.updateParent(parent);
	}
		
	@GetMapping(value = "FindParentByName")
	@ResponseBody
	public List<Parent>  FindParentByUsername(@PathVariable String username) {
		return iparentService.FindParentByUsername(username);
	}
	
	
	 
	 
}
