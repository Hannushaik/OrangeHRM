package com.Inheritance;

import com.Methods.MethodExample1;

public class Test1
{
	
	public void addition()
	{
		int var1=50;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		System.out.println(" The value of the variable var3 after:"+var3);
	}
	
	private void subtraction()
	{
		int var1=30;
		int var2=10;
		int var3;
		var3=var1-var2;
		System.out.println(" The valu of the variable var3 is :"+var3);
	}
	public static void main(String[] args)
	{
		 Test1 t1=new Test1();
		t1.addition();
		t1.subtraction();
		System.out.println("  class Test1 method executed succesffully  "); 
		
		
	}

}
