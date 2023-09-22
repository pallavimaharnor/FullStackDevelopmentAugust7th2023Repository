package com.gentech.constructorchaining;

class find
{
	int c = 0;
	int temp = 0;
	find(int n)
	{
		temp = n;
		c = n%10;
		while(c>0)
		{
			if((temp%10) == c)
			{
				temp = temp/10;
				c--;
			}
			else
			{
				System.out.print("Missing : "+c);
				break;
			}
		}
	}
}
public class MissingValuesDemo {

	public static void main(String[] args) {
		find o1=new find(12456);

	}

}
