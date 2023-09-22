package com.gentech.twodimension;

public class integerMatrixNew {

	public static void main(String[] args) {
		int  x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=1;i<x.length;i++)
		{
			for(int j=0;j<=x[1].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}


	}

}
