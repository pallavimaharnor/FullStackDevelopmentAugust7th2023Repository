package com.gentech.TwodimensionDemo;

public class ScalarMultiplication {

	public static void main(String[] args) {
		double  x[][]= {{1.1,2.1,3.1},{4.1,5.1,6.1},{7.1,8.1,9.1}};
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print((x[i][j]*2)+" ");
				
			}
			System.out.println();
		}

	}

}
