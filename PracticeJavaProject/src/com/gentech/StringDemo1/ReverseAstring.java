package com.gentech.StringDemo1;

public class ReverseAstring {

	public static void main(String[] args) {
		reverse();
		reverse1();
		reverse2();
	}
	private static void reverse()
	{
		String s1=new String("WELCOME");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
	}


	private static void reverse1()
	{
		String s1="WELCOME";
		char ch[]=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	private static void reverse2()
	{
		String s1="WELCOME";
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.substring(i,i+1));
		}
		
		
	}

}
