package com.learn.springboot_hello.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data // Lombok注解，自动生成get/set/toString等方法
@TableName("user") // 对应数据库表名
public class User {

    @TableId(type = IdType.AUTO) //主键自增
    private Long id;
    private String username;
    private Integer age;
    private LocalDateTime createTime; // 驼峰对应数据库create_time
}