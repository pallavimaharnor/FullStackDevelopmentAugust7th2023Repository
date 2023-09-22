package com.gentech.constructorchaining;
class reverse
{
	reverse(int num)
	{
		int reverse=0;
		while(num>0)
		{
			int i=num%10;
			reverse=reverse*10+i;
			num=num/10;
		}
		System.out.println("Reverse number: " +reverse);
	}
}
public class ReverseTheNumber {

	public static void main(String[] args) {
		reverse o1=new reverse(321);

	}

}
