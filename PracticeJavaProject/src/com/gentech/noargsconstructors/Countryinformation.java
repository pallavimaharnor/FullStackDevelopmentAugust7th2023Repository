package com.gentech.noargsconstructors;

class Country
{
	String name;
	String nationallanguage;
	int noofstates;
	String capital;
	Country()
	{
		name="India";
		nationallanguage="Hindi";
		noofstates=29;
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
	String name;
	String Language;
	int noofdist;
	String capital;
	State()
	{
		name="Karnataka";
		Language="Kannada";
		noofdist=30;
		capital="Bangalore";
		System.out.println("name: "+name);
		System.out.println("language: " +Language);
		System.out.println("noofdist: "+noofdist);
		System.out.println("capital: "+capital);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class District
{
	String name;
	int nooftaluks;
	String famousplace;
	int pincode;
	District()
	{
		name="Chickballapura";
		nooftaluks=6;
		famousplace="Nandihills";
		pincode=562105;
		System.out.println("name: "+name);
		System.out.println("nooftaluks: " +nooftaluks);
		System.out.println("famousplace: "+famousplace);
		System.out.println("pincode: "+pincode);
		System.out.println("+++++++++++++++++++++++++");
	}
}

public class Countryinformation {


	public static void main(String[] args) {
		Country Ind = new Country();
		
		State Kar = new State();
		
		District Chick = new District();
		
	}


}
