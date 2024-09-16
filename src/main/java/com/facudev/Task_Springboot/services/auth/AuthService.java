package com.facudev.Task_Springboot.services.auth;

import com.facudev.Task_Springboot.dto.SignupRequest;
import com.facudev.Task_Springboot.dto.UserDto;

public interface AuthService {


    UserDto signupUser(SignupRequest signupRequest);
    boolean hasUserWithEmail(String email);


}
