package com.app.self.service;

import com.app.self.dto.SignUp;
import com.app.self.entity.Role_EO;
import com.app.self.entity.User_EO;
import com.app.self.exception.UserNotFoundException;
import com.app.self.repository.Role_EORepository;
import com.app.self.repository.User_EORepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static com.app.self.exception.MessageConstants.*;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final User_EORepository userEORepository;
    private final Role_EORepository roleEORepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(User_EORepository userEORepository, Role_EORepository roleEORepository, PasswordEncoder passwordEncoder) {
        this.userEORepository = userEORepository;
        this.roleEORepository = roleEORepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public ResponseEntity registerUser(SignUp signUp) {
        log.info("</> Started registering user");
        try {
            log.info("</> Success {}", USER_REGISTERED);
            userEORepository.save(mapToUser_EO(signUp));
            return ResponseEntity.accepted().body(USER_REGISTERED);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("</> Success {}", USER_NOT_REGISTERED);
            return ResponseEntity.badRequest().body(USER_NOT_REGISTERED);
        }
    }

    private User_EO mapToUser_EO(SignUp signUp) {
        String username = signUp.getUsername();
        String password = passwordEncoder.encode(signUp.getPassword());
        Collection<Role_EO> role_eos = roleEORepository.findByIdIn(signUp.getRoleIds());
        return new User_EO(username, password, role_eos);
    }

    @Override
    public ResponseEntity fetchUser(int id) {
        log.info("</> Started finding user by id");
        try {
            User_EO user_eo = userEORepository.findById(id).orElseThrow(() -> new UserNotFoundException(USER_WITH_THIS_ID_NOT_EXIST));
            log.info("</> Success {}", USER_FOUND);
            return ResponseEntity.ok().body(user_eo);
        } catch (UserNotFoundException e) {
            log.info("</> Failure {}", USER_NOT_FOUND);
            return ResponseEntity.ok().body(e.getMessage());
        }
    }
}
