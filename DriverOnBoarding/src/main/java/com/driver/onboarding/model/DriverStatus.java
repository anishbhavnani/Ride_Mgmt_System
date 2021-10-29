package com.driver.onboarding.model;

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
@Table(name = "driverstatus")
@Getter
@Setter
public class DriverStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @Column(unique = true)
    private int driver_id;
     
    @Column(nullable = false, length = 1)
    private String loginstatus;
    
    @Column(nullable = false, length = 1)
    private String ridestatus;
	                
	@Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate created_date;

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

	public LocalDate getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}		
		
	
}