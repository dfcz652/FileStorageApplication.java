package com.boots.controller;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
