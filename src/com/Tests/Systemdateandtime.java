package com.Tests;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Systemdateandtime {

	public static void main(String[] args) {
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dt=new Date();
		String systempresentdt=sdf.format(dt);
		System.out.println(systempresentdt);
		
		//Split date and time
		
		
		String splitvalue[]=systempresentdt.split(" ");
		int count=splitvalue.length;
		System.out.println(count);
		
		for (String val:splitvalue)
		{
			System.out.println(val);
			
		}
		
	
	}

}
