package com.gentech.MethodsDemo;
class vowel
{
	void vowels(char x)
	{
		switch(x)
		{
		case 'a':case 'e':case 'i':case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
			System.out.println(x+" is a vowel");
			break;
		default:
			System.out.println(x+" is not a vowel");
			System.out.println("-------------------------------");
		}

	}
	void arr(char  x[][])
	{
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("---------------------------");

	}
	void onearr(int x[])
	{
		int y[]=new int[x.length];
		for(int i=0;i<y.length;i++)
		{
			y[i]=x[i];
		}
		for(int m=(y.length-1)/2;m>=0;m--)
		{
			
				System.out.print(y[m]+" ");
		}
	}


	

}
public class VowelsDemo {

	public static void main(String[] args) {
		vowel o1=new vowel();
		o1.vowels('a');
		o1.vowels('p');
		char a[][]={{'a','b','c'},{'a','b','c'},{'a','b','c'}};
		vowel o2=new vowel();
		o2.arr(a);
		int x[]= {1,2,3,4,5,6};
		vowel o3=new vowel();
		o3.onearr(x);

	}

}
