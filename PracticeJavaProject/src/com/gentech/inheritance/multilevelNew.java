package com.gentech.inheritance;
class Student
{
	Student(String firstname,int stdid,String branch,String email)
	{
		System.out.println("First Name:" +firstname);
		System.out.println("Student ID:" +stdid);
		System.out.println("Branch:" +branch);
		System.out.println("Email ID:" +email);
	}
}
class Library extends Student
{
	String bookname;int bookid;String authorname;
	Library(String firstname,int stdid,String branch,String email,String bookname,int bookid,String authorname)
	{
		super(firstname,stdid,branch,email);
		this.bookname=bookname;
		this.bookid=bookid;
		this.authorname=authorname;
		System.out.println("Book Name:" +bookname);
		System.out.println("Book ID:" +bookid);
		System.out.println("Author Name:" +authorname);

	}
}
class Sport extends Library
{
	String sptname;int sptid;String coachname;String itemname;
	Sport(String firstname,int stdid,String branch,String email,String bookname,int bookid,String authorname,String sptname,int sptid,String coachname,String itemname)
	{
		super(firstname,stdid,branch, email,bookname,bookid,authorname);
		this.sptname=sptname;
		this.sptid=sptid;
		this.coachname=coachname;
		this.itemname=itemname;
		System.out.println("Sport Name:" +sptname);
		System.out.println("Sport ID:" +sptid);
		System.out.println("Coach Name:" +coachname);
		System.out.println("Item Name:" +itemname);

	}
}


public class multilevelNew {

	public static void main(String[] args) {
		Library obj=new Library("Ajith",1011,"CSE","ajith@gmail.com","DSA",501,"Richard");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Sport obj1=new Sport("Ram",156,"CIVIL","ram@gmail.com","DSA",1023,"Rahul","Throwball",506,"Hari","Ball");
	}

}
