package com.Loops;

public class NestedLoops 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=5; i++)
		{
			for(int k=0;k<i;k++)
				System.out.println(i);
		}
		System.out.println(" @@@@@@@");
		
		
		for(int i=1; i<=5;i++)
		{
			for( int k=0; k<i; k++)
			{
				System.out.println(k);
			}
		}
		
		System.out.println(" $$$$$ ");
		 for( int i=1; i<=5; i++)
		 {
			 for(int k=0;k<i; k++)
			 {
				 System.out.println(" ** ");
			 }
			 System.out.println("  livetech ");
		 }
       System.out.println("  ");
       
       
       for(int i=1; i<5; i++)
       {
    	   for(int k=0; k<i; k++)
    	   {
    		   System.out.println(k);
    	   }
    	   System.out.println(i);
       }
       
		System.out.println(" ===== ");
		
		for(int i=1;i<=5; i++)
		{
			System.out.println(i);
			for( int k=0;k<i; k++)
			{
				System.out.println(k);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
