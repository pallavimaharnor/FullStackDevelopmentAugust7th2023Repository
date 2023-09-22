package com.gentech.abstractDemo;
abstract class demo
{
	static void add()
	{
		int a=50,b=20;
		System.out.println("addition result:"+(a+b));
		
	}
	static void sub()
	{
		int a=50,b=20;
		System.out.println("subtraction result:"+(a-b));
	}
}


public class StaticmethodDemo {

	public static void main(String[] args) {
		
		demo.add();
		demo.sub();
		

	}

}
