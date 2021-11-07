package com.driver.register.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {
	
	//----Start Redis Config Code-----
		@Bean
		JedisConnectionFactory jedisConnecctionFactory() {
			return new JedisConnectionFactory();
		}
		
		@Bean
		RedisTemplate<?,?> redisTemplate(RedisConnectionFactory connectionFactory){ //lettuce config
			RedisTemplate<?,?> redisTemplate=new RedisTemplate<>();
			redisTemplate.setConnectionFactory(jedisConnecctionFactory());
			redisTemplate.setEnableTransactionSupport(true);
			redisTemplate.setKeySerializer(new StringRedisSerializer());
			redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
			return redisTemplate;
		}
		
		public RedisConnectionFactory redisConnectionFactory() { 
			final JedisPoolConfig poolConfig=new JedisPoolConfig();
			poolConfig.setMaxTotal(5);
			poolConfig.setTestOnBorrow(true);
			poolConfig.setTestOnReturn(true);
			
			JedisConnectionFactory connectionFactory =new JedisConnectionFactory();
			return connectionFactory;
		}

		//----End Redis Config Code-----

}
