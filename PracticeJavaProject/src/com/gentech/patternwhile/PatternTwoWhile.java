package com.gentech.patternwhile;

public class PatternTwoWhile {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print("2 ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
/*
2 
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2 
*/