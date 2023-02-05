package com.ExceptionalHandling;

public class TryCatchExample
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			int var1=20;
			int var2=7;
			int var3;
			
			var3=var1+var2;
			System.out.println("The value of the variable var3 after addition is:"+var3);
			
			var3=var1/var2;
			System.out.println("The value of the variable var3 after Division is:"+var3);
			
			var3=var1%var2;
			System.out.println("The value of the variable var3 after Mod is:"+var3);
		}
		
			catch(Exception error)
			{
				System.out.println(" The Exception is :"+error);
			}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
