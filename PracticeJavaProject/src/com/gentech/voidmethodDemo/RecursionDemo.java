package com.gentech.voidmethodDemo;
class maths1
{
	//display odd numbers 20 to 40
	static int k=20;
	static void oddnumbers()
	{
		if(k<=40)
		{
			int odd=k%2;
			if(odd==1)
			{
				System.out.print(k+" ");
			}
			k=k+1;
			oddnumbers();
		}
	}


	//display even numbers 20 to 1
	static int j=20;
	static void evennumers()
	{
		if(j>=1)
		{
			int even=j%2;
			if(even==0)
			{
				System.out.print(j+" ");
			}
			j=j-1;
			evennumers();
		}
	}



	//display numbers between 1 to 100 divisible by 8
	static int a=1;
	static void divisibleByEight()
	{
		if(a<=100)
		{
			int z=a%8;
			if(z==0)
			{
				System.out.print(a+" ");
			}
			a=a+1;
			divisibleByEight();
		}
	}

	//numbers between 100 to 200 divisible by 10
	static int aa=100;
	static void divisibleByTen()
	{
		if(aa<=200) 
		{
			if(aa%10==0)
			{
				System.out.println(aa);
			}
			aa=aa+1;
			divisibleByTen();
			
		}
		
	}
	//display the ten table
	static int ss=1;
	static void tentable()
	{
		if(ss<=10)
		{
			System.out.println("10 *"+ss+"="+(ss*10));
			ss=ss+1;
			tentable();
		}
		
	}
	
	
	//display the result of table 5 in reverse order
	static int c=10;
	static void fivetable()
	{
		if(c>=1)
		{
			System.out.print(c*5+" ");
			c=c-1;
			fivetable();
		}
	}
	
	

}
public class RecursionDemo {

	public static void main(String[] args) {
		maths1.oddnumbers();
		System.out.println();
		maths1.evennumers();
		System.out.println();
		maths1.divisibleByEight();
		System.out.println();
		maths1.divisibleByTen();
		System.out.println();
		maths1.tentable();
		System.out.println();
		maths1.fivetable();
		

	}

}
