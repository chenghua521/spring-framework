package com.cheng.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;


public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization被执行！！！");
		if ("user".equals(beanName)){
			System.out.println("init before:" + bean);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor.postProcessAfterInitialization被执行！！！");
		if ("user".equals(beanName)){
			System.out.println("init after:" + bean);
		}
		return bean;
	}
}
