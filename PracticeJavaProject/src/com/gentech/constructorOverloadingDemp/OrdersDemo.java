package com.gentech.constructorOverloadingDemp;

class Orders
{
	Orders(String name)
	{
		System.out.println("Orders name:"+name);
	}
	Orders(int orderno)
	{
		System.out.println("Orders ID:"+orderno);
	}
	Orders(double amount)
	{
		System.out.println("Orders ID:"+amount);
	}
	
}
public class OrdersDemo {

	public static void main(String[] args) {
		Orders o1=new Orders("Laptop");
		Orders o2=new Orders(101);
		Orders o3=new Orders(2000.0);
	}

}
