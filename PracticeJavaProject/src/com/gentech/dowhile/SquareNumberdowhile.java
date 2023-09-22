package com.gentech.dowhile;

public class SquareNumberdowhile {

	public static void main(String[] args) {
		int a=1,b=1;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(((a++)*(b++))+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=4);

	}

}
/*
1 
4 9 
16 25 36 
49 64 81 100 
*/