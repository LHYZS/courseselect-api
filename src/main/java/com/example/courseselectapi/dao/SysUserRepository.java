package com.example.courseselectapi.dao;

import com.example.courseselectapi.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    SysUser findSysUserByUsername(String username);
}

