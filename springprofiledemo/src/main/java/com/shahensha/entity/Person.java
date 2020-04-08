package com.shahensha.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Configuration
//@Setter
//@Getter
//@AllArgsConstructor
//@ToString
@Component
@ConfigurationProperties(prefix="person")
public class Person {
	
	//@Value("${person.pid}")
	private Integer pid;
	//@Value("${person.pname}")
	private String pname;
	
	public Person(){
		super();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Person(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
}
