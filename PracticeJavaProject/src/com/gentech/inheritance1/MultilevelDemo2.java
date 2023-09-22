package com.gentech.inheritance1;
class Country1
{
	String name;int id;
	void show()
	{
		System.out.println("Statename in super class:" +name);
		System.out.println("Stateid in super class:" +id);
	}
}
class State1 extends Country1
{
	String name;int id;
	State1(String name,int id)
	{
		super.name=name;
		super.id=id;
	}
	void display()
	{
		System.out.println("Statename in subclass:" +name);
		System.out.println("Stateid in subclass:" +id);
	}
}
class State2 extends State1
{
	String name;int id;
	State2(String name,int id)
	{
	super(name,id);
	super.name=name;
	super.id=id;
	}
	void display1()
	{
		System.out.println("Name in subclass2:" +name);
		System.out.println("ID in subclass2:" +id);

	}
}

public class MultilevelDemo2 {

	public static void main(String[] args) {
		State2 obj1=new State2("India",56201);
		obj1.display();
		System.out.println("+++++++++++++++++++++++");
		obj1.display1();
		System.out.println("+++++++++++++++++++++++");
		obj1.show();
		
	}

}