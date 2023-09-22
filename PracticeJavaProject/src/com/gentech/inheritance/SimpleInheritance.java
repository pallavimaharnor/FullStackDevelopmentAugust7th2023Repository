package com.gentech.inheritance;
class AA
{
	void even(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+" is a even number");
		}
		else
		{
			System.out.println(x+" is not a even number");
		}
	}
}
class BB extends AA
{
	void odd(int x)
	{
		if(x%2==1)
		{
			System.out.println(x+" is a odd number");
		}
		else
		{
			System.out.println(x+" is not a odd number");
		}
	}
}
public class SimpleInheritance {

	public static void main(String[] args) {
		BB o1=new BB();
		o1.odd(20);
		o1.even(22);

	}

}
