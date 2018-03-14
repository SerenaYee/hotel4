package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author 叶佳
 */

@Mapper
@Repository
public interface UserMapper {
    @Select("select user_id from user where username=#{username}")
    int selectUserIdByName(String username);
}