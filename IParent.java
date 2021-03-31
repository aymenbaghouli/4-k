package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entities.Parent;


public interface IParent {
	
	
	public List<Parent> findAllParents();
	public Parent ajouterParent(Parent p);
	public void deleteParentById(int iduser );
	public Parent updateParent(Parent parent);
	public List<Parent> FindParentByUsername(String username);


}