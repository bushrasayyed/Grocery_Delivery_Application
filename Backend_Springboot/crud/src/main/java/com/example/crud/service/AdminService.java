package com.example.crud.service;
import com.example.crud.dto.*;


import com.example.crud.response.*;
import com.example.crud.entity.*;


public interface AdminService {
	 String addUserRegister(AdminDto adminDTO);
	LoginResponse loginAdmin(LoginDto loginDTO);
	AdminEntity updateAdminById(Integer id, AdminEntity admin);
	
	
}
