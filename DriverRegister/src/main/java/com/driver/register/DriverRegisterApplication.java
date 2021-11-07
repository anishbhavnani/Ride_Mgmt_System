package com.driver.register;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.driver.register.model.Driver;

@SpringBootApplication
public class DriverRegisterApplication {

	//----Start message.properties Config Code-----
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource msgSource=new ReloadableResourceBundleMessageSource();
		msgSource.setBasename("classpath:message");
		msgSource.setDefaultEncoding("UTF-8");
		return msgSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator(MessageSource msgSource) {
		LocalValidatorFactoryBean bean=new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(msgSource);
		return bean;
	}
	//----End message.properties Config Code-----
	
	public static void main(String[] args) {
		System.out.println("started");
		SpringApplication.run(DriverRegisterApplication.class, args);
	}
}
