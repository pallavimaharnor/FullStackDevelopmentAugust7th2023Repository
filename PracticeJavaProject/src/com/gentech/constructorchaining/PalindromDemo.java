package com.gentech.constructorchaining;
class digit
{
	digit(int num)
	{
		int reverse=0,temp;
		temp=num;
		while(num>0)
		{
			int i=num%10;
			reverse=reverse*10+i;
			num=num/10;
		}
		if(temp==reverse)
		{
			System.out.println(temp+" is a palindrom");
		}
		else
		{
			System.out.println(temp+" is not a palindrom");
		}
	}
}
public class PalindromDemo {

	public static void main(String[] args) {
		digit o1=new digit(121);

	}

}
