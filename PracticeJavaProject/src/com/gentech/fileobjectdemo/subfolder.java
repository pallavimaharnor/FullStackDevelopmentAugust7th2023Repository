package com.gentech.fileobjectdemo;

import java.io.*;

class demo1
{
	static void folderdemo()
	{
		File f1=new File("C:\\DEMO\\Example\\examplefolder");
		for(int i=0;i<10;i++)
		{
			File f2=new File(f1+"_"+i);
			if(!f2.exists())
				if(f2.mkdir())
				{
					System.out.println("folder created"+f2.getPath());	
				}
		}
	}
}
public class subfolder {

	public static void main(String[] args) {
		demo1.folderdemo();

	}

}
