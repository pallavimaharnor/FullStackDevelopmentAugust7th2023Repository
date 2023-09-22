package com.gentech.abstractDemo;
abstract class demo11
{
	abstract void add();
	
	abstract void sub();
	
}

abstract class subclass1 extends demo11
{
	void add()
	{
		int a=500,b=20;
		System.out.println("addition result:"+(a+b));
		
	}

}
class subclass2 extends subclass1
{
	void sub()
	{
		int a=50,b=20;
		System.out.println("subtraction result:"+(a-b));
	}
}
public class MultilevelWithAbstractclass {

	public static void main(String[] args) {
		subclass2 o1=new subclass2();
		o1.add();
		o1.sub();

	}

}
