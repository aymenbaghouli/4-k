package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Doctor;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.DoctorRepository;
import tn.esprit.spring.repository.UserRepository;

@Service
public class DoctorService implements IDoctor {

	
	@Autowired
	  DoctorRepository doctorRepository;
	@Autowired
	  UserRepository userRepository;
	

	
	




	@Override
	public void deleteDoctorById(int iduser) {
		doctorRepository.deleteById(iduser);
		
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);

	}


	@Override
	public List<Doctor> FindDoctorByName(String username) {
		return doctorRepository.FindDoctorByName( username);

	}
	
}