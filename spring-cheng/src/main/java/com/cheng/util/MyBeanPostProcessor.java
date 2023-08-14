package com.cheng.util;

import com.cheng.bean.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;


public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization被执行！！！");
		if ("user".equals(beanName)){
			System.out.println("BeanPostProcessor.postProcessBeforeInitialization方法可以提供自己的实例化逻辑！");
			System.out.println("init before:" + bean);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("MyBeanPostProcessor.postProcessAfterInitialization被执行！！！");
		User user;
		if ("user".equals(beanName)){
			System.out.println("BeanPostProcessor.postProcessAfterInitialization方法修改了bean的Name值！");
			user = (User) bean;
			user.setName("李四");
			System.out.println("init after:" + bean);
		}
		return bean;
	}
}
