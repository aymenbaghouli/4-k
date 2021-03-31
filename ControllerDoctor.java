package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.Service.IDoctor;
import tn.esprit.spring.entities.Doctor;


@Controller
public class ControllerDoctor  {
	
	@Autowired
	IDoctor idoctorService;



	public void deleteDoctorById(int iduser) {
		idoctorService.deleteDoctorById(iduser);
	}

	public Doctor updateParent(Doctor doctor) {
		return idoctorService.updateDoctor(doctor);
	}
	
	public List<Doctor> FindDoctorByUserame(String username) {
		return idoctorService.FindDoctorByName(username);
	}

	
	
	
	
}