package com.fight_club.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fight_club.model.User;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<User> getUsersById(@PathVariable ("userId") Integer id) {
		
		List<User> users = new ArrayList<>();
		 User user1 = new User(1,"code", "niroj", "N@gmail.com", "235ablite");
		 user1.setId(id);
		 users.add(user1);
		 	
		 return users;
	}
	
	@GetMapping("/users/{userId}")
	public User getUserById(@PathVariable ("userId") Integer id) {
		
		User user1 = new User(2,"code", "niroj", "N@gmail.com", "235ablite");
		user1.setId(id);
		
		return user1;
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		User newUser = new User();
		newUser.setEmail(user.getEmail());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setPassword(user.getPassword());
		newUser.setId(user.getId());
		
		return newUser;
		
	}
	
	@PutMapping("/users1")
	public User updateUser(@RequestBody User user) {
		User user1 = new User(2,"code", "niroj", "N@gmail.com", "235ablite");
		
		if(user.getFirstName()!=null) {
			user1.setFirstName(user.getFirstName());
		}
		
		if(user.getLastName() != null) {
			user1.setLastName(user.getLastName());
		}
		
		if(user.getEmail() != null) {
			user1.setEmail(user.getEmail());
		}
		
		return user1;
		
	}
	
	@DeleteMapping("/delete/{userId}")
	public String deleteUser(@PathVariable ("userId") Integer userId) {
		
		return "User deleted successfully"+userId;
	}
	
	

}
