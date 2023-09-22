package com.gentech.programs;

public class TrafficSignal {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		switch(ch)
		{
		case 'R':case 'r':
			System.out.println(ch+" means Stop");
			break;
		case 'Y':
			System.out.println(ch+" means get ready");
			break;
		case 'G':
			System.out.println(ch+" means go");
			break;
		default:
			System.out.println(ch+" invalid");
		}

	}

}
