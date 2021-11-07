package com.driver.register.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.annotation.Transient;

import com.driver.register.model.Address;
import com.driver.register.util.ValidMobile;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@PropertySource("classpath:message.properties")
public class DriversDTO implements Serializable{

	private int id;
			
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "{driver.email.required}")
    private String email;
     
	@NotEmpty(message = "{driver.password.required}")
    private String password;
	
	@NotEmpty(message = "{driver.cfpassword.required}")
	@Transient
    private String confirmpassword;
     
	@NotEmpty(message = "{driver.firstname.required}")
    private String first_name;
     
	@NotEmpty(message = "{driver.lastname.required}")
    private String last_name;
	
	private int countrycode;
	
	private String status;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;	
		
	@ValidMobile
	private BigInteger mobile;	
		
	@Column(nullable = false, length = 1)
	private String gender;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="driverid")	
	private List<Address> driverAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public BigInteger getMobile() {
		return mobile;
	}

	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Address> getDriverAddress() {
		return driverAddress;
	}

	public void setDriverAddress(List<Address> driverAddress) {
		this.driverAddress = driverAddress;
	} 
	
	

}