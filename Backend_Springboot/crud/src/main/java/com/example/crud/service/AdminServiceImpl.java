package com.example.crud.service;
import com.example.crud.dto.*;

import com.example.crud.entity.*;
import com.example.crud.repository.*;
import com.example.crud.response.*;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepo;
    @Override
    public String addUserRegister(AdminDto adminDTO) {
        AdminEntity user = new AdminEntity(
        		adminDTO.getAdminid(),
        		adminDTO.getAdminName(),
        		adminDTO.getEmail(),
        		adminDTO.getPassword()
        );
        adminRepo.save(user);
        return user.getAdminName();
    }
    AdminDto adminDTO;
    
    @Override
    public LoginResponse  loginAdmin(LoginDto loginDTO) {
        String msg = "";
        AdminEntity admin1 = adminRepo.findByEmail(loginDTO.getEmail());
        if (admin1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = admin1.getPassword();
            
            Boolean isPwdRight = password.matches(encodedPassword);
            if (isPwdRight) {
                Optional<AdminEntity> user = adminRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Sorry Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email does not exits", false);
        }
    }
    
   public AdminEntity updateAdminById(Integer id, AdminEntity admin) {
        Optional<AdminEntity> admin1 = adminRepo.findById(id);

        if (admin1.isPresent()) {
        	AdminEntity originalAdmin = admin1.get();

            if (Objects.nonNull(admin.getAdminName()) && !"".equalsIgnoreCase(admin.getAdminName())) {
            	originalAdmin.setAdminName(admin.getAdminName());
            }
            if (Objects.nonNull(admin.getEmail()) && !"".equalsIgnoreCase(admin.getEmail())) {
            	originalAdmin.setEmail(admin.getEmail());
            }
            if (Objects.nonNull(admin.getPassword()) && !"".equalsIgnoreCase(admin.getPassword())) {
            	originalAdmin.setPassword(admin.getPassword());
            }
            return adminRepo.save(originalAdmin);
        }
        return null;
    }
    

}
