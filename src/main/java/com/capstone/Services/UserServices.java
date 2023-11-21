package com.capstone.Services;

import com.capstone.DTOs.DataResponse;
import com.capstone.DTOs.UserResponse;
import com.capstone.Entities.Users;
import com.capstone.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    private final UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> getUsers(){
        return List.of(
                new UserResponse(
                        "Successful",
                        userRepository.findAll()
                )
        );
    }
    public List<DataResponse> SignUp(Users users){
        Optional<Users> usersOptional = userRepository.findStudentByEmail(users.getEmail());

        if(usersOptional.isPresent()){
            return List.of(
                    new DataResponse(
                            "Failure",
                            "Email has been taken"
                    )
            );
        }
        userRepository.save(users);
        return List.of(
                new DataResponse(
                        "Successful",
                        "Sign Up Successful"
                )
        );
    }
}
