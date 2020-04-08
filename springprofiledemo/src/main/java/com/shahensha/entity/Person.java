package com.shahensha.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Configuration
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
}
