package com.auribises;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String str) throws BeansException {
		System.out.println("postProcessAfterInitialization executed");
		
		System.out.println("bean is: "+bean+" and str is "+str);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String str) throws BeansException {
		System.out.println("postProcessBeforeInitialization executed");
		return bean;
	}

}
