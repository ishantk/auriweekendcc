package com.auribises.generics;

import java.util.ArrayList;
import java.util.List;

class Point<T,U>{
	
	T x,y;
	U z;
	
	Point(T x, T y, U z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+":"+y+":"+z);
	}
}

public class Templates {

	public static void main(String[] args) {
		
		Point<Integer,Float> p1 = new Point<Integer,Float>(10,20,2.2f);
		p1.showPoint();
		
		Point<Double,String> p2 = new Point<Double,String>(10.1,20.2,"Three");
		p2.showPoint();
		
		Number n = new Integer(10);
		n = new Float(2.2f);
		
		List<?> list1 = new ArrayList<Integer>();
		List<? extends Number> list2 = new ArrayList<Integer>();

	}

}
