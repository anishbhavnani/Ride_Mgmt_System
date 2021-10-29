package com.driver.backgroundcheck.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BackGroundCheckDTO implements Serializable{

	    /**
	 * 
	 */
	private static final long serialVersionUID = 7831403533658014763L;

		private int driver_id;
	     
	    @NotEmpty(message = "Please confirm if driver is verified (Y/N) ")
		@Size(max=1)
	    private String verify_status;
	    
	    @NotEmpty(message = "Please provide verification comments")
		@Size(min=2, max=50)
	    private String verify_comments;

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
			    
	    
	    
}