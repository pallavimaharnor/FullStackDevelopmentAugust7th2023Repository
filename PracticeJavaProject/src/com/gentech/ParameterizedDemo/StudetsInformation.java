package com.gentech.ParameterizedDemo;

class student {
    student(int rollno,String name,int marks,String fathername)
    {
		System.out.println("rollno:"+rollno);
		System.out.println("name: "+name);
		System.out.println("marks:"+marks);
		System.out.println("Father name:"+fathername);
		System.out.println("-----------------------------------------------------------------");
    }

}
class library {
    library(String bookname,int noofbooksavailable,String author,String subject)
    {
		System.out.println("Book name:"+bookname);
		System.out.println("No Of book available:"+noofbooksavailable);
		System.out.println("Author name:"+author);
		System.out.println("subjectname:"+subject);
		System.out.println("-----------------------------------------------------------------");
    }

}
class sports {
    sports(String sportstype,int noofplayers,String itemname,int noofitems)
    {
		System.out.println("Sports name:"+sportstype);
		System.out.println("No of players: "+noofplayers);
		System.out.println("Item nam:"+itemname);
		System.out.println("No of items available:"+noofitems);
    }

}


public class StudetsInformation {

	public static void main(String[] args) {
		student stu = new student(11,"Mayank",529,"varma");
		
		library lib = new library("java",6,"riched","computer science");
		
		sports sp=new sports("baskrt ball",20,"ball",5);
		
	}

}

