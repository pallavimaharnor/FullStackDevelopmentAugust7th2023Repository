package com.gentech.StringDemo1;

public class Lengthofstring {

	public static void main(String[] args) {
		String s="welcome";
		int a=0;
		char ch[]=s.toCharArray();
		for(char ch1 :ch)
		{
			a=a+1;
		}
		System.out.println("length of string:"+a);
	}

}
