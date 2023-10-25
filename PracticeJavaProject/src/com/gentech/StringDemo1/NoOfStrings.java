package com.gentech.StringDemo1;

public class NoOfStrings {

	public static void main(String[] args) {
		int length=0;
		String s1=new String("The temple is at the top of the hill");
		char ch[]=s1.toCharArray();
		StringBuffer s2=new StringBuffer();
		
		for(char c=0;c<ch.length;c++)
		{
			if(ch[c]!=' ' && ch[c]!='\t')
			{
				s2.append(ch[c]);
			}
		}
		System.out.println(s2.length());
		

	}

}
