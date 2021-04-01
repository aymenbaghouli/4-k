package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import net.minidev.json.annotate.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Event implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	private String Description;
	
	@Temporal(TemporalType.DATE)
	private Date AddDate;
	private String Location;
	
	
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(long id, String description, Date addDate, String location) {
		super();
		this.id = id;
		Description = description;
		AddDate = addDate;
		Location = location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getAddDate() {
		return AddDate;
	}
	public void setAddDate(Date addDate) {
		AddDate = addDate;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	
	

}
