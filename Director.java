package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class Director extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Director() {
		super();
	}

	public Director(int iduser, String username, String userlastname, String password, String useremail, int number,
			boolean actif, Role role) {
		super(iduser, username, userlastname, password, useremail, number, actif, role);
	}


	

	



}
