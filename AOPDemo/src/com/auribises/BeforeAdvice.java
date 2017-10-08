package com.auribises;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {

		System.out.println("before executed...");
		System.out.println(method.getName()+" in execution..");

		System.out.println("objArr..");
		for(Object o : objArr){
			System.out.print(o+" - ");
		}
		System.out.println();
		System.out.println("obj is: "+obj);
	}
}
