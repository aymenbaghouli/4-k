package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entities.Reclamation;


public interface IReclamation {

	public List<Reclamation> findAllReclamation();
	public Reclamation ajouterReclamation(Reclamation r);
	public void deleteReclamationById(int idR );
	public Reclamation updateReclamation(int id,String sujetr);
	public List<Reclamation> FindReclamationByCategorie(String categorie);
	public List<Reclamation> FindReclamationSortedByCategorie();
}