package com.cheng.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor的postProcessBeforeInstantiation方法在实例创建之前执行！！！");
		if ("user".equals(beanName)){
			System.out.println("InstantiationAwareBeanPostProcessor的postProcessBeforeInstantiation方法在实例创建之前执行！！！ " + beanClass);
		}

		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor的postProcessAfterInstantiation方法在实例创建之后执行！！！");
		if ("user".equals(beanName)){
			System.out.println("InstantiationAwareBeanPostProcessor的postProcessAfterInstantiation方法在实例创建之后执行！！！:" + bean);
		}
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}
}
