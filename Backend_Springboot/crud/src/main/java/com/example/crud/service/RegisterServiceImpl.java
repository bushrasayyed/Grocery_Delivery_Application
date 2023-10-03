package com.example.crud.service;

import com.example.crud.dto.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import com.example.crud.repository.*;
import com.example.crud.entity.*;
import com.example.crud.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class RegisterServiceImpl implements UserService {
    @Autowired
    private RegisterRepository userRepo;
   
    @Override
    public String addUserRegister(UserDto userDTO) {
        UserRegister user = new UserRegister(
        		userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getEmail(),
               userDTO.getPassword()
        );
        userRepo.save(user);
        return user.getUsername();
    }
    UserDto userDTO;
    @Override
    public LoginResponse  loginUserRegister(LoginDto loginDTO) {
        String msg = "";
        UserRegister user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            
            Boolean isPwdRight = password.matches(encodedPassword);
            if (isPwdRight) {
                Optional<UserRegister> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email does not exits", false);
        }
    }
    
    @Override
    public List<UserRegister> fetchAllUsers() {
        List<UserRegister> allUsers = userRepo.findAll();//select the records from db table
        return allUsers;
    } 
    
    @Override
    public UserRegister getUsersById(Integer id) {
        Optional<UserRegister> users = userRepo.findById(id);//get the values based on customer requirement
        if (users.isPresent()) {
            return users.get();
        }
        return null;
    }
     
    @Override
    public UserRegister updateUsersById(Integer id, UserRegister register) {//based on selected id we are going to edit(Update) the record here
        Optional<UserRegister> register1 = userRepo.findById(id);

        if (register1.isPresent()) {
        	UserRegister originalUserRegister = register1.get();

            if (Objects.nonNull(register.getUsername()) && !"".equalsIgnoreCase(register.getUsername())) {
            	originalUserRegister.setUsername(register.getUsername());
            }
            if (Objects.nonNull(register.getEmail()) && !"".equalsIgnoreCase(register.getEmail())) {
            	originalUserRegister.setEmail(register.getEmail());
            }
            if (Objects.nonNull(register.getPassword()) && !"".equalsIgnoreCase(register.getPassword())) {
            	originalUserRegister.setPassword(register.getPassword());
            }
            return userRepo.save(originalUserRegister);
        }
        return null;
    }

    @Override
    public String deleteUserById(Integer id) {//deleting the records from the mysql db table
        if (userRepo.findById(id).isPresent()) {
            userRepo.deleteById(id);
            return "User deleted successfully";
        }
        return "No such user in the database";//table not present unable to delete the record
    }

    
    
}