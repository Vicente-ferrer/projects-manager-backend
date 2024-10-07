package com.vicente.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
