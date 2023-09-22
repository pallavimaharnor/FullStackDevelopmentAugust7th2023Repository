package com.gentech.abstractDemo;
abstract class maths
{
	{
		int a=10,b=20;
		System.out.println("addition result is:"+(a+b));
	}
}

class block extends maths
{
	
}
public class InstanceBlock {

	public static void main(String[] args) {
		block o=new block();

	}

}
