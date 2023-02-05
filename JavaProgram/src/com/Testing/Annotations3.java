package com.Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{
	@BeforeMethod
	public void gmailApplicationLaunch()
	{
		System.out.println("  Gmail application Launch test executed success");
	}
	//==============================================
	
	@Test(priority=1)
	public void gmailInBoxTest()
	{
		System.out.println(" Gmail InBoxTest executed successfully");
	}
	@Test(priority=2)       
	public void GmailComposeMailTest()
	{
		System.out.println( " compose test executed successfully");
	}
	
	//================================================
	
	@Test(priority=3)
	public void gmailsentMailTest()
	{
		System.out.println(" Sent mail test executed successfull");
	}
	//=============================================
			
	@AfterMethod
	public void gmailApplicattionclose()
	{
		System.out.println(" gmail application close test executed success");
	}
			
		
	
	
	

}
