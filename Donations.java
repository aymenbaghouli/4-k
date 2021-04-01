package tn.esprit.spring.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import net.minidev.json.annotate.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Donations implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6191889143079517027L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)	
	private Long id; 
	private String Description;
	private String name;
	private int productNumber;
	public Donations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donations(Long id, String description, String name, int productNumber) {
		super();
		this.id = id;
		Description = description;
		this.name = name;
		this.productNumber = productNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
