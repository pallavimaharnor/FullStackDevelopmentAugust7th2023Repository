package com.gentech.inheritance1;
class country
{
	int id;
	String countryname;
	void show(String name, int id)
	{
		this.countryname=name;
		this.id=id;
		System.out.println("country name:"+countryname);
		System.out.println("id code of country:"+id);
	}
}

class state extends country
{
	state(String name,int id)
	{
		super.show(name,id);
		
		
	}
	int id;
	String countryname;
	void show(String name, int id)
	{
		this.countryname=name;
		this.id=id;
		System.out.println("state name:"+name);
		System.out.println("id code of state:"+id);
	}
}
class district extends state
{
	district(String name, int id) 
	{
		super(name, id);
		super.show(name,id);
	}
	int id;
	String countryname;

	void show(String name, int id)
	{
		this.countryname=name;
		this.id=id;
		System.out.println("district name:"+name);
		System.out.println("id of district:"+id);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		district o1=new district("india",91);
		o1.show("srilanka",45);
		o1.show("karnataka",22);
		

	}

}
