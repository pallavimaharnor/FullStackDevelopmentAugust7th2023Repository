package com.gentech.fileobjectdemo;

import java.io.File;

class demo5
{
	static void display()
	{
		File f1=new File("C:\\DEMO\\Example\\BB");
		File[] f2=f1.listFiles();
		for (File file : f2) 
		{
			if (file.isFile() && file.getName().endsWith(".txt")) 
			{
				System.out.println(file.getName());
			}
		}
	}
	
	static void rename()
	{
		File f1=new File("C:\\DEMO\\Example\\BB");
		File[] f2=f1.listFiles();
		for (File file : f2) 
		{
			if (file.isFile() && file.getName().endsWith(".docx")) 
			{
				String a=file.getName();
				String b="new_"+a;
				System.out.println(file.renameTo(file));
				
			}
		}
	}
}
	public class displayfiles {

		public static void main(String[] args) {
			demo5.display();
			demo5.rename();

		}

	}
