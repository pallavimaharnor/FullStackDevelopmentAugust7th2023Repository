package com.gemtech.onedimension;

public class EightTable {

	public static void main(String[] args) {
		int x[]=new int[10];
		int k=0;
		for(int j=1;j<=80;j++)
		{
			if(j%8==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=0;z<x.length/2;z++)
		{
			System.out.println(x[z]);
		}


	}

}

/*
8
16
24
32
40
*/
