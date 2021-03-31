package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.Service.IReclamation;
import tn.esprit.spring.entities.Reclamation;


@Controller
public class ControllerReclamation  {
	
	@Autowired
	IReclamation ireclamationService;

	public List<Reclamation> findAllReclamation() {
		return ireclamationService.findAllReclamation();
	}

	public Reclamation ajouterReclamation(Reclamation r) {
		return ireclamationService.ajouterReclamation(r);
	}
	
	public void deleteReclamationById(int iduser) {
		ireclamationService.deleteReclamationById(iduser);
	}

	
	
	public List<Reclamation> FindReclamationByCategorie(String categorie) {
		return ireclamationService.FindReclamationByCategorie(categorie);
	}

	
	
	
	
}