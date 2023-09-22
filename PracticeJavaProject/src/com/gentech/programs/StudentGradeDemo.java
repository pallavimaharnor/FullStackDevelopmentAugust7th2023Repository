package com.gentech.programs;

public class StudentGradeDemo {

	public static void main(String[] args) {
		int marks=Integer.parseInt(args[0]);
		if((marks>=70) &&(marks<=100))
		{
		System.out.println("FCD");
		}
		else if((marks<70) &&(marks>=60))
		{
			System.out.println("first class");
		}
		else if((marks<60) &&(marks>=50))
		{
			System.out.println("second class");
		}
		else if((marks<50) &&(marks>=35))
		{
			System.out.println("pass class");
		}
		else if((marks<35) &&(marks>=0))
		{
			System.out.println("fail");
		}
		else 
		{
			System.out.println("invalid input");
		}

	}

}
