package com.formationsec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableSwagger2
//@Import(SpringDataRestConfiguration.class)
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}