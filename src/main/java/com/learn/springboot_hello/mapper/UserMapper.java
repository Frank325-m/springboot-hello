package com.learn.springboot_hello.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.springboot_hello.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}