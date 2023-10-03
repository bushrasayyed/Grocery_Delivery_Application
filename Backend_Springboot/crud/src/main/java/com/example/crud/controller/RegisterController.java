package com.example.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.crud.dto.*;
import java.util.List;

import com.example.crud.entity.*;
import com.example.crud.service.*;
import com.example.crud.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins="http://localhost:4201")
@RequestMapping("/user")
public class RegisterController {

	 @Autowired
	    private UserService userService;
	

	    @PostMapping(path = "/save")
	    public String saveUserRegister(@RequestBody UserDto userDTO)
	    {
	        String id = userService.addUserRegister(userDTO);
	        return id;
	    }
	    @PostMapping(path = "/login")
	    public ResponseEntity<?> loginUserRegister(@RequestBody LoginDto loginDTO)
	    {
	        LoginResponse loginResponse = userService.loginUserRegister(loginDTO);
	        return ResponseEntity.ok(loginResponse);
	    }
	    
	    @GetMapping("/users")
	    public List<UserRegister> getAllUsers() {
	        return userService.fetchAllUsers();
	    }
	    @GetMapping("/users/{id}")
	    public UserRegister getUsersById(@PathVariable("id") Integer id) {
	        return userService.getUsersById(id);
	    }

	    @PutMapping("/users/{id}")
	    public UserRegister updateUserRegister(@PathVariable("id") Integer id, @RequestBody UserRegister register) {
	        return userService.updateUsersById(id, register);
	    }
	    @DeleteMapping("/users/{id}")
	    public String deleteUser(@PathVariable("id") Integer id) {
	        return userService.deleteUserById(id);
	    }
	    
	    
	    
	    
	    
	    
	}