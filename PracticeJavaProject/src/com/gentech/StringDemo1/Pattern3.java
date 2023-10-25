package com.gentech.StringDemo1;

public class Pattern3 {

	public static void main(String[] args) {
		String s="WELCOME";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
		for(int i1=s.length()-2;i1>=0;i1--)
		{
			for(int j1=0;j1<=i1;j1++)
			{
				System.out.print(s.charAt(j1)+" ");
			}
			System.out.println();
		}

	}

}
