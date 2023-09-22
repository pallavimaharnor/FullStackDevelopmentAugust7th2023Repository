package com.gentech.ParameterizedDemo;

class employee
{
	employee(String name,int age,String email,long phoneno)
	{
	System.out.println("name: "+name);
	System.out.println("age: " +age);
	System.out.println("email: "+email);
	System.out.println("phoneno: "+phoneno);
	System.out.println("+++++++++++++++++++++++++");
	}
	
}
class department
{
	department(String name,String location,int noofmembers,String depthead)
	{
		System.out.println("name: "+name);
		System.out.println("location: " +location);
		System.out.println("noofmembers: "+noofmembers);
		System.out.println("depthead: "+depthead);
		System.out.println("+++++++++++++++++++++++++");
	}
}
class insurance
{
	insurance(String insurancename,String typeofinsuranve,int insuranceamount)
	{
		System.out.println("insurancename: "+insurancename);
		System.out.println("insurancetype: " +typeofinsuranve);
		System.out.println("insuranceamount: "+insuranceamount);
		
		System.out.println("+++++++++++++++++++++++++");
	}
	
}
public class EmployeeInformation {

	public static void main(String[] args) {
		employee emp = new employee("ravi",29,"ravi@gmail.com",987456321);
		
		department dep = new department("karnataka","banglore",30,"sanya");
		
		insurance ins = new insurance(	"LIC insurance","health insurance",100000);

	}

}