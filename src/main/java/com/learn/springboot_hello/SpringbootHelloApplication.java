package com.learn.springboot_hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.learn.springboot_hello.mapper")
@SpringBootApplication
@RestController
public class SpringbootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello SpringBoot! JDK21 + VSCode";
	}
}
