package com.gentech.ParameterizedDemo;

class Fruits
{
	String name;
	String color;
	String shape;
	int cost;
	Fruits(String name,String color,String shape,int cost)
	{
		name=name;
		color=color;
		shape=shape;
		cost=cost;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("shape: "+shape);
		System.out.println("cost: "+cost);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class Flowers
{
	String name;
	String color;
	int cost;
	int quantity;
	Flowers(String name,String color,int cost,int quantity)
	{
		name=name;
		color=color;
		cost=cost;
		quantity=quantity;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("cost: "+cost);
		System.out.println("quantity: "+quantity);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
class Vegetables
{
	String name;
	String color;
	String taste;
	String size;
	Vegetables(String name,String color,String taste,String size )
	{
		name=name;
		color=color;
		taste=taste;
		size=size;
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		System.out.println("taste: "+taste);
		System.out.println("size: "+size);
		System.out.println("+++++++++++++++++++++++++++++");
	}
}

public class DemoSix {

	public static void main(String[] args) {
		Fruits app = new Fruits("orange","orange","circle",55);
		
		Flowers rose = new Flowers("rose","pink",75,10);
		
		Vegetables bitter = new Vegetables("bitter gourd","green","bitter","medium");

	}
}
