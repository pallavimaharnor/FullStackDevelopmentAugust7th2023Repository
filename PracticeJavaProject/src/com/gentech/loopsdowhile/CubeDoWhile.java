package com.gentech.loopsdowhile;

public class CubeDoWhile {

	public static void main(String[] args) {
		int cube=0;
		int i=1;
		do
		{
			cube=cube+(i*i*i);
			i++;
		}while(i<=10);
		System.out.println(cube);

	}

}
