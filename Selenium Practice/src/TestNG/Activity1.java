package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity1 {
	@Test
	public void Gotogoogle()
	{
		//Using System.currenttimemills is to get the time taken for a testcase
		long StartTtime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.close();
		long EndTtime = System.currentTimeMillis();
		long TotalTimeTaken = EndTtime-StartTtime;
		System.out.println("The time Taken for google Testcase = "+TotalTimeTaken);
	}
	@Test
	public void GotoBing()
	{
		long StartTtime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		driver.close();
		long EndTtime = System.currentTimeMillis();
		long TotalTimeTaken = EndTtime-StartTtime;
		System.out.println("The time Taken for Bing Testcase = "+TotalTimeTaken);
	}
	@Test
	public void GotoYahoo()
	{
		long StartTtime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		driver.close();
		long EndTtime = System.currentTimeMillis();
		long TotalTimeTaken = EndTtime-StartTtime;
		System.out.println("The time Taken for Yahoo Testcase = "+TotalTimeTaken);
	}
	@Test
	public void GotoYoutube()
	{
		long StartTtime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.close();
		long EndTtime = System.currentTimeMillis();
		long TotalTimeTaken = EndTtime-StartTtime;
		System.out.println("The time Taken for Youtube Testcase = "+TotalTimeTaken);
	}

}
