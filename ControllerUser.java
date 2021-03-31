package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.Service.IUser;
import tn.esprit.spring.entities.User;


@Controller
public class ControllerUser  {
	
	@Autowired
	IUser iuserService;

	public List<User> findAllUsers() {
		return iuserService.findAllUsers();
	}
	
	public User ajouterUser(User user) {
		return iuserService.ajouterUser(user);
	}

	public void deleteUserById(int iduser) {
		iuserService.deleteUserById(iduser);
	}

	/*public User updateUser(User user) {
		return iuserService.updateUser(user);
	}*/
	
	
	
}