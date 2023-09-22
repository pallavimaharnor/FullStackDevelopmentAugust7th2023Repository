package com.gentech.patternfor;

public class OnetoFifteenNew {

	public static void main(String[] args) {
		int a=15;
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print((a--)+" ");
			}
			System.out.println();
		}

	}

}
/*15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/