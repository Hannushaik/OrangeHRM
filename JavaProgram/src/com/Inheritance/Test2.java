package com.Inheritance;

import com.Methods.MethodExample2;

public class Test2 extends Test1
{
	private void multiplication()
	{
		int var1=20;
		int var2=30;
		int var3;
		var3=var1*var1;
		System.out.println(" The value of the variable var3 is:"+ var3);
		
	}
	
	protected void multiplication(int var1,int var2)
	{
		int var3;
		var3=var1*var2;
		System.out.println(" the var3 value is is:"+var3);
	}
	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.multiplication();
		t2.addition();
		t2.multiplication(5, 6);
	}
	
	
	
	

}
