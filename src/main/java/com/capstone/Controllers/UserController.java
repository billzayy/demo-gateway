package com.capstone.Controllers;

import com.capstone.DTOs.DataResponse;
import com.capstone.DTOs.UserResponse;
import com.capstone.Entities.Users;
import com.capstone.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class UserController {
    private final UserServices userServices;
    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/users")
    public List<UserResponse> getUser(){
        return userServices.getUsers();
    }

    @PostMapping("/signup")
    public List<DataResponse> SignUp(@RequestBody Users users){
        return userServices.SignUp(users);
    }
}
