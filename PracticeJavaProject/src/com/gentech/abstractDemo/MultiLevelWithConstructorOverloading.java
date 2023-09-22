package com.gentech.abstractDemo;
abstract class parentclass1
{
	String name;
	int age;
	parentclass1(String name)
	{
		this.name=name;
		System.out.println("Name is:"+name);
	}
	parentclass1(int age)
	{
		this.age=age;
		System.out.println("id is:"+age);
	}

}

abstract class class22 extends parentclass1
{
	class22(String name) 
	{
		super(name);
	}
	class22(int age)
	{
		super(age);
	}



}
class child3 extends class22
{
	child3(String name) 
	{
		super(name);
	}
	child3(int age)
	{
		super(age);
	}
	
}
public class MultiLevelWithConstructorOverloading {

	public static void main(String[] args) {
		
		child3 o2=new child3("pallavi");
		child3 o1=new child3(21);

	}

}
