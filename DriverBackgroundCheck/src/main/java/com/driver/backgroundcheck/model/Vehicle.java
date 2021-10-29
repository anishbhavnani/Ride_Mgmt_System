package com.driver.backgroundcheck.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicleid")
	private int vehicleid;
	
    @Column(nullable = false, length = 15)
    private String company; //car company/brand..Eg: tata, maruti
     
    @Column(nullable = false, length = 10)
    private String model; // car model
    
    @Column(nullable = false)
    private int type; //2,3,4 wheeler etc.
    
    @Column(nullable = false)
    private int seater;

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}
        
                     
}