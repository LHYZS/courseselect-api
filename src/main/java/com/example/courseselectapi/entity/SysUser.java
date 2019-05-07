package com.example.courseselectapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author lihongyu
 */
@Entity
@Data
public class SysUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;
    private String avatar;
    private String name;

    public
    SysUser() {
    }

    public
    SysUser(String username, String password, String avatar, String name) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.name = name;
    }
}
