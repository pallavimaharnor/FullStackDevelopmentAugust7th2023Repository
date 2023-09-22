package com.gentech.patternwhile;

public class SquareNumberWhile {

	public static void main(String[] args) {
		int a=1,b=1;
		int i=1;
		while(i<=4)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(((a++)*(b++))+" ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/