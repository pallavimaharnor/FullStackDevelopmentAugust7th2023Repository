package com.gentech.MethodsDemo;
class array
{
	//given byte array and read the second half
	void bytearray(byte x[])
	{
		for(int i=(x.length)/2;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

//given 1D short array and read the first half
	void shortarray(short x[])
	{
		for(int i=0;i<=(x.length-1)/2;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

	//given 1D int array and read the first half in reverse order
	void integerarray(int x[])
	{
		for(int i=(x.length-1)/2;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

	//concate of the given 1D char array
	void concateofarray(char ch[])
	{
		String s=" ";
		for(int i=0;i<ch.length;i++)
		{
			s=s+ch[i];
		}
		System.out.println();

	}
	
	//1D string array read in reverse order
	void stringarray(String x[])
	{
		for(int i=(x.length-1);i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

//given 1D int array and sum of all the elements in array
	void additionDemo(int x[])
	{
		int res=0;
		for(int i=0;i<x.length;i++)
		{
			res=res+x[i];
		}
		System.out.println(res);
	}
	
	//display the vowels separately in given 1D array

	void vowels(char x[])
	{
		for(int i=0;i<x.length;i++)
		{
			switch(x[i])
			{
			case 'a':case 'e':case 'i':case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
				System.out.print(x[i]);
				break;
			}
		}
		System.out.println();
	}
	
	//read the 2D int array and read the last row of the matrix

	void array1(int x[][])
	{
		for(int i=2;i<x[2].length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}

	}

	//read the 2D int array and find the sum of all elements matrix
	void sum(int x[][])
	{
		int res=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				res=res+x[i][j];
			}
		}
		System.out.println(res);
	}

//subtraction of two matrix and read in reverse order
	void subtractionarray(int x[][],int y[][])
	{
		if((x.length==y.length) &&(x[0].length==y[0].length))
		{
			int z[][]=new int [x.length][x[0].length];
			for(int i=0;i<x.length;i++)
			{
				for( int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]-y[i][j];
				}
			}
			for(int m=x.length-1;m>=0;m--)
			{
				for( int n=x[m].length-1;n>=0;n--)
				{
					System.out.print(z[m][n]+" ");
				}
				System.out.println();
			}
		}
	}

	//sum of square of all the elements of the given 1D array

	void square(int x[])
	{
		int z=0;
		for(int i=0;i<=(x.length-1);i++)
		{
			z=z+(x[i]*x[i]);
		}
		System.out.println(z);
	}
	
	//2D String concatenate
	void concat(String str[][])
	{
		String s=" ";
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++ )
			{
				s=s+str[i][j];
			}
			System.out.println(s);
		}
	}
}


public class Demo2 {

	public static void main(String[] args) {
		array o1=new array();
		byte a[]= {1,2,3,4,5,6};
		o1.bytearray(a);
		System.out.println("------------------------------------");
		short b[]= {10,20,30,40,50,60};
		o1.shortarray(b);
		System.out.println("------------------------------------");
		int c[]= {4,5,6,8,9,3};
		o1.integerarray(c);
		System.out.println("------------------------------------");
		char o[]= {'a','b','c','d'};
		o1.concateofarray(o);
		
		System.out.println("------------------------------------");
		String d[]= {"apple","mango","banana"};
		o1.stringarray(d);
		System.out.println("------------------------------------");
		o1.additionDemo(c);
		System.out.println("------------------------------------");
		char p[]= {'a','q','i','y','h'};
		o1.vowels(p);
		System.out.println("------------------------------------");
		int q[][]= {{1,2,3},{4,5,6},{7,8,9}};
		o1.array1(q);
		System.out.println("------------------------------------");
		o1.sum(q);
		System.out.println("------------------------------------");
		int z[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int y[][]= {{1,2,3},{4,5,6},{7,8,9}};
		o1.subtractionarray(z, y);
		System.out.println("------------------------------------");
		o1.square(c);
		System.out.println("------------------------------------");

	}

}
