package com.oops;

public class Polymorphysmexample {

	//method1
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	
	//method2
		public static void add(int a,int b, int d)
		{
			int c=a+b+d;
			System.out.println(c);
		}
		
		//method3
		public static void add(int a,int b,int e, int f)
		{
			int c=a+b+e+f;
			System.out.println(c);
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(10,10);
		add(10,20,30);
		add(20,30,40,50);
		
		
		
		
	}

	
	
	
}
