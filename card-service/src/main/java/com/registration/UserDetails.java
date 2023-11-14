package com.registration;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uniqueIdentifierNumber;
	
	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private Timestamp timestamp;
	
	@Column(name = "First_Name")
	private String name;
	
	@Column(name = "Last_Name")
	private String surname;
	
	@Column(name = "Phone_Number")
	private String phoneno;
	
	@Column(name = "Payment_Type")
	private String paymentInstrument;
	
	@Column(name = "Email_Id")
	private String emailId;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserDetails(String name, String surname, long uniqueIdentifierNumber, String phoneno,
			String paymentInstrument, String emailId, Address addressdetails) {
		super();
		this.name = name;
		this.surname = surname;
		this.uniqueIdentifierNumber = uniqueIdentifierNumber;
		this.phoneno = phoneno;
		this.paymentInstrument = paymentInstrument;
		this.emailId = emailId;
		this.address = addressdetails;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getUniqueIdentifierNumber() {
		return uniqueIdentifierNumber;
	}
	public void setUniqueIdentifierNumber(long uniqueIdentifierNumber) {
		this.uniqueIdentifierNumber = uniqueIdentifierNumber;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPaymentInstrument() {
		return paymentInstrument;
	}
	public void setPaymentInstrument(String paymentInstrument) {
		this.paymentInstrument = paymentInstrument;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}


	
	
	
	

}
