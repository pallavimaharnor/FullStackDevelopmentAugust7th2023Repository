package com.gentech.MethodsDemo;
class SampleDemo
{	
	//return the logical AND operator
	boolean andOperaor(boolean x,boolean y)
	{
		boolean z;
		z=(x&&y);
		return z;
	}

	//return the age
	int age(int x)
	{
		return(x);
	}

	//return the address
	String address(String x)
	{
		return(x);
	}

	//return the number of elements in a array
	int array(int x[])
	{
		int z=x.length;
		return z;
	}

	//average of two numbers
	int avg(int x,int y)
	{
		int z=(x+y)/2;
		return z;
	}

	//sum of first ten numbers
	int sum(int x[])
	{
		int s=0;
		for(int i=1;i<x.length;i++)
		{
			s=s+x[i];
		}
		return s;
	}

	//factorial of a given number
	int fact(int x)
	{
		int fact=1;
		for(int i=x;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	//count of numbers between 100 to 1 divisible by 10
	int div10()
	{
		int count=0;
		for(int i=100;i>=1;i--)
		{
			if(i%10==0)
			{
				count=count+1;
			}
		}
		return count;
	}

	//return first half elements from 1D array
	byte[] array1(byte x[])
	{
		byte z[]=new byte[x.length/2];
		int k=0;
		for(int i=0;i<x.length/2;i++)
		{
			z[k]=x[i];
			k=k+1;

		}
		return z;
	}


	//return sum of all elements from 1D short array
	short array2(short x[])
	{
		short z=0;
		for(int i=0;i<x.length;i++)
		{
			z=(short) (z+x[i]);

		}
		return z;

	}

	//average of given 1D integer array
	int average(int x[])
	{
		int s=0;int avg=0;
		for(int i=1;i<x.length;i++)
		{
			s=s+x[i];
			avg=s/(x.length-1);
		}

		return avg;
	}

	//largest from given two number
	int largest(int x,int y)
	{
		if(x>y)
			return x;
		else 
			return y;

	}

	//return smallest of given two numbers
	int smallest(int x,int y,int z)
	{
		if(x>y && x>z)
			return x;
		else if(y>x &&y>z)
			return y;
		else
			return z;

	}


	//return the given input is alphabet or not
	boolean alpha(char ch)
	{ 
		return(ch>='a' &&ch<='z' ||ch>='A' && ch<='Z');
		
	}

	//transpose of given matrix
	String[][] transpose(String x[][])
	{
		String[][] z=new String[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[j][i];
				
			}
		}
		return z;
		
	}

	//return square of all the elements
	int[] square(int x[])
	{
		int s[]=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			s[i]=x[i]*x[i];
		}
		return s;
	}


	//return of numbers between 100 to 1 divisible by 10
	int div6()
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%6==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		SampleDemo o1=new SampleDemo();
		boolean v1=o1.andOperaor(true, false);
		System.out.println(v1);
		System.out.println("------------------------------------");
		int v2=o1.age(23);
		System.out.println(v2);
		System.out.println("------------------------------------");
		String v3=o1.address("Baglore whitefield");
		System.out.println(v3);
		System.out.println("------------------------------------");
		int p[]= {1,2,3,4,5,6,7,8,9};
		int v4=o1.array(p);
		System.out.println(v4);
		System.out.println("------------------------------------");
		int v5=o1.avg(6,8);
		System.out.println(v5);
		System.out.println("------------------------------------");
		int q[]= {1,2,3,4,5,6,7,8,9,10};
		int v6=o1.sum(q);
		System.out.println(v6);
		System.out.println("------------------------------------");
		int v7=o1.fact(5);
		System.out.println(v7);
		System.out.println("------------------------------------");
		int v8=o1.div10();
		System.out.println(v8);
		System.out.println("------------------------------------");


		byte x[]= {1,2,3,4};
		byte v9[]=o1.array1(x);
		for(byte kk:v9 )
		{
			System.out.println(kk);
		}
		System.out.println("------------------------------------");
		
		short z[]= {1,2,3,4,5};
		short v10=o1.array2(z);
		System.out.println(v10);
		System.out.println("------------------------------------");
		


		int v11=o1.average(q);
		System.out.println(v11);
		System.out.println("------------------------------------");
		int v12=o1.largest(5,7);
		System.out.println(v12);
		System.out.println("------------------------------------");

		int v13=o1.smallest(5,7,4);
		System.out.println(v13);
		System.out.println("------------------------------------");


		boolean v14=o1.alpha('a');
		System.out.println(v14);
		System.out.println("------------------------------------");

		String s1[][]= {{"cat","dog","monkey"},{"cat","dog","monkey"},{"cat","dog","monkey"}};
		String v15[][]=o1.transpose(s1);
		for(int i=0;i<v15.length;i++)
		{
			for(int j=0;j<v15[i].length;j++)
			{
				System.out.print(v15[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("------------------------------------");

		int w[]= {1,2,3,4,5,6,7,8,9};
		int v16[]=o1.square(w);
		for(int jj:v16)
		{
			System.out.print(jj+" ");
		}
		System.out.println("------------------------------------");
		
		
		int v17=o1.div6();
		System.out.println(v17);






	}
}

