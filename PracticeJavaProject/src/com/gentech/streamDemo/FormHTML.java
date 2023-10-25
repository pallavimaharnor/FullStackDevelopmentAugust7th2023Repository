package com.gentech.streamDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

class demo7
{
	static void form()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("C:\\DEMO\\Example\\form.html");
			bw=new BufferedWriter(fw);
			bw.write("<html>");
			bw.write("<head><title>Registration Form</title></head>");
			bw.write("<body>");
			bw.write("<form>");
			bw.write("<fieldset>");
			bw.write("<legend>Registration</legend>");
			bw.write("Full Name <input type=\"text\" name=\"FullName\" placeholder=\"Enter your name\"/><br>");
			bw.write("Username \r\n"
					+ "<input type=\"text\" name=\"username\" placeholder=\"Enter your username\"/>\r\n"
					+ "<br>");
			bw.write("Email <br>\r\n"
					+ "<input type=\"email\" name=\"email\" placeholder=\"Enter your email\"/><br>");
			bw.write(" Phone Number \r\n"
					+ "<input type=\"number\" name=\"phoneNumber\" placeholder=\"Enter your phone number\"/>\r\n"
					+ "<br>");
			bw.write("Password <br>\r\n"
					+ "<input type=\"password\" name=\"password\" placeholder=\"Enter your password\"/>");
			bw.write(" Confirm Password \r\n"
					+ "<input type=\"password\" name=\"password\" placeholder=\"Confirm your password\"/>\r\n"
					+ "<br>");
			bw.write(" Gender <br>\r\n"
					+ "<input type=\"radio\" name=\"Gender\" />Male\r\n"
					+ "<input type=\"radio\" name=\"Gender\" />Female\r\n"
					+ "<input type=\"radio\" name=\"Gender\" />Prefer not to say\r\n"
					+ "<br>");
			bw.write("<input type=\"submit\" name=\"submit\" value=\"Register\"/>");
			
			bw.write("</fieldset>");
			bw.write("</form>");
			bw.write("</body>");
			bw.write("</html>");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class FormHTML {

	public static void main(String[] args) {
		demo7.form();

	}

}
