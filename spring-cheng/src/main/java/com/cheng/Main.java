package com.cheng;

import com.cheng.bean.People;
import com.cheng.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = context.getBean("user", User.class);
		//People people = context.getBean("people", People.class);
		//System.out.println(people);
		user.hello();
	}
}
