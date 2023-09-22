package com.gentech.dowhile;

public class Onetofifteendowhile {

	public static void main(String[] args) {
		int a=15;
		int i=5;
		do
		{
			int k=1;
			do
			{
				System.out.print((a--)+" ");
				k++;
			}while(k<=i);
			System.out.println();
			i--;
		}while(i>=1);

	}

}
/*15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/