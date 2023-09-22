package com.gentech.inheritance;
class bank
{
	void bankname(String name)
	{
		System.out.println("bank name is:"+name);
	}
}
class branch extends bank
{
	void branches(String branch)
	{
		System.out.println("Branch name is:"+branch);
	}
}
class accounts extends branch
{
	void acc(int totalaccounts)
	{
		System.out.println("total number of accounts:"+totalaccounts);
	}
}
public class multilevel {

	public static void main(String[] args) {
		accounts o=new accounts();
		o.bankname("iob");
		o.branches("vijayanagar");
		o.acc(500);

	}

}
