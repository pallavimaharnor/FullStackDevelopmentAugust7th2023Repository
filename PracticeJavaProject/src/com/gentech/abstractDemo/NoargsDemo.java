package com.gentech.abstractDemo;
abstract class addition
{
	addition()
	{
		int a=100,b=20;
		System.out.println("addition result:"+(a+b));
	}
}
class subclass extends addition
{
	
}
public class NoargsDemo {

	public static void main(String[] args) {
		subclass o1=new subclass();

	}

}
