package com.gentech.voidmethodDemo;
class Alphabet
{
	//return the upper case alphabets
		static char[] uppercasealphabet()
		{
			char result[]=new char[26];
			for(char i=0;i<26;i++)
			{
				result[i]=(char)('A'+i);
			}
			return result;
		}
		
		//return the  lower case alphabets
		static char[] lowercase()
		{
			char result[]=new char[26];
			for(char i=0;i<26;i++)
			{
				result[i]=(char)('a'+i);
			}
			return result;
		}
		
		
		//return the first half of alphabets
		static char[] firsthalf()
		{
			char result[]=new char[13];
			for(char i=0;i<13;i++)
			{
				result[i]=(char)('A'+i);
			}
			return result;
		}
		
		
		//return the second half of alphabets
		static char[] secondhalf()
		{
			char result[]=new char[13];
			for(char i=13;i<26;i++)
			{
				result[i]=(char)('n'+i);
				
			}
			return result;
			
			
		}
}
public class Uppercase {
	public static void main(String[] args) {
		char[] ch=Alphabet.uppercasealphabet();
		for(char c:ch)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		
		char[] ch1=Alphabet.lowercase();
		for(char cc:ch1)
		{
			System.out.print(cc+" ");
		}
		System.out.println();
		
		char[] ch2=Alphabet.firsthalf();
		for(char a:ch2)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		
		char[] ch3=Alphabet.secondhalf();
		for(char aa:ch3)
		{
			System.out.print(aa+" ");
		}
		
		

	}

}
