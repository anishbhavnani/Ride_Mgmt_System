package com.driver.register.model;

import java.math.BigInteger;
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
@Table(name = "address")
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="addressid")
	private int addressid;
	
	@Column(nullable = false)
	private int driverId;		
	
    @Column(nullable = false, length = 50)
    private String address1;
     
    @Column(nullable = false, length = 50)
    private String address2;
    
    @Column(nullable = false, length = 20)
    private String city;
    
    @Column(nullable = false, length = 20)
    private String state;
    
    @Column(nullable = false, length = 20)
    private String country;
    
    @Column(nullable = false)
    private long zipcode;

    @Column(nullable = false, length = 1)
    private String type;
    
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
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
                
}