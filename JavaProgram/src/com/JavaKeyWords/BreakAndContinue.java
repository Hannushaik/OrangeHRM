package com.JavaKeyWords;

public class BreakAndContinue 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
				System.out.println(i+"Selenium");
			}
		}
		System.out.println("   BreakKeyWord   ");
		
		for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i+" selenium");
		}
		
		System.out.println(" ContinueKeyWord ");
		
		for(int i=2; i<5; i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i+" hannu");
		}
		
		
		
		
		
		

	}

}
