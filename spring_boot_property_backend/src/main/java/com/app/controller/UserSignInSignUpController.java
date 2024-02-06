package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SigninRequest;
import com.app.dto.SigninResponse;
import com.app.dto.Signup;
//import com.app.security.JwtUtils;
import com.app.service.UserService;

@RestController
@RequestMapping("/users")
public class UserSignInSignUpController {
	@Autowired
	private UserService userService;
//	@Autowired
//	private JwtUtils utils;
//
//	@Autowired
//	private AuthenticationManager mgr;

	// sign up
	@PostMapping("/signup")
	public ResponseEntity<?> userSignup(@RequestBody @Valid Signup dto) {
		System.out.println("in sign up " + dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.userRegistration(dto));
	}

	
	@PostMapping("/signin")
	public ResponseEntity<?> signinUser(@RequestBody @Valid SigninRequest reqDTO) {
		System.out.println("in signin " + reqDTO);
		return ResponseEntity
			.ok(new SigninResponse( "Successful Authentication!!!"));
		

//		Authentication verifiedAuth = mgr
//				.authenticate(new UsernamePasswordAuthenticationToken
//						(reqDTO.getEmail(), reqDTO.getPassword()));
//		System.out.println(verifiedAuth.getClass());// Custom user details
//		// => auth success
//		return ResponseEntity
//				.ok(new SigninResponse(utils.generateJwtToken(verifiedAuth), "Successful Authentication!!!"));

	}

}
