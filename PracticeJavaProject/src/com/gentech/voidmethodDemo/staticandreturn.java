package com.gentech.voidmethodDemo;
class mathsDemo1
{
	//return 2D char array in reverse order
	static char[][] reverse(char x[][])
	{
		char[][] z=new char[x.length][x[0].length];
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				z[i][j]=x[i][j];

			}
		}
		return z;

	}

	//return the concat result of 2D array
	static char[][] concateofarray(char ch[][])
	{
		String s=" ";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				s=s+ch[i][j];
			}
		}
		return ch;
	}


	//method to return first row of the 2D char array
	static char[][] firstrow(char a[][])
	{
		char[][] z=new char[a.length][a[0].length];
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				z[i][j]=a[i][j];
			}
		}
		return a;
	}
	
	//return third row of an integer array
	static int[][] thirdrow(int a[][])
	{
		int[][] z=new int[a.length][a[0].length];
		for(int i=2;i<a.length;i++)
		{
			for(int j=0;j<a[2].length;j++)
			{
				z[i][j]=a[i][j];
			}
		}
		return a;
	}
	
	
	
	
	
}
public class staticandreturn {

	public static void main(String[] args) {
		char s1[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		mathsDemo1.reverse(s1);
		for(int i=s1.length-1;i>=0;i--)
		{
			for(int j=s1[i].length-1;j>=0;j--)
			{
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("------------------------------------------");
		char s2[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		mathsDemo1.concateofarray(s2);
		for(int i=0;i<s2.length;i++)
		{
			for(int j=0;j<s2[i].length;j++)
			{
				System.out.print(s2[i][j]);
			}
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
		char s3[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		mathsDemo1.firstrow(s3);
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<s3[i].length;j++)
			{
				System.out.print(s3[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
		int s4[][]= {{1,2,3},{4,5,6},{7,8,9}};
		mathsDemo1.firstrow(s3);
		for(int i=2;i<s4.length;i++)
		{
			for(int j=0;j<s4[i].length;j++)
			{
				System.out.print(s4[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("------------------------------------------");
		String x[]= {"apple","ant","mango","bat"};
	}
	

}
