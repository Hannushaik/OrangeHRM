package com.Testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("  Gmail application Launch test executed success");
	}
	//==============================================
	
	@Test
	public void gmailInBoxTest()
	{
		System.out.println(" Gmail InBoxTest executed successfully");
	}
	@Test(enabled=false)       
	public void GmailComposeMailTest()
	{
		System.out.println( " compose test executed successfully");
	}
	
	//================================================
	
	@Test
	public void gmailsentMailTest()
	{
		System.out.println(" Sent mail test executed successfull");
	}
	//=============================================
			
	@AfterTest
	public void gmailApplicattionclose()
	{
		System.out.println(" gmail application close test executed success");
	}
			
		
	
	
	
	
	

}
