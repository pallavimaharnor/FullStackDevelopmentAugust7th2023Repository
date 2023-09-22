package com.gentech.dowhile;

public class TableFivedowhile {

	public static void main(String[] args) {
		int a=1;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(((a++)*5)+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
/*
 1 
4 9 
16 25 36 
49 64 81 100 
*/
