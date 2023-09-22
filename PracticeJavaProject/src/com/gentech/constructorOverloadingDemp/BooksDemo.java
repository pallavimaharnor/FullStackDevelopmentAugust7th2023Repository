package com.gentech.constructorOverloadingDemp;

class book
{
	book(String bookname,String author)
	{
		System.out.println("book name:"+bookname);
		System.out.println("book email:"+author);
	}
	book(int id)
	{
		System.out.println("book ID:"+id);
	}
	
	
}
public class BooksDemo {

	public static void main(String[] args) {
		book o1=new book("Java","Adams");
		book o2=new book(1000);
		
	}

}