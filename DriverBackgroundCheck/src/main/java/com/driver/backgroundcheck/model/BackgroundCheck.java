package com.driver.backgroundcheck.model;

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
@Table(name = "driverbgc")
@Getter
@Setter
public class BackgroundCheck {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
			
    @Column(unique = true)
    private int driver_id;
     
    @Column(nullable = false, length = 1)
    private String verify_status;
    
    @Column(nullable = false, length = 50)
    private String verify_comments;
	
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

	public String getVerify_status() {
		return verify_status;
	}

	public void setVerify_status(String verify_status) {
		this.verify_status = verify_status;
	}

	public String getVerify_comments() {
		return verify_comments;
	}

	public void setVerify_comments(String verify_comments) {
		this.verify_comments = verify_comments;
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