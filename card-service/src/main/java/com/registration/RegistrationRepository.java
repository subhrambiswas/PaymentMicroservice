package com.registration;


import org.springframework.data.jpa.repository.JpaRepository; 

public interface RegistrationRepository extends JpaRepository<UserDetails, Integer> {

}
