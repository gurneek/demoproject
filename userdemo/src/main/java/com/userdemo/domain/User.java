package com.userdemo.domain;

import javax.validation.constraints.AssertFalse;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User implements Serializable
{
	private static final long serialVersionUID = 4657462015039726030L;
	
	@NotEmpty(message = "Please enter your first name")
	private String FirstName;
    
	@NotEmpty(message = "Please enter your last name")
	private String LastName;

	@NotEmpty(message = "Please enter your email address")
	private String Email;
	
	@NotEmpty(message = "Please enter your username")
	private String username;
	
	@NotEmpty(message = "Please enter your password")
	private String password;
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}



