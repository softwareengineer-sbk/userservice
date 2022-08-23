package com.app.self.exception;

import lombok.Getter;

@Getter
public class UserNotFoundException extends Exception {
    private final String message;

    public UserNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
