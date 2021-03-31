 package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Doctor;
import tn.esprit.spring.entities.User;




public interface DoctorRepository extends CrudRepository<Doctor, Integer>{
	@Query("select doc  from Doctor doc ")
	public List<Doctor> getAllParent();
	@Query(value="SELECT * FROM Doctor Order By datedispo",nativeQuery =true)
	public List<Doctor> FindDoctorSortedByDispo();
	@Query(value="SELECT * FROM Doctor Order By username",nativeQuery =true)
	public List<Doctor> FindDoctorByName(String username);
	
	

	@Query("SELECT u FROM User u WHERE u.role like DOCTOR")
	public List<User> findAllDoctors();
}
