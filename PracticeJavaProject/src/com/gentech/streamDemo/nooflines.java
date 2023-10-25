package com.gentech.streamDemo;

import java.io.BufferedReader;
import java.io.FileReader;

class demo4
{
	static void nooflines()
	{
		BufferedReader br=null;
		FileReader fr=null;
		try
		{
			fr =new FileReader("C:\\DEMO\\Example\\text1.txt");
			br=new BufferedReader(fr);
			String strline=null;
			int count=0;
			while((strline=br.readLine())!=null)
			{
				count=count+1;
			}
			System.out.println(count);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class nooflines {

	public static void main(String[] args) {
		demo4.nooflines();

	}

}
