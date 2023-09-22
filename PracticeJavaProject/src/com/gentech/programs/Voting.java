package com.gentech.programs;

public class Voting {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if(age>=18) 
		{
		System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible to vote");
		}

	}

}
