package com.shop;

import org.springframework.boot.test.context.SpringBootTest;
// 추가사항
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

@SpringBootTest
public class ShopApplicationTests {
	public static void main(String[] args){
		SpringApplication.run(ShopApplication.class, args);
	}
	
// 추가사항
@GetMapping(value = "/")
public String Helloworld(){
	return "Hello world";
}

}
