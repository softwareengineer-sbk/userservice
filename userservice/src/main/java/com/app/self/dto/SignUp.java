package com.app.self.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter @Builder
@AllArgsConstructor
public class SignUp {

    private String username;
    private String password;
    private Set<Integer> roleIds;
}
