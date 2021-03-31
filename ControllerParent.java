package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.Service.IParent;
import tn.esprit.spring.entities.Parent;

@Controller
public class ControllerParent  {
	
	@Autowired
	IParent iparentService;

	public List<Parent> findAllParents() {
		return iparentService.findAllParents();
	}

	public void deleteParentById(int iduser) {
		iparentService.deleteParentById(iduser);
	}

	public Parent updateParent(Parent parent) {
		return iparentService.updateParent(parent);
	}
	
	public List<Parent> FindParentByUserame(String username) {
		return iparentService.FindParentByUsername(username);
	}

	
	
	
	
}