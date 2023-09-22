package com.gentech.loopsdowhile;

public class FactorialDoWhile {

	public static void main(String[] args) {
		int fact=1;
		int num=Integer.parseInt(args[0]);
		int i=1;
		do
		{
				fact=fact*i;
				i++;
		}while(i<=num);
		System.out.println(fact);

	}

}
