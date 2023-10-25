package com.gentech.StringDemo1;

public class DeleteDemo {

	public static void main(String[] args) {
		String s1= new String("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
		if(s1.contains("DAY"))
		{
			String str[]=s1.split("Y");

			for(String kk:str)
			{
				System.out.print(kk);
			}
			System.out.println("--------------");
		}
	}


}
