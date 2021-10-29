package com.driver.onboarding.util;

import java.time.LocalDateTime;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public abstract class DateEntity {

	@Column(updatable=false)
	@CreationTimestamp
	private LocalDateTime created_date;
	
	@UpdateTimestamp
	private LocalDateTime updated_date;
}
