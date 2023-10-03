package com.example.crud.controller;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.crud.dto.*;
import com.example.crud.entity.*;
import com.example.crud.service.*;
import com.example.crud.response.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {
	 @Autowired
	    private AdminService adminService;
	 @PostMapping(path = "/login")
	    public ResponseEntity<?> loginAdmin(@RequestBody LoginDto loginDTO)
	    {
	        LoginResponse loginResponse = adminService.loginAdmin(loginDTO);
	        return ResponseEntity.ok(loginResponse);
	    }
	 @PutMapping("/admin/{id}")
	    public AdminEntity updateAdmin(@PathVariable("id") Integer id, @RequestBody AdminEntity admin) {
	        return adminService.updateAdminById(id, admin);
	    }
}
