package tn.esprit.spring.Controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.PiApplication;


@RestController

public class RestControlMail{

@Autowired
	PiApplication sendingEmailApplication;
	@RequestMapping(value ="sendemailll")
	public String send() throws AddressException, MessagingException, IOException {
	   //sendEmail();
		sendingEmailApplication.sendEmail();
	   return "Email sent successfully";   
	}
}

