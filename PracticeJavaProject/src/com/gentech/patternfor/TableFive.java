package com.gentech.patternfor;

public class TableFive {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(((a++)*5)+" ");
			}
			System.out.println();
		}

	}

}
/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/