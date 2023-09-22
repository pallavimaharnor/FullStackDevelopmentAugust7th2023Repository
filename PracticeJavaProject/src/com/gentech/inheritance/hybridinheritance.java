package com.gentech.inheritance;
class bank1
{
	void bankname(String name)
	{
		System.out.println("bank name is:"+name);
	}
}
class branch1 extends bank1
{
	void branches(String branch)
	{
		System.out.println("Branch name is:"+branch);
	}
}
class accounts1 extends branch1
{
	void acc(int totalaccounts)
	{
		System.out.println("total number of accounts:"+totalaccounts);
	}
}
class manager extends bank1
{
	void manager(String name)
	{
		System.out.println("Manager name is:"+name);
	}
}
public class hybridinheritance {

	public static void main(String[] args) {
		accounts1 o=new accounts1();
		o.bankname("iob");
		o.branches("vijayanagar");
		o.acc(500);
		
		manager o1=new manager();
		o1.bankname("icici");
		o1.manager("ramesh");

	}

}
