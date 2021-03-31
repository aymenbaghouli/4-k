 package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Director;


public interface DirectorRepository extends CrudRepository<Director, Integer>{
		@Query("select d  from Director d ")
		public List<Director> getAllDirector();
		@Query(value="SELECT * FROM Director Order By username",nativeQuery =true)
		public List<Director> FindDirectorByName(String username);

		
	}
