package com.gentech.streamDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class demo2
{
	static void bufferdemo()
	{
		BufferedReader br=null;
		FileReader fr=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fr =new FileReader("C:\\DEMO\\Example\\text1.txt");
			br=new BufferedReader(fr);
			fw =new FileWriter("C:\\DEMO\\Example\\text3.txt");
			bw=new BufferedWriter(fw);
			String strline=null;
			while((strline=br.readLine())!=null)
			{
				bw.write(strline);
				bw.newLine();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				bw.flush();
				bw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class BufferedStreamDemo {

	public static void main(String[] args) {
		demo2.bufferdemo();

	}

}
