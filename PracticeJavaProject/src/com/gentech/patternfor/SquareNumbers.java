package com.gentech.patternfor;

public class SquareNumbers {

	public static void main(String[] args) {
		int a=1,b=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(((a++)*(b++))+" ");
			}
			System.out.println();
		}


	}

}
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/