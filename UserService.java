package tn.esprit.spring.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;


@Service
public class UserService implements IUser {
	
	@Autowired
	 private UserRepository userRepository;
	

	@Override
	public User ajouterUser(User u) {	
		return userRepository.save(u);
	}


	@Override
	public void deleteUserById(int iduser) {
		 userRepository.deleteById(iduser);
	}

	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	
	public User updateUser(int id,String username) {
		User u = userRepository.findById(id).get();
		u.setUserlastname(username);
		
		return userRepository.save(u);
	}

	public List<User> findAllUsersByRole()
	{
		
	List<User> L= (List<User>) userRepository.findAll();
	for(User u:L)
	{
		if (u.getRole().equals("DOCTOR"))
			L.add(u);
	
	}
	return L;
	
		
	}
	
	public List<User> findAllUsersByDirectorRole()
	{
		
	List<User> L= (List<User>) userRepository.findAll();
	for(User u:L)
	{
		if (u.getRole().equals("DIRECTOR"))
			L.add(u);
	
	}
	return L;
	
		
	}

	public List<User> findAllUsersByParentRole()
	{
		
	List<User> L= (List<User>) userRepository.findAll();
	for(User u:L)
	{
		if (u.getRole().equals("PARENT"))
			L.add(u);
	
	}
	return L;
	
		
	}


	@Override
	public List<User> FindUserSortedByUsername() {

		return userRepository.FindUserSortedByUsername();
	}

	
	
	
	 
}









