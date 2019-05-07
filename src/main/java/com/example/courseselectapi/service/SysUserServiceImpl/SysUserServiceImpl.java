package com.example.courseselectapi.service.SysUserServiceImpl;

import com.example.courseselectapi.dao.SysUserRepository;
import com.example.courseselectapi.entity.LoginUser;
import com.example.courseselectapi.entity.SysUser;
import com.example.courseselectapi.service.SysUserService;
import com.example.courseselectapi.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl  implements SysUserService {
    @Resource
    private SysUserRepository sysUserRepository;

    @Override
    public
    ResponseUtil userLogin(LoginUser loginUser) {
        SysUser sysUser = sysUserRepository.findSysUserByUsername(loginUser.getUsername());
        //邮箱有效
        if (sysUser != null) {
            //判断密码是否正确
            if (loginUser.getPassword().equals(sysUser.getPassword())) {
                return new ResponseUtil(0, "登陆成功", sysUser);
            } else {
                return new ResponseUtil(0, "密码错误");
            }
        } else {
            return new ResponseUtil(0, "账号错误");
        }
    }
}
