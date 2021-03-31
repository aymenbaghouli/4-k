package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.Service.IDirector;
import tn.esprit.spring.Service.IParent;
import tn.esprit.spring.entities.Director;

@Controller
public class ControllerDirector  {
	
	@Autowired
	IDirector idirectorService;

	public List<Director> findAllDirector() {
		return idirectorService.findAllDirectors();
	}

	public void deleteDirectorById(int iduser) {
		idirectorService.deleteDirectorById(iduser);
	}

	public Director updateDirector(Director director) {
		return idirectorService.updateDirector(director);
	}
	
	public List<Director> FindDirectorByName(String username) {
		return idirectorService.FindDirectorByName(username);
	}

	
	
	
	
}