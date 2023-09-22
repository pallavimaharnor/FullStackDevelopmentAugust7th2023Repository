package com.gentech.loopsdowhile;

public class SumDoWhile {

	public static void main(String[] args) {
		int sum=0;
		int i=50;
		do
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
			i++;
		}while(i<=100);
		System.out.println(sum);

	}

}
