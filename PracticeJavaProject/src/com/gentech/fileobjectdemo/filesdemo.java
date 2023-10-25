package com.gentech.fileobjectdemo;
import java.io.File;

class demo6
{
	static void filedemo()
	{
		File f1=new File("C:\\DEMO\\Example\\AA\\examplefile.txt");
		for(int i=0;i<10;i++)
		{
			File f2=new File(f1+"_"+i+".txt");
			try
			{
			if(!f2.exists())
				if(f2.createNewFile())
				{
					System.out.println("file created"+f2.getPath());	
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class filesdemo {
	public static void main(String[] args) {
		demo6.filedemo();
	}

}
