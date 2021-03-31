package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import tn.esprit.spring.Service.IDoctor;
import tn.esprit.spring.entities.Doctor;
import tn.esprit.spring.entities.User;

@RestController

@CrossOrigin("*")

public class RestControlDoctor{
	
	
	private IDoctor idoctorService;
	
	
	
	@DeleteMapping("deleteDoctorById")
	public String deleteDoctorById (@RequestParam int iduser){
		idoctorService.deleteDoctorById(iduser);
		return "Doctor deleted!";
	}
	
	
	@PutMapping("updateDoctor")
	public Doctor updateDoctor(@RequestBody Doctor doctor){
		return idoctorService.updateDoctor(doctor);
	}
	

	@GetMapping(value = "FindDoctorByName")
	@ResponseBody
	public List<Doctor>  FindDoctorByName(@PathVariable String username) {
		return idoctorService.FindDoctorByName(username);
	}
	

}