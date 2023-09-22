package com.gentech.MethodsDemo;
class number
{
	void forloop()
	{
		for(int i=50;i>=40;i--)
		{
			System.out.println(i);
		}
	}
	void whileloop()
	{
		int i=50;
		while(i>=40)
		{
			System.out.println(i);
			i--;
		}
		
	}
	void dowhileloop()
	{
		int i=50;
		do
		{
			System.out.println(i);
			i--;
		}while(i>=40);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		number o1=new number();
		o1.forloop();
		System.out.println("-------------------------------------");
		o1.whileloop();
		System.out.println("-------------------------------------");
		o1.dowhileloop();
		
	

	}

}
