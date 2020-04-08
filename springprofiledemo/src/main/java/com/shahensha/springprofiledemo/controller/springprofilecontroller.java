package com.shahensha.springprofiledemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shahensha.entity.Person;

@RestController
@RequestMapping("hello")
public class springprofilecontroller {
	
	@Autowired
	private Environment envi;
	
	@Autowired
	private Person person;
	
	@RequestMapping(method=RequestMethod.GET,value="hi")
	public String displayMsg() {
		
		String property = envi.getProperty("my.msg");
		return "Welcome " + property;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="pers")
	public Person displayPersonDetails() {

		person.getPid();
		person.getPname();
		
		System.out.println("---------------------------");
		System.out.println(person.getPid());
		System.out.println("---------------------------");
		return person;
	}

}
