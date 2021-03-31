package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Doctor extends User implements Serializable  {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isdispo;
	private Date datedispo;

	
	public Doctor() {
		super();
	}

	public Doctor(int iduser, String username, String userlastname, String password, String useremail,int number, boolean actif, Role role) {
		super(iduser, username, userlastname, password, useremail, number, actif, role);
	}

	public Doctor(boolean isdispo, Date datedispo) {
		super();
		this.isdispo = isdispo;
		this.datedispo = datedispo;
	}

	public boolean isIsdispo() {
		return isdispo;
	}

	public void setIsdispo(boolean isdispo) {
		this.isdispo = isdispo;
	}

	public Date getDatedispo() {
		return datedispo;
	}

	public void setDatedispo(Date datedispo) {
		this.datedispo = datedispo;
	}
	
	
}