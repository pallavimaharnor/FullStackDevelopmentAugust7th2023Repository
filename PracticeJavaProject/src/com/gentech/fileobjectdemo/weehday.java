package com.gentech.fileobjectdemo;

import java.io.File;

class demo2
{
	static void subfolder()
	{
		String a[]={"sun","mon","tue","wed","thus","fri","sat"};
		File f1=new File("C:\\DEMO\\Example\\BB");
		for(int i=0;i<a.length;i++)
		{
			File f2=new File(f1+"_"+a[i]);
			if(!f2.exists())
				if(f2.mkdir())
				{
					System.out.println("folder created:"+f2.getPath());	
				}
		}
	}
}
public class weehday {
	public static void main(String[] args) {
		demo2.subfolder();

	}

}
