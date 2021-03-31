package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entities.Doctor;
import tn.esprit.spring.entities.User;


public interface IDoctor {
	
	
	
	public void deleteDoctorById(int iduser );
	public Doctor updateDoctor(Doctor doctor);
	public List<Doctor> FindDoctorByName(String username);



	
}