package com.security.model;

import java.io.Serializable;

public class JwtResponse implements Serializable{

	private static final long serialVersionUID = -8091879091924046844L;
	private String jwttoken;
	
	public JwtResponse(String jwttoken) {
//		super();
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
	
	
	
	
	
}
