package tn.esprit.spring.Controller;

import java.util.List
;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Service.IUser;
import tn.esprit.spring.entities.User;


@RestController

@CrossOrigin("*")

public class RestControlUser  {
	

	@Autowired
	 private IUser iuserService;


	
   @GetMapping(value ="getAllUsers")
    public List<User>findAllUser(){
	return iuserService.findAllUsers();}
	//done
	
	@PostMapping(value="ajouterUser")
	public User ajouterUser(@RequestBody User u) {
		System.out.println("User added.");
		iuserService.ajouterUser(u);
		
		return u;
	}

		
	//http://localhost:8082/SpringMVC/servlet/deleteUser/{id}
	@DeleteMapping("deleteUser/{id}")
	public String deleteUserById (@PathVariable("id") int iduser){
		iuserService.deleteUserById(iduser);
		return "User deleted!";
	}
	
	//http://localhost:8082/SpringMVC/servlet/updateUser/id/username
	@PutMapping("updateUser/{id}/{username}")
	public User updateUser(@PathVariable("id") int iduser ,@PathVariable("username") String username ){
		return iuserService.updateUser(iduser,username);
	}
	
	   @GetMapping(value ="getAlluserbyrole")
	    public List<User> UserfindByrole(){
		return iuserService.findAllUsersByRole();
		}
	
	   @GetMapping(value ="getAlluserbydirectorrole")
	    public List<User> UserfindBydirectorrole(){
		return iuserService.findAllUsersByDirectorRole();
		}
	   
	   @GetMapping(value ="getAlluserbyparentrole")
	    public List<User> UserfindByparentrole(){
		return iuserService.findAllUsersByParentRole();
		}
	
	   
	   
		 @GetMapping(value = "/Sortuser")
			public List<User> FindUserSortedByUsername() {

		    	return iuserService.FindUserSortedByUsername();
			}

		 
		 @GetMapping("/users/export/pdf")
		    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
		        response.setContentType("application/pdf");
		        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		        String currentDateTime = dateFormatter.format(new Date());
		         
		        String headerKey = "Content-Disposition";
		        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
		        response.setHeader(headerKey, headerValue);
		         
		        List<User> listUsers = service.listAll();
		         
		        UserPDFExporter exporter = new UserPDFExporter(listUsers);
		        exporter.export(response);
		         
		    }
		}
		 
}
