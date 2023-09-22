package com.gentech.ParameterizedDemo;

class Country
{
	
	Country(String name,String nationallanguage,int noofstates,String capital )
	{
		capital="Delhi";
		System.out.println("name: "+name);
		System.out.println("nationallanguage: " +nationallanguage);
		System.out.println("noofstates: "+noofstates);
		System.out.println("capital: "+capital);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class State
{
	State(String name,String Language,int noofdist,String capital)
	{
		System.out.println("name: "+name);
		System.out.println("language: " +Language);
		System.out.println("noofdist: "+noofdist);
		System.out.println("capital: "+capital);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class District
{
	District(String name,int nooftaluks,String famousplace,int pincode)
	{
		System.out.println("name: "+name);
		System.out.println("nooftaluks: " +nooftaluks);
		System.out.println("famousplace: "+famousplace);
		System.out.println("pincode: "+pincode);
		System.out.println("+++++++++++++++++++++++++");
	}
}

public class Countryinformation {


	public static void main(String[] args) {
		Country Ind = new Country("India","hindi",29,"Delhi");
		
		State Kar = new State("Karnataka","Kannada",30,"Bangalore");
		
		District Chick = new District("Chickballapura",6,"Nandihills",562105);
		
	}


}
