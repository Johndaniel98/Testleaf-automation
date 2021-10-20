package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	@BeforeTest
	public static void test1()
	{
		System.out.println("This is Testcase 1");
	}
	@Test
	public static void test2()
	{
		System.out.println("his is Testcase 2");
	}
	@AfterTest
	public static void test3()
	{
		System.out.println("his is Testcase 3");
	}
	
}
