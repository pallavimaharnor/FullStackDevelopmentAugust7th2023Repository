package com.gentech.StringDemo1;

public class BangloreandMysore {

	public static void main(String[] args) {
		String s="Banglore and Mysore";
		String[] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		

	}

}
