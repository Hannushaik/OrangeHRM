package com.Testing;

import org.testng.annotations.Test;

public class Annotations
{
	@Test(priority=1)
	public void gmailApplicationLaunch()
	{
		System.out.println("  Gmail application Launch test executed success");
	}
	//==============================================
	
	@Test(priority=2)
	public void gmailInBoxTest()
	{
		System.out.println(" Gmail InBoxTest executed successfully");
	}
	@Test(priority=3)       
	public void GmailComposeMailTest()
	{
		System.out.println( " compose test executed successfully");
	}
	
	//================================================
	
	@Test(priority=4)
	public void gmailsentMailTest()
	{
		System.out.println(" Sent mail test executed successfull");
	}
	//=============================================
			
	@Test(priority=5)
	public void gmailApplicattionclose()
	{
		System.out.println(" gmail application close test executed success");
	}
			
			
}
