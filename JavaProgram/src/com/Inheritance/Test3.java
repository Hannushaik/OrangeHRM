package com.Inheritance;

public class Test3 extends Test2
{
	public void addition(int var1,int var2)
	{
		int var3;
		var3=var1+var2;
		System.out.println(" var3 is"+var3);
	}
	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.addition(2,50);
		System.out.println(" The class Test3 Method executed succussfully ");
		
		t3.multiplication(5,50);
		
		System.out.println(" the class Test2 Method executed success");
		
		t3.addition();
		System.out.println(" the class Test1 Method executed success");
	}
	
	
	

}
