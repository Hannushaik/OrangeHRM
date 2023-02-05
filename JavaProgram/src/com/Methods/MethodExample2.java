package com.Methods;

public class MethodExample2
{
	 // global variable
	int var1=80;
	int var2=20;
	
	protected void multiplication()
	{
		//local variables
		
		int var1=50;
		int var2=30;
		int var3;
		var3=var1*var2;
		System.out.println(" The value of the variable var3 is:"+var3);
	}
	protected void multiplication(int var1,int var2)
	{
		int var3;
		var3=var1*var2;
		System.out.println( " the var3 value is after multiply :"+var3);
	}
	protected void addition()
	{
		int var3;
		var3=var1+var2;
		System.out.println("The value of variable var3 after add is:"+var3);
	}
	
	
	public static void main(String[] args)
	{
		MethodExample2 m2 =new MethodExample2();
		m2.multiplication();
		m2.multiplication(50, 10);
		m2.addition();
	}
			
	
	
	
	
	
	
	

}
