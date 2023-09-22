package com.gentech.dowhile;

public class onetofifteendowhilenew {

	public static void main(String[] args) {
		int a=1;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print((a++)+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
/*
1
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/