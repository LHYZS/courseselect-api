package com.example.courseselectapi.service;


import com.example.courseselectapi.entity.LoginUser;
import com.example.courseselectapi.utils.ResponseUtil;

public interface SysUserService  {
    ResponseUtil userLogin(LoginUser loginUser);
}
