package com.driver.register.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@PropertySource("classpath:message.properties")
public class AddressDTO {
				
	@NotEmpty(message = "{driver.address1.required}")
    private String address1;
     
	@NotEmpty(message = "{driver.address2.required}")
    private String address2;
    
	@NotEmpty(message = "{driver.city.required}")
    private String city;
    
	@NotEmpty(message = "{driver.state.required}")
    private String state;
    
	@NotEmpty(message = "{driver.country.required}")
	@Size(min=3, max=20)
    private String country;
    	
    private long zipcode;
	
	@Column(nullable = false)
	private int driver_id;
	
	@Column(nullable = false)
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

	public int getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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