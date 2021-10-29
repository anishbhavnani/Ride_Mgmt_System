package com.driver.onboarding.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeviceShippingDTO implements Serializable{

	    /**
	 * 
	 */
	private static final long serialVersionUID = 7831403533658014763L;

	 
	    private int driver_id;
	    private int device_id;
	    
		@JsonFormat(pattern="yyyy-MM-dd")
		private LocalDate shipping_date;

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