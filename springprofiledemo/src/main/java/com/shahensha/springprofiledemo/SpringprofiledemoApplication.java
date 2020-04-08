package com.shahensha.springprofiledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.shahensha.entity.Person;

@SpringBootApplication
@EnableConfigurationProperties(Person.class)
public class SpringprofiledemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringprofiledemoApplication.class, args);
	}

}

