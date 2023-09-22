package com.gentech.MethodsDemo;
class operatorDemo
{
	boolean a=true;
	boolean b=false;
	void and(boolean x,boolean y)
	{
		boolean z;
		z=(x&&y);
		System.out.println(a+" and "+b+" ="+z);
	}
	void or(boolean x,boolean y)
	{
		boolean z;
		z=(x||y);
		System.out.println(a+" or "+b+"="+z);
	}
	void not(boolean x)
	{
		boolean z;
		z=(!x);
		System.out.println(a+" not "+b+"="+z);
	}
}

public class Demo {

	public static void main(String[] args) {
		operatorDemo o1=new operatorDemo();
		boolean a=true;
		boolean b=false;
		o1.and(a,a);
		o1.and(a,b);
		o1.and(b,a);
		o1.and(b,b);
		System.out.println("-------------------------------");
		operatorDemo o2=new operatorDemo();
		o2.or(a,a);
		o1.or(a,b);
		o1.or(b,a);
		o1.or(b,b);
		System.out.println("-------------------------------");
		operatorDemo o3=new operatorDemo();
		o2.not(a);
		o1.not(b);

	}

}
