package com.oops;

public class Objectexample {
	
	public String student1="surender";
	public String student2="bhasker";
	
	public static Objectexample obj=new Objectexample();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cseclass();
		ececlass();

	}
	
	public static void cseclass()
	{
		System.out.println(obj.student1);
		System.out.println(obj.student2);
		
	}
	
	public static void ececlass()
	{
        System.out.println(obj.student1);
        System.out.println(obj.student2);
        
	}
	

}
