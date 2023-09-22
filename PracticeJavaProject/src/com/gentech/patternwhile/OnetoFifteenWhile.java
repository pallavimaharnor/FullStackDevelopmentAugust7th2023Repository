package com.gentech.patternwhile;

public class OnetoFifteenWhile {

	public static void main(String[] args) {
		int a=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print((a++)+" ");
				k++;
			}
			System.out.println();
			i++;
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