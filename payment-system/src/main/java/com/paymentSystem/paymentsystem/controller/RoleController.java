package com.paymentSystem.paymentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paymentSystem.paymentsystem.dto.Role;
import com.paymentSystem.paymentsystem.repository.RoleRepository;

@RestController
@RequestMapping("/api/")
public class RoleController {
	@Autowired
	private RoleRepository x;

	@PostMapping("rolesave")
	public String t(@RequestBody Role role) {
		x.save(role);
		return "done";
	}

	@GetMapping("roleget")
	public Role roleget(@RequestParam int id) {
		List<Role> list = x.findAll();
		for (Role iterator : list)
			if (iterator.getRoleId() == id)
				return iterator;
		return null;
	}
}
