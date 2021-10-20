package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TryingDifferentAnationsPractice {
	
	@BeforeTest
	public void Fuel()
	{
		System.out.println("Check Fuel");
	}
	@BeforeSuite
	public void Key()
	{
		System.out.println("Use The Key");
	}
	@Test
	public void Start()
	{
		System.out.println("Start The Car");
	}
	@AfterTest
	public void Off()
	{
		System.out.println("Turnoff");
	}
	

}
