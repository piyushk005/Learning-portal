package com.example.learningportal.learningportal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginUserDto {
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("password")
	private String password;
	
}
