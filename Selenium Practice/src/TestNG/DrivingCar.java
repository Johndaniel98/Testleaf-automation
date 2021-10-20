package TestNG;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

//Setting The Priority

public class DrivingCar {
	@Test(priority = 0,enabled = false)
	public void StarttheCar()
	{
		System.out.println("Car is started");
	}
	//Depends on ...proceeds the test obly if the given method pass
	@Test(priority = 2,dependsOnMethods = "StarttheCar")
	public void FirstGear()
	{
		System.out.println("Car is in First Gear");
	}
	@Test(priority = 3)
	public void SecondGear()
	{
		System.out.println("Car is in Second Gear");
	}
	@Test(priority = 4)
	public void ThirdGear()
	{
		System.out.println("Car is in Third Gear");
	}
	@Test(priority = 5)
	public void ReverseGear()
	{
		System.out.println("Car is in Reverse Gear");
	}
	//Skipping the test Case by using enabled Function
	@Test(priority = 1,enabled = false)
	public void TurnonMusic()
	{
		System.out.println("Music Player is ON");
	}
}
