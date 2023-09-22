package com.gentech.voidmethodDemo;
class prime
{
	//return the prime numbers 1 to 50
	static void prime(int a,int b)
	{
		int flag;
		for(int i=a;i<=b;i++)
		{
			if(i==1 ||i==0)
			{
				continue;
			}
			flag=1;
			for(int j=2;j<=i/2;++j)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();

	}


	//display the sum of prime numbers between 1 to 100
	static void prime2(int a,int b)
	{
		int flag;int sum=0;
		for(int i=a;i<=b;i++)
		{
			if(i==1 ||i==0)
			{
				continue;
			}
			flag=1;
			for(int j=2;j<=i/2;++j)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		System.out.println();
	}


	//display the count of prime numbers between 1 to 200
	static void prime3(int a,int b)
	{
		int flag;int count=0;
		for(int i=a;i<=b;i++)
		{
			if(i==1 ||i==0)
			{
				continue;
			}
			flag=1;
			for(int j=2;j<=i/2;++j)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				count=count+1;
			}
		}
		System.out.println(count);
		System.out.println();
	}
}
public class PrimeNo {

	public static void main(String[] args) {
		prime.prime(1, 50);
		prime.prime2(1, 100);
		prime.prime3(1, 200);

	}

}
