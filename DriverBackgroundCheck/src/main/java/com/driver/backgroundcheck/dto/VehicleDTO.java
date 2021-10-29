package com.driver.backgroundcheck.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDTO {
				
	@NotEmpty(message = "Please enter car company")
	@Size(min=1, max=15)
    private String company; //car company/brand..Eg: tata, maruti
     
	@NotEmpty(message = "Please enter car model")
	@Size(min=1, max=10)
    private String model; // car model
    
    private int type; //2,3,4 wheeler etc.
    
    private int seater;

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