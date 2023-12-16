package com.example.webkaendterm.service;

import com.example.webkaendterm.dto.ResponseDTO;
import com.example.webkaendterm.entity.User;


public interface UserService {
    ResponseDTO addUser(User user);

    ResponseDTO logInUser(User user);

}
