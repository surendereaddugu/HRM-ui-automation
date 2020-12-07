package com.accessmodifiers;

public class Privateexample {
	
	private int n=50;
	public static Privateexample obj=new Privateexample();
	
	public static void mul()
	
	{
		int c=10*obj.n;
		System.out.println(c);
		}
	
	
	public static void sub()
	{
		int d=10-obj.n;
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		mul();
		sub();
		
		
	}
}
