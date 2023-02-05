package com.StringComparision;

public class StringCompare
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String string1="Livetech";
		System.out.println("The character at the Index of the string is:"+string1.charAt(3));
		
		int CharacterAtAnIndex=string1.charAt(0);
		System.out.println("The character of the Index os string related ASCII Value is:"+ CharacterAtAnIndex);
		
		
		System.out.println("#### string values convertion To upper casre & Lower cases ########");
		
		String string3="SELENIUM";
		String convertedStringValueToLowerCase=string3.toLowerCase();
		System.out.println(" The string after coverted to lower case value is:"+convertedStringValueToLowerCase);
		
		String string4="ammi";
		String convertedStringValueToUpperCase=string4.toUpperCase();
		System.out.println(" The string after converted to upper cse is:" +convertedStringValueToUpperCase);
		
		System.out.println("@@@ String Comparision @@@");
		
		String string5="Live Tech";
		String string6="Live tech";
		if(string5.equals(string6))
		{
			System.out.println("Both String variable string5 and string6 are Equals");
		}
		else
		{
			System.out.println("Both String5 and string6 are not equals");
		}
		
System.out.println("==  string should be Equal but Lower case and Upper case letter+ should be ignored===" );
		String string7="Web Driver";
		String string8="web driver";
		
		if(string7.equalsIgnoreCase(string8))
		{
			System.out.println("Both the string6 and string7 are Equal ");
		}
		else
		{
			System.out.println("Both the string6 and string7 are not equal");
		}
		
		System.out.println(" Checking for Existence of string Texts ");
		
		String string9="Live Tech";
		String string10=" Tech ";
		if(string9.contains(string10))
		{
			System.out.println("Expected value of string10 found in string9");
		}
		else
		{
			System.out.println("string10 not found in string9");
		}
		
		System.out.println("^^^ compare string-Ignore case ^^^");
		
		String string11=" SELENIUM";
		String string12=" selenium";
		if(string11.equalsIgnoreCase(string12))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		

	}

}
