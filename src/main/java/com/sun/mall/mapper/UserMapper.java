package com.sun.mall.mapper;

import com.sun.mall.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User selectUserById(Integer id);
}
