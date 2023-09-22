package com.gentech.voidmethodDemo;
class sample
{
	static boolean isprime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
		if(flag==0)
			return true;
		else
			return false;
	}
	static int getprimenumbersum(int start,int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(isprime(i)==true)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class SampleDemo {

	public static void main(String[] args) {
		int sumresult=sample.getprimenumbersum(1, 50);
		System.out.println(sumresult);

	}

}
