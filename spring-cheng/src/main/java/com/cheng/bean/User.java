package com.cheng.bean;

public class User {
	private String id;
	private String name;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public User() {
		System.out.println("创建bean实例！！");
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello(){
		System.out.println("hello " + name + "!");
	}

	@Override
	public String toString() {
		return "User{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
	}
}
