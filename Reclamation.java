package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Reclamation",catalog = "jardin")
public class Reclamation implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idR;
	
	private String satisfaction;
	private String categorie;
	

	public Reclamation() {
	}

	public Reclamation(int idR, String satisfaction, String categorie, Date dateR, Parent parent) {
		super();
		this.idR = idR;
		this.satisfaction = satisfaction;
		this.categorie = categorie;
		this.parent = parent;
	}
	@ManyToOne
	private Parent parent;
	
	
	
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public long getIdR() {
		return idR;
	}
	public void setIdR(int idR) {
		this.idR = idR;
	}
	
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}
	
	
	
	
	
	
	
}