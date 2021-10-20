package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertionExample {
	
	public static String name = "John";
	public static int i=0;
	public static boolean value = true;
	
	
	@Test
	public static void Sample()
	{
		//Using assert value checks the value
		//giving variable name first and value next
		assertEquals(name, "John");
	}
	@Test
	public static void Integer()
	{
		
		assertEquals(i,0);
	}
	@Test
	public static void Bool()
	{
		assertEquals(value, true);
	}

}
