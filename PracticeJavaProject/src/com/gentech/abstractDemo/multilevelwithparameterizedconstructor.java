package com.gentech.abstractDemo;
abstract class parentclass
{
	String name;
	parentclass(String name)
	{
		System.out.println("Name is:"+name);
	}

}

abstract class child11 extends parentclass
{
	child11(String name) 
	{
		super(name);

	}



}
class child2 extends child11
{
	child2(String name) 
	{
		super(name);

	}
}
public class multilevelwithparameterizedconstructor {

	public static void main(String[] args) {
		child2 o1=new child2("ravi");

	}

}
