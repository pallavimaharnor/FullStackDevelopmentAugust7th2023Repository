package com.gentech.TwodimensionDemo;

public class TwoDimensionTo1DDemo {

	public static void main(String[] args) {
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int temp[]=new int [x.length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				x[i][j]=temp[i];
				
				
			}
		}
		for(int m=0;m<x.length;m++)
		{
			System.out.println(temp[x.length]);
		}


	}

}
