package com.gentech.inheritance;
class superclass
{
	int x;
	String y;
	superclass(int x, String y)
	{
		this.x=x;
		this.y=y;
		System.out.println("constructor1 of superclass: x="+x+" y="+y);
	}
	superclass(int x)
	{
		this.x=x;
		System.out.println("constructor2 of superclass: x="+x);
	}
	superclass(String y)
	{
		this.y=y;
		System.out.println("constructor3 of superclass: y="+y);
	}
}
class subclass extends superclass
{
	subclass(int x)
	{
		super(x);
		
	}
	subclass(int x, String y)
	{
		super(x,y);
		
	}
}


class subclass10 extends superclass
{
	subclass10(int x)
	{
		super(x);
		
	}
	subclass10(int x, String y)
	{
		super(x,y);
		
	}
}
public class multilevelconstructoroverloading {
	public static void main(String[] args) {
		subclass o1=new subclass(10);
		System.out.println("---------------------------");
		subclass o2=new subclass(20,"santosh");
	}

}