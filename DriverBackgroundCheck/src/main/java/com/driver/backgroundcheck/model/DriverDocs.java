package com.driver.backgroundcheck.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "driver_docs")
@Getter
@Setter
public class DriverDocs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
			
    @Column(unique = true)
    private int driver_id;
     
    @Column
    private int car_id;
    
    @Column(nullable = false, length = 10)
    private String license_number;
	
    @Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate license_expire_date	;		
    
    @Column(nullable = false)
    private int identity_type;
     
    @Column(nullable = false, length = 12)
    private String identity_number;
            
	@Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate created_date;		

	@Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate updated_date;	
	
	@Column(nullable = false)
	private int created_by;	
	
	@Column(nullable = false)
	private int updated_by;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public LocalDate getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}

	public LocalDate getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDate updated_date) {
		this.updated_date = updated_date;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}
	
	
}