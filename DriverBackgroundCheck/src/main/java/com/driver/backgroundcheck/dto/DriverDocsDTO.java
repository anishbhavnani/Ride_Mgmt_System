package com.driver.backgroundcheck.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DriverDocsDTO {
			
    private int driver_id;
     
    private int car_id;
    
    @NotEmpty(message = "Please enter license numbber")
	@Size(min=8, max=12)
    private String license_number;
	
    @Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate license_expire_date	;		
    
    @Column(nullable = false)
    private int identity_type;
         
    @NotEmpty(message = "Please enter car identity")
	@Size(min=8, max=12)
    private String identity_number;
            	
	public int getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}		

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getLicense_number() {
		return license_number;
	}

	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}

	public LocalDate getLicense_expire_date() {
		return license_expire_date;
	}

	public void setLicense_expire_date(LocalDate license_expire_date) {
		this.license_expire_date = license_expire_date;
	}

	public int getIdentity_type() {
		return identity_type;
	}

	public void setIdentity_type(int identity_type) {
		this.identity_type = identity_type;
	}

	public String getIdentity_number() {
		return identity_number;
	}

	public void setIdentity_number(String identity_number) {
		this.identity_number = identity_number;
	}	
	
}