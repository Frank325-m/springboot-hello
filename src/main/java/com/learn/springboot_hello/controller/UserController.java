package com.learn.springboot_hello.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.learn.springboot_hello.entity.User;
import com.learn.springboot_hello.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource // 注入Mapper @Autowired也可以
    private UserMapper userMapper;

    @PostMapping
    public String addUser(@RequestBody User user) {
        userMapper.insert(user);
        return "新增用户成功. ID：" + user.getId();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userMapper.selectById(id);
    }

    @GetMapping
    public List<User> listUser() {
        return userMapper.selectList(Wrappers.emptyWrapper());
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        userMapper.updateById(user);
        return "修改用户成功";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userMapper.deleteById(id);
        return "删除用户成功";
    }
}