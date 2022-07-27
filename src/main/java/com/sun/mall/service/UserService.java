package com.sun.mall.service;

import com.sun.mall.model.User;

public interface UserService {
    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User selectUserById(Integer id);
}
