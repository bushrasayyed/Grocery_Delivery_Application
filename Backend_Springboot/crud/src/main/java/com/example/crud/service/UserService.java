package com.example.crud.service;
import com.example.crud.dto.*;
import com.example.crud.entity.UserRegister;

import java.util.List;


import com.example.crud.response.*;
public interface UserService {
    String addUserRegister(UserDto userDTO);
    LoginResponse loginUserRegister(LoginDto loginDTO);
    List<UserRegister> fetchAllUsers();
    UserRegister getUsersById(Integer id);
    UserRegister updateUsersById(Integer id, UserRegister users);
    String deleteUserById(Integer id);
    
}

