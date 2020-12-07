package com.oops;

public class inheritance1GradeA extends Inheritanceexample {
	
	static int bonus=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritanceexample ei=new Inheritanceexample();
		System.out.println("salary:"+ei.GAsalary);
		System.out.println("2020 bonus:"+bonus );
		
		int th=ei.GAsalary+bonus;
		System.out.println("Take home:"+th);
		
	
		
		

	}

}
