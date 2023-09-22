package com.gentech.constructorchaining;
class vowels
{
	vowels(char ch)
	{
		switch(ch)
		{
		case 'A':case 'E':case 'I':case 'O':case 'U':case 'a':case 'e':case 'i':case 'o':case 'u':
			System.out.println(ch+" is a vowels");
			break;
		default:
			System.out.println(ch+" is not a vowel");
		}
	}
}
public class VowelsDemo {

	public static void main(String[] args) {
		vowels o1=new vowels('a');

	}

}
