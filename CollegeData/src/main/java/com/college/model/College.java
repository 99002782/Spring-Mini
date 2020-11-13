package com.college.model;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="college")
@TypeAlias("college")
public class College {
    @Id
    Integer code;
    String name;
    Integer totalstu;
    Address address;
	public College(Integer code, String name, Integer totalstu, Address address) {
		super();
		this.code = code;
		this.name = name;
		this.totalstu = totalstu;
		this.address = address;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalstu() {
		return totalstu;
	}
	public void setTotalstu(Integer totalstu) {
		this.totalstu = totalstu;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "College [code=" + code + ", name=" + name + ", totalstu=" + totalstu + ", address=" + address + "]";
	}
    
	
	
}
