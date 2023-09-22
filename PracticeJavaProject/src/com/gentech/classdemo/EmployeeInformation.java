package com.gentech.classdemo;

class employee
{
	String name;
	int age;
	String email;
	long phoneno;
	
}
class department
{
	String name;
	String location;
	int noofmembers;
	String depthead;
}
class insurance
{
	String insurancename;
	String typeofinsuranve;
	int insuranceamount;
	
}


public class EmployeeInformation {

	public static void main(String[] args) {
		employee emp = new employee();
		emp.name="Ravi";
		emp.age=29;
		emp.email="ravi@gmail.com";
		emp.phoneno=698541230;
		System.out.println("name: "+emp.name);
		System.out.println("age: " +emp.age);
		System.out.println("email: "+emp.email);
		System.out.println("phoneno: "+emp.phoneno);
		System.out.println("+++++++++++++++++++++++++");
		department dep = new department();
		dep.name="Karnataka";
		dep.location="banglore";
		dep.noofmembers=30;
		dep.depthead="sanya";
		System.out.println("name: "+dep.name);
		System.out.println("location: " +dep.location);
		System.out.println("noofmembers: "+dep.noofmembers);
		System.out.println("depthead: "+dep.depthead);
		System.out.println("+++++++++++++++++++++++++");
		insurance ins = new insurance();
		ins.insurancename="LIC insurance";
		ins.typeofinsuranve="health insurance";
		ins.insuranceamount=100000;
		System.out.println("insurancename: "+ins.insurancename);
		System.out.println("insurancetype: " +ins.typeofinsuranve);
		System.out.println("insuranceamount: "+ins.insuranceamount);
		
		System.out.println("+++++++++++++++++++++++++");
		
		

	}

}