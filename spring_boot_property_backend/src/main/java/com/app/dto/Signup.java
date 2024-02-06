package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.app.entities.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Signup {
	@JsonProperty(access = Access.READ_ONLY) // this property only used during ser.
	private Long id;
	@NotBlank(message = "First Name required")
	private String firstName;
	private String lastName;
	@Email(message = "Invalid Email!!!")
	private String email;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	@NotBlank(message = "Please Enter Address!!!")
	private String address;
	@NotBlank(message = "Please Enter Mobile Number!!!")
	private String contactNo;
	private UserRole role;
	public Signup(Long id, @NotBlank(message = "First Name required") String firstName, String lastName,
			@Email(message = "Invalid Email!!!") String email, String password,
			@NotBlank(message = "Please Enter Address!!!") String address,
			@NotBlank(message = "Please Enter Mobile Number!!!") String contactNo, UserRole role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contactNo = contactNo;
		this.role = role;
	}
	
	
	
}
