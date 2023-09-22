package com.gentech.patternwhile;

public class OnetoFifteenNewWhile {

	public static void main(String[] args) {
		int a=15;
		int i=5;
		while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print((a--)+" ");
				k++;
			}
			System.out.println();
			i--;
		}


	}

}
/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/