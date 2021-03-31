package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Parent;
import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.ReclamationRepository;

@Service
public class ReclamationService implements IReclamation {

	
	@Autowired
	 private ReclamationRepository reclamationRepository;
	
	
	
	@Override
	public List<Reclamation> findAllReclamation() {
		return (List<Reclamation>) reclamationRepository.findAll();
	}

	@Override
	public Reclamation ajouterReclamation(Reclamation r) {
		return reclamationRepository.save(r);
	}

	@Override
	public void deleteReclamationById(int idR) {
		 reclamationRepository.deleteById(idR);
	}

	public Reclamation updateReclamation(int id,String satisfaction) {
		Reclamation u = reclamationRepository.findById(id).get();
		u.setSatisfaction(satisfaction);
		return reclamationRepository.save(u);
	}

	@Override
	public List<Reclamation> FindReclamationByCategorie(String categorie) {
		return (List<Reclamation>) reclamationRepository.FindReclamationByCategorie(categorie);
}
	
	public List<Reclamation> FindReclamationSortedByCategorie(){
		return reclamationRepository.FindReclamationSortedByCategorie();
		
}


}