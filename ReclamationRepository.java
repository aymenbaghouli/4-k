 package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Reclamation;




public interface ReclamationRepository extends CrudRepository<Reclamation, Integer>{
	@Query("select r  FROM Reclamation r")
	public List<Reclamation> getAllReclamation();
	@Query(value="SELECT * FROM Reclamation r where r.categorie=:categorie ",nativeQuery =true)
	public List<Reclamation> FindReclamationByCategorie(String categorie);
	@Query("select r FROM Reclamation r order by categorie desc")
	public List<Reclamation> FindReclamationSortedByCategorie();


}









