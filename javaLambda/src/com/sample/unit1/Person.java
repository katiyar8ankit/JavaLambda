package com.sample.unit1;

public class Person {
	
	String firtsname;
	String lastname;
	int age;
	
	public Person(String firtsname, String lastname, int age) {
		super();
		this.firtsname = firtsname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public String getFirtsname() {
		return firtsname;
	}
	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [firtsname=" + firtsname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	

}
