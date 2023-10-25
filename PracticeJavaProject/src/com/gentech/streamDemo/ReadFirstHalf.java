package com.gentech.streamDemo;

import java.io.BufferedReader;
import java.io.FileReader;

class demo3a
{
	static void readfirsthalf()
	{
		BufferedReader br=null;
		FileReader fr=null;
		int count=0;
		try
		{
			fr =new FileReader("C:\\DEMO\\Example\\text1.txt");
			br=new BufferedReader(fr);
			String strline=null;

			while((strline=br.readLine())!=null)
			{
				char[] a=strline.toCharArray();
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
				}
				System.out.println();
			}



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
public class ReadFirstHalf {

	public static void main(String[] args) {
		demo3a.readfirsthalf();

	}

}
