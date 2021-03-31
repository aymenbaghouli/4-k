 package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Parent;




public interface ParentRepository extends CrudRepository<Parent, Integer>{
	@Query("select p  from Parent p ")
	public List<Parent> getAllParent();

	@Query(value="SELECT * FROM Parent Order By username",nativeQuery =true)
	public List<Parent> FindParentByUsername(String Username);
	
	
}
