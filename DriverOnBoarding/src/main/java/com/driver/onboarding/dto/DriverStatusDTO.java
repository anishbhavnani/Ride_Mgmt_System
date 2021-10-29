package com.driver.onboarding.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DriverStatusDTO implements Serializable{
			
	 /**
	 * 
	 */
	private static final long serialVersionUID = -5920168759020559841L;

	@Column(unique = true)
    private int driver_id;
	     
	 @NotEmpty(message = "Please enter Y/N for login status")
     private String loginstatus;
	    
    @NotEmpty(message = "Please enter Y/N for ride status")
	@Size(max=1)
    private String ridestatus;

	public int getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}

	public String getLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}

	public String getRidestatus() {
		return ridestatus;
	}

	public void setRidestatus(String ridestatus) {
		this.ridestatus = ridestatus;
	}
			                
		
}