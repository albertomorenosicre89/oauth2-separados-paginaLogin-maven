package com.santander.oauth2.resourcelogin.model;

import java.io.Serializable;

public class Car implements Serializable {

    private Long id = null;

    private String registrationNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

    
    
}
