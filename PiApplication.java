package tn.esprit.spring;

import javax.mail.internet.InternetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class PiApplication {

	
	@Autowired
    private JavaMailSender javaMailSender;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PiApplication.class, args);
		
		
	}


	public void sendEmail() {
		SimpleMailMessage msg = new SimpleMailMessage();
		//msg.setFrom(new InternetAddress("no-reply@gmail.com"));
        msg.setTo("lina.thraya@esprit.tn");

        msg.setSubject("Satisfaction");
        msg.setText(" Bonjour, Merci d'ajouter votre Reclamation/Satisfaction");

        javaMailSender.send(msg);
	}

}
