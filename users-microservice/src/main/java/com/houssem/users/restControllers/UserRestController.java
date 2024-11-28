package com.houssem.users.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.houssem.users.entities.User;
import com.houssem.users.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {

	@Autowired
	UserService userService;
	
	//@RequestMapping(path="all",method = RequestMethod.GET)
	@GetMapping("all")
	public List<User>getAlUsers(){
		return userService.findAllUsers();
		
	}
}
