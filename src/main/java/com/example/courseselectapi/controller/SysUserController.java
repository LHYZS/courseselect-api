package com.example.courseselectapi.controller;

import com.example.courseselectapi.entity.LoginUser;
import com.example.courseselectapi.service.SysUserService;
import com.example.courseselectapi.utils.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lihongyu
 */
@RestController
@CrossOrigin("*")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public
    ResponseUtil signIn(LoginUser loginUser) {
        System.out.println(loginUser);
        return sysUserService.userLogin(loginUser);
    }
}