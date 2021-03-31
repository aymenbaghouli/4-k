package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Parent extends User implements Serializable {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


private boolean isdelegate;


	private String satifaction;

	
	public Parent() {
		super();
	}


	public Parent(int iduser, String username, String userlastname, String password, String useremail,
			int number, boolean actif, Role role) {
		super(iduser, username, userlastname, password, useremail, number, actif, role);
	}


	public Parent(boolean isdelegate, String satifaction, List<Reclamation> reclamation) {
		super();
		this.isdelegate = isdelegate;
		this.satifaction = satifaction;
		this.reclamation = reclamation;
	}


	@OneToMany(mappedBy="parent")
	private List<Reclamation> reclamation;
	


	public List<Reclamation> getReclamation() {
		return reclamation;
	}


	public void setReclamation(List<Reclamation> reclamation) {
		this.reclamation = reclamation;
	}


	public boolean isIsdelegate() {
		return isdelegate;
	}


	public void setIsdelegate(boolean isdelegate) {
		this.isdelegate = isdelegate;
	}


	public String getSatifaction() {
		return satifaction;
	}


	public void setSatifaction(String satifaction) {
		this.satifaction = satifaction;
	}
	
}