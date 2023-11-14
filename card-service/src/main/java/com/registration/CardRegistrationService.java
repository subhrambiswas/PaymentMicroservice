package com.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardRegistrationService {

	@Autowired
	private RegistrationRepository registrationrepository;
	
	public void saveOrUpdate(UserDetails userdetails) {
		// TODO Auto-generated method stub
		
		registrationrepository.save(userdetails);
	}

	public List<UserDetails> userRegistration()
    {

        List<UserDetails> userdetails = new ArrayList<UserDetails>();
        registrationrepository.findAll().forEach(userdetails::add);

        return userdetails;
    }
}
