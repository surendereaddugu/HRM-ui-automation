
package com.oops;

public class InheritanceGradeB extends inheritance1GradeA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		inheritance1GradeA ei=new inheritance1GradeA();
		System.out.println("salary:"+ei.GBsalary);
		System.out.println("2020 bonus:"+bonus );
		
		int th=ei.GBsalary+bonus;
		System.out.println("Take home:"+th);
	
	}

}
