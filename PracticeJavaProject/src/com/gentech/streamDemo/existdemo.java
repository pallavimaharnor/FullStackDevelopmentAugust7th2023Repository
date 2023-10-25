package com.gentech.streamDemo;

import java.io.BufferedReader;
import java.io.FileReader;

class demo5
{
	static void existdemo()
	{
		BufferedReader br=null;
		FileReader fr=null;
		try
		{
			fr =new FileReader("C:\\DEMO\\Example\\text4.txt");
			br=new BufferedReader(fr);
			String strline;
			String word="account number";
			while((strline=br.readLine()) != null)
			{
				String[] w=strline.split("\\s+");
				for(String ww:w) {
					if(strline.contains(word)) {
						System.out.println(strline);
					}
				}
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
public class existdemo {

	public static void main(String[] args) {
		demo5.existdemo();

	}

}
