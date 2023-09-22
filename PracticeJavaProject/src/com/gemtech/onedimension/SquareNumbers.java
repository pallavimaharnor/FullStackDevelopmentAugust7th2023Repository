package com.gemtech.onedimension;

public class SquareNumbers {

	public static void main(String[] args) {
		int a=1,b=1;
		int x[]=new int[10];
		int k=0;
		for(int j=10;j>0;j--)
		{
			if(((a++)*(b++))<100);
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length/2;z<x.length;z++)
		{
			System.out.println(x[z]*x[z]);
		}

	}

}
/*
# of elements:10
25
16
9
4
1

*/