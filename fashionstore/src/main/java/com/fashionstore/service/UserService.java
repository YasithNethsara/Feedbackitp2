package com.fashionstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionstore.domain.User;
import com.fashionstore.repository.UserRepository;


	

@Service
public class UserService {

	@Autowired
	private UserRepository Repo;
	
	public List<User>listAll(){
		return Repo.findAll();
	}
	
	public void save(User us) {
		Repo.save(us);
	}
	
	public User get(int id) {
		return Repo.findById((long) id).get();
	}
	public void delete(int id) {
		Repo.deleteById((long) id);
	}
}


