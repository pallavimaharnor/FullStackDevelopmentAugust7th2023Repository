package com.gentech.StringDemo1;

public class PatternWelcome {

	public static void main(String[] args) {
		pattern();


	}
	private static void pattern()
	{
		String s="WELCOME";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
		
	}
}


