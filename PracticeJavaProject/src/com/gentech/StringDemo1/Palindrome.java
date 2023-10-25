package com.gentech.StringDemo1;

public class Palindrome {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("WELCOME");
		String s2=new StringBuilder(s1).reverse().toString();
		if(s1.equals(s2))
		{
			System.out.println("is a palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
	}

}
