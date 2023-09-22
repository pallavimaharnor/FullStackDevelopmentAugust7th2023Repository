package com.gentech.abstractDemo;
abstract class maths11
{
	abstract void add();
	
	abstract void sub();
	
}

abstract class childclass extends maths11
{
	void add()
	{
		int a=500,b=20;
		System.out.println("addition result:"+(a+b));
		
	}

}
class childclass2 extends childclass
{
	void sub()
	{
		int a=50,b=20;
		System.out.println("subtraction result:"+(a-b));
	}
}

abstract class childclass3 extends maths11
{
	void sub()
	{
		int a=50,b=20;
		System.out.println("subtraction result:"+(a-b));
	}
}

public class HybridWithAbstractClass {

	public static void main(String[] args) {
		childclass2 o1=new childclass2();
		o1.add();
		o1.sub();
		o1.sub();

	}

}
