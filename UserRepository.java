package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	
	@Query("SELECT u FROM User u WHERE u.username=:username and u.password=:password")
	public User getUserByUsernameAndPassword(@Param("username")String login, @Param("password")String password);	
	@Query("select k  from User k ")
	public List<User> getAllUsers();
	
	@Query("SELECT u FROM User u WHERE u.username=:texte")
	public User findAllDoctors(@Param("texte")String texte);	
	
	@Query("SELECT u FROM User u WHERE u.username=:texte")
	public User findAllParents(@Param("texte")String texte);	
	
	@Query("SELECT u FROM User u WHERE u.username=:texte")
	public User findAllDirectors(@Param("texte")String texte);	
	
	@Query("select k  from User k order by k.username ")
	public List<User> FindUserSortedByUsername();

	
	


	
	
	
	
	
}
