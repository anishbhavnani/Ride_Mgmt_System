package com.driver.register.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.driver.register.model.Address;
import com.driver.register.repository.AddressRepository;
import com.driver.register.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private RedisTemplate<Integer,Address> redisTemplate;
	
	public Address addAddress(Address newAddress) {
		// TODO Auto-generated method stub
		return addressRepository.save(newAddress);
	}

	@Override
	public Address findAddressById(Integer id) {
		// TODO Auto-generated method stub
		final Integer key=id;
		final ValueOperations<Integer,Address> operations=redisTemplate.opsForValue();
		final boolean hasKey=redisTemplate.hasKey(key);
		
		if(hasKey) {
			final Address add=operations.get(key);
			return add;
		}
		
		final Optional<Address> add=Optional.ofNullable(addressRepository.findById(id).get());
		if(add.isPresent()) {
			operations.set(key,add.get(), 10,TimeUnit.SECONDS);
			return add.get();
		}else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		final boolean hasKey=redisTemplate.hasKey(address.getAddressid());
		if(hasKey) {
			redisTemplate.delete(address.getAddressid());			
		}
		return addressRepository.save(address);
	}

	@Override
	public void deleteAddress(Integer id) {
		// TODO Auto-generated method stub
		final boolean hasKey=redisTemplate.hasKey(id);
		if(hasKey) {
			redisTemplate.delete(id);			
		}
		final Optional<Address> addr=Optional.ofNullable(addressRepository.findById(id).get());
		if(addr.isPresent()) {
			addressRepository.deleteById(id);
		}else {
			throw new ResourceNotFoundException();
		}
	}	

}
