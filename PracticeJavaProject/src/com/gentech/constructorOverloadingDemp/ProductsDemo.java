package com.gentech.constructorOverloadingDemp;
class Product
{
	Product(String name)
	{
		System.out.println("Product name:"+name);
	}
	Product(int pId)
	{
		System.out.println("Product ID:"+pId);
	}
	
}
public class ProductsDemo {

	public static void main(String[] args) {
		college o1=new college("Speaker");
		college o2=new college(101);
	}
}
