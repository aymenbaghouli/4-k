package tn.esprit.spring.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "User",catalog = "jardin")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iduser;
	
	private String username;
	private String userlastname;
	private String password;
	private String useremail;
	private int number;

	private boolean actif;

	@Enumerated(EnumType.STRING)
	//@NotNull
	private Role role;
	

	public User() {
		super();
	}
	public User(int iduser, String username, String userlastname, String password, String useremail,
			int number, boolean actif, Role role) {
		super();
		this.iduser = iduser;
		this.username = username;
		this.userlastname = userlastname;
		this.password = password;
		this.useremail = useremail;
		this.number = number;
		this.actif = actif;
		this.role = role;
	}
	
	
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserlastname() {
		return userlastname;
	}
	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}