package com.gentech.TwodimensionDemo;

public class AdditionAndTransposeDemo {

	public static void main(String[] args) {
		int x[][]= {{10,20},{30,40}};
		int y[][]= {{1,2},{3,4}};
		if((x.length==y.length) &&(x[0].length==y[0].length))
		{
			int z[][]=new int [x.length][x[0].length];
			for(int i=0;i<x.length;i++)
			{
				for( int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]+y[i][j];
				}
			}
			for(int m=0;m<x.length;m++)
			{
				for( int n=0;n<x[m].length;n++)
				{
					System.out.print(z[n][m]+" ");
				}
				System.out.println();
			}
		}

	}

}
