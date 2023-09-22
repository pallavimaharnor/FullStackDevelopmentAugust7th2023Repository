package com.gentech.constructorchaining;
class alphabet
{
	alphabet(char ch)
	{
		if(ch>='A'&& ch<='Z' || ch>='a'&& ch<='z')
		{
			System.out.println(ch+" is a alphabet");
		}
		else
		{
			System.out.println(ch+" is not a alphabet");
		}
			
	}
}
public class AlphabetsDemo {

	public static void main(String[] args) {
		alphabet o1=new alphabet('A');

	}

}
