package com.gentech.patternfor;

public class OnetoFifteen {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print((a++)+" ");
			}
			System.out.println();
		}

	}

}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/