package com.app.self.controller;

import com.app.self.dto.SignUp;
import com.app.self.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.app.self.controller.EndpointConstants.FETCH_USER_ID;
import static com.app.self.controller.EndpointConstants.REGISTER_USER;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = REGISTER_USER, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity registerUser(@RequestBody SignUp signUp) {
        log.info("</> Request Endpoint: {}", REGISTER_USER);
        return userService.registerUser(signUp);
    }

    @GetMapping(value = FETCH_USER_ID, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity fetchUser(@PathVariable int id) {
        log.info("</> Request Endpoint: {}", FETCH_USER_ID);
        return userService.fetchUser(id);
    }
}
