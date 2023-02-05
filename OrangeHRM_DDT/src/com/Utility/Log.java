package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log
{
	public static Logger Log=Logger.getLogger("Log");
	public static void info(String Message)
	{
	 PropertyConfigurator.configure("C:\\Users\\Dell\\Desktop\\Eclipse1\\OrangeHRM_DDT\\logFiles\\Log4j.properties");
	 Log.info(Message);
	}
	
	
	
	

}
