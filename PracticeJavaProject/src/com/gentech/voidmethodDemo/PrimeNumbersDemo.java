package com.gentech.voidmethodDemo;
class Maths
{
	//display the prime numbers between 1 to 50
	void prime(int a,int b)
	{
		int flag;
		for(int i=a;i<=b/2;i++)
		{
			if(i==1 ||i==0)
			{
				continue;
			}
			flag=1;
			for(int j=2;j<=i;++j)
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
	
	
	//display the prime numbers between 100 to 50
		void prime1(int a,int b)
		{
			int flag;
			for(int i=a;i>=b;i--)
			{
				if(i==1 ||i==0)
				{
					continue;
				}
				flag=1;
				for(int j=2;j<i;++j)
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
		
		
		//sum of prime numbers between 1 to 50
		void prime2(int a,int b)
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
		
		//count of prime numbers between 150 to 300
				void prime3(int a,int b)
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
				}

}


public class PrimeNumbersDemo {
	public static void main(String[] args) {
		Maths o1=new Maths();
		o1.prime(1,50);
		System.out.println("------------------------------------");
		o1.prime1(100, 50);
		System.out.println("------------------------------------");
		o1.prime2(1, 50);
		System.out.println("------------------------------------");
		o1.prime3(150, 300);

		
	}

}
