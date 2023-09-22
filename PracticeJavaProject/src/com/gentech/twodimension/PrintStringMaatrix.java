package com.gentech.twodimension;

public class PrintStringMaatrix {

	public static void main(String[] args) {
		String  x[][]= {{"apple","ball","cat"},{"cake","dog","kite"},{"orange","monkey","cap"}};
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}


	}

}
