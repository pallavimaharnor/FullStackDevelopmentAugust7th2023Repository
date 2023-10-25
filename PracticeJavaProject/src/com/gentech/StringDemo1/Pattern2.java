package com.gentech.StringDemo1;

public class Pattern2 {

	public static void main(String[] args) {
		pattern();


	}
	private static void pattern()
	{
		String s="WELCOME";
		for(int i=s.length()-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
		
	}
}

