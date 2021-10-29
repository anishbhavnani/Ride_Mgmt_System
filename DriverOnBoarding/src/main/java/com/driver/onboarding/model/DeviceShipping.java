package com.driver.onboarding.model;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "device_shipping")
@Getter
@Setter
public class DeviceShipping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
			
    @Column(unique = true)
    private int driver_id;
    
    @Column(unique = true)
    private int device_id;
    
    @Column(nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate shipping_date;

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

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public LocalDate getShipping_date() {
		return shipping_date;
	}

	public void setShipping_date(LocalDate shipping_date) {
		this.shipping_date = shipping_date;
	}		

		
}