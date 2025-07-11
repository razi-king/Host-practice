package com.example.FirstRestAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.FirstRestAPI.pojo.User;

@RestController
@RequestMapping("*")
public class UserController {

	List<User> ul = new ArrayList<>();

    
	@GetMapping
	public String home() {
		return "Welcome";
		
	}
	@GetMapping("First")
	public String  first() {
		return "First Request";
	}
	@GetMapping("list")
	public List<User> list() {
		return ul;
	}
	@PostMapping("First")
	public String addUser(@RequestBody User user) {
		ul.add(user);
		System.out.println(user);
		return "Success";
	}
}
