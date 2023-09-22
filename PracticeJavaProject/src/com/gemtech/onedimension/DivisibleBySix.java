package com.gemtech.onedimension;

public class DivisibleBySix {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%6==0)
			{
				count=count+1;
			}
		}
		System.out.println("# of elements:"+ count);
		int x[]=new int[count];
		int k=0;
		for(int j=100;j<=200;j++)
		{
			if(j%6==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length/2;z<x.length;z++)
		{
			System.out.println(x[z]);
		}

	}

}

/*
 # of elements:17
150
156
162
168
174
180
186
192
198
*/
