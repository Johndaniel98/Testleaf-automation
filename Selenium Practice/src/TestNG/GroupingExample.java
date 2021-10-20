package TestNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = "Apple")
	public static void Apple()
	{
		System.out.println("This is first test in Apple");
	}
	public static void Apple1()
	{
		System.out.println("This is second test in Apple");
	}
	public static void Apple2()
	{
		System.out.println("This is third test in Apple");
	}
	
	@Test
	public static void Samsung()
	{
		System.out.println("This is Samsung");
	}
	@Test
	public static void Samsung1()
	{
		System.out.println("This is Samsung1");
	}
	@Test
	public static void Samsung2()
	{
		System.out.println("This is Samsung2");
	}
	@Test
	public static void Moto()
	{
		System.out.println("This is Moto");
	}
	@Test
	public static void Moto1()
	{
		System.out.println("This is Moto1");
	}
	@Test
	public static void Moto2()
	{
		System.out.println("This is Moto2");
	}
	@Test
	public static void Oneplus()
	{
		System.out.println("This is 1+");
	}
	public static void Oneplus1()
	{
		System.out.println("This is 1+1");
	}
	public static void Oneplus2()
	{
		System.out.println("This is 1+2");
	}
}
