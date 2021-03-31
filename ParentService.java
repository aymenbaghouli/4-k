package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Parent;
import tn.esprit.spring.repository.ParentRepository;



@Service
public class ParentService implements IParent {
	
	@Autowired
	 private ParentRepository parentRepository;
	
	@Override
	public List<Parent> findAllParents() {
		  return (List<Parent>) parentRepository.findAll();
	} 

	
	@Override
	public Parent ajouterParent(Parent p) {
		return parentRepository.save(p);
	}
	

	@Override
	public void deleteParentById(int iduser) {
		parentRepository.deleteById(iduser);
	}

	@Override
	public Parent updateParent(Parent parent) {
		return parentRepository.save(parent);
		
	}


	@Override
	public List<Parent> FindParentByUsername(String username) {
		return (List<Parent>) parentRepository.FindParentByUsername(username);
}


}