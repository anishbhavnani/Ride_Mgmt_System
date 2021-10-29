package com.driver.userauth.service;

import java.math.BigInteger;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.driver.userauth.dao.UserDao;
import com.driver.userauth.model.DAOUser;
import com.driver.userauth.model.UserDTO;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		/*
		 * if ("anishbhavnani".equals(username)) { return new User("anishbhavnani",
		 * "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6", new
		 * ArrayList<>()); } else { throw new
		 * UsernameNotFoundException("User not found with username: " + username); }
		 */
		 
		  DAOUser user = userDao.findByMobile(new BigInteger(username)); 
		  if (user == null) { 
			  throw new UsernameNotFoundException("User not found with username: " + username); 
		  }
		  return new org.springframework.security.core.userdetails.User(String.valueOf(user.getMobile()),user.getPassword(), new ArrayList<>());
	 	}

	public DAOUser save(UserDTO user) {
		DAOUser newUser = new DAOUser();
		newUser.setMobile(new BigInteger(user.getUsername()));
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userDao.save(newUser);
	}

}