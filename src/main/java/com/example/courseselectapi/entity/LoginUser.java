package com.example.courseselectapi.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author lihongyu
 */
@Data
@Builder
public class LoginUser {
    private String username;
    private String password;

    public
    LoginUser() {
    }

    public
    LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
