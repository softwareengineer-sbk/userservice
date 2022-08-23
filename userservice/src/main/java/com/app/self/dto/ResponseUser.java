package com.app.self.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter @Builder
@AllArgsConstructor
public class ResponseUser {

    private String username;
    private Set<String> roles;
}
