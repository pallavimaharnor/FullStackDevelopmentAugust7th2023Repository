package com.gemtech.onedimension;

public class TwoArray {

	public static void main(String[] args) {
		int x[]= {2,4,6,8};
		int y[]= {10,20,30,40,50,60};
		int total=x.length+y.length;
		int c[]=new int[total];
		for(int i=0;i<x.length;i++)
		{
			c[i]=x[i];
		}
		for(int j=0;j<y.length;j++)
		{
			c[x.length+j]=y[j];
		}
		for(int z=0;z<total;z++)
		{
			System.out.print(c[z]+" ");
		}
		
		

	}

}


/*2 4 6 8 10 20 30 40 50 60 */