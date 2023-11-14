package com.registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsRegistrationController {

	@Autowired
	private CardRegistrationService cardregistrationservice;
	
	  @PostMapping("/customer-registration")
		    private  void saveBook(@RequestBody UserDetails userdetails)
		    {
		
		    	cardregistrationservice.saveOrUpdate(userdetails);
		    }
	
	  @GetMapping("/registration-customer-list")
		  	private List<UserDetails> getAllRegistrationsCount()
		  {
		      return cardregistrationservice.userRegistration();
		  }
    
    
}
