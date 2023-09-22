package com.gentech.inheritance1;

class student
{
	void studentsDetails(String name)
	{
		System.out.println("student name:"+name);
	}
}

class library extends student
{
	library(String name)
	{
		super.studentsDetails(name);
	}
	void studentsDetails(String name)
	{
		System.out.println("book name is:"+name);
	}
	
}
class canteen extends library
{
	canteen(String name) 
	{
		super(name);
		super.studentsDetails(name);
	}
	
	void studentsDetails(String name)
	{
		System.out.println("item name:"+name);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		canteen o1=new canteen("xyz");
		o1.studentsDetails("aaa");
		

	}

}
