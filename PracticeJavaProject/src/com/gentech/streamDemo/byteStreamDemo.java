package com.gentech.streamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class demo1
{
	static void readdemo()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		int n=0;
		try
		{
			fin=new FileInputStream("C:\\DEMO\\Example\\text1.txt");
			fout=new FileOutputStream("C:\\DEMO\\Example\\text2.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char) n;
				char str=ch;
				fout.write(str);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class byteStreamDemo {

	public static void main(String[] args) {
		demo1.readdemo();

	}

}
