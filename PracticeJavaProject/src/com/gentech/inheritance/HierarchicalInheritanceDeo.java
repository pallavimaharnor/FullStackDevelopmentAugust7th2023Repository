package com.gentech.inheritance;
class emp
{
	void employee(String name)
	{
		System.out.println("employee name is"+name);
	}
}
class canteen extends emp
{
	void canteen1(String item)
	{
		System.out.println("item name is"+item);
	}
}
class sal extends emp
{
	void salary(int sal)
	{
		System.out.println("ssalary is:"+sal);
	}
}
public class HierarchicalInheritanceDeo {

	public static void main(String[] args) {
		canteen o1=new canteen();
		o1.canteen1("pizza");
		o1.employee("ravi");
		
		sal o2=new sal();
		o2.employee("riched");
		o2.salary(2500000);
		

	}

}
