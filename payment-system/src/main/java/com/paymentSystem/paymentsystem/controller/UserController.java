package com.paymentSystem.paymentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paymentSystem.paymentsystem.dto.Users;
import com.paymentSystem.paymentsystem.repository.UsersRepository;

@RestController
@RequestMapping("/api/")
public class UserController {

	@Autowired
	private UsersRepository userService;

	@PostMapping("user")
	public String saveUser(@RequestBody Users users) {

		if (users != null) {
			userService.save(users);
			return "successful";
		}
		return "unsuccessful";
	}

//	@PutMapping("user")
//	public List<Users> updateUser(@RequestBody Users student) {
//		return userService.updateUser(student);
//	}

//	@GetMapping("user")
//	public Users getUserById(@RequestParam String id) {
//		return userService.getUserById(id);
//	}
//
//	@GetMapping("user/all")
//	public List<List<Users>> getALl() {
//		return userService.getAllUser();
//	}
//
//	@DeleteMapping("user/{id}")
//	public ResponseStructure<Users> deleteUser(@PathVariable String id) {
//		return userService.deleteUserById(id);
//	}

}
