package com.auribises;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2, Object arg3) throws Throwable {
		
		System.out.println("afterReturning executed...");
		System.out.println(method.getName()+" in execution..");
	}

}
