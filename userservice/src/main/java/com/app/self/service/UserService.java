package com.app.self.service;

import com.app.self.dto.SignUp;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity registerUser(SignUp signUp);

    ResponseEntity fetchUser(int id);
}
