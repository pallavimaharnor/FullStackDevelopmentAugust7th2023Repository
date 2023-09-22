package com.gentech.abstractDemo;
abstract class maths1
{
	static 
	{
		int a=50,b=20;
		System.out.println("subtraction result:"+(a-b));
	}
}

class block1 extends maths1
{
	
}
public class StaticBlockDemo {

	public static void main(String[] args) {
		block1 o=new block1();

	}

}
