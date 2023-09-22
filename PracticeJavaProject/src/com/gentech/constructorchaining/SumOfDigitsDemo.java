package com.gentech.constructorchaining;
class sumoddigits
{
	sumoddigits(int a)
	{
		int sum=0;
		while(a!=0)
		{
			sum=sum+a%10;
			a=a/10;
			
		}
		System.out.println("no of digits= "+sum);
	}
}
public class SumOfDigitsDemo {

	public static void main(String[] args) {
		sumoddigits o1=new sumoddigits(1234);

	}

}
