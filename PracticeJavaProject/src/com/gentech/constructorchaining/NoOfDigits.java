package com.gentech.constructorchaining;
class digits
{
	digits(int a)
	{
		int d=0;
		while(a!=0)
		{
			int b=a%10;
			d++;
			a=a/10;
		}
		System.out.println("no of digits= "+d);
	}
}
public class NoOfDigits {

	public static void main(String[] args) {
		digits o1=new digits(12);
	}

}
