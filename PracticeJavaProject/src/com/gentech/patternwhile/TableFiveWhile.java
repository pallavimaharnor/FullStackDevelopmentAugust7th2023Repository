package com.gentech.patternwhile;

public class TableFiveWhile {

	public static void main(String[] args) {
		int a=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(((a++)*5)+" ");
				k++;
			}
			System.out.println();
			i++;
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