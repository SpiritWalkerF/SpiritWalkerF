package com.sun.mall.service.impl;

import com.sun.mall.mapper.UserMapper;
import com.sun.mall.model.User;
import com.sun.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 注入mapper到service层
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
