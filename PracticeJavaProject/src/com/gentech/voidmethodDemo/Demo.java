package com.gentech.voidmethodDemo;
class maths11
{
	static maths11 obj=null;
	private maths11()
	{
		//it is private constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition result:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multiplication result:"+res);
	}
	
	public static maths11 getinstance()
	{
		if(obj==null)
		{
			obj=new maths11();
		}
		return obj;
	}
}
public class Demo {

	public static void main(String[] args) {
		maths11 o1=maths11.getinstance();
		o1.addition(10, 20);
		o1.multiplication(5, 10);
		
		maths11 o2=maths11.getinstance();
		o2.addition(10, 20);
		o2.multiplication(5, 10);
		
		maths11 o3=maths11.getinstance();
		o3.addition(10, 20);
		o3.multiplication(5, 10);
		
		if(o1==o2 && o2==o3)
		{
			System.out.println("achieved singleton design pattern");
		}
		else
		{
			System.out.println("not achieved singleton design pattern");
		}
		
	}

}
