package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entities.User;


public interface IUser {


	public List<User> findAllUsers();
	public User ajouterUser(User u);
	public void deleteUserById(int iduser );
	public User updateUser(int id,String username);

	public List<User> findAllUsersByRole();
	public List<User> findAllUsersByDirectorRole();
	public List<User> findAllUsersByParentRole();
	
	public List<User> FindUserSortedByUsername();

	
}
