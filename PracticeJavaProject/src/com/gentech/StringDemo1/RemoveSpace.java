package com.gentech.StringDemo1;

public class RemoveSpace {

	public static void main(String[] args) {
		String s1=new String("It is a book");
		char ch[]=s1.toCharArray();
		StringBuffer s2=new StringBuffer();
		
		for(char c=0;c<ch.length;c++)
		{
			if(ch[c]!=' ' && ch[c]!='\t')
			{
				s2.append(ch[c]);
			}
		}
		System.out.println(s2);
		

	}

}
