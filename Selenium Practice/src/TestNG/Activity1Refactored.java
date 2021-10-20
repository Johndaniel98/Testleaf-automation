package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Activity1Refactored {

		public static WebDriver driver;
		public static long StartTime;
		public static long EndTime;
		public static long TotalTimeTaken;
	
		@BeforeSuite
		public static void BeforeTest() {
			StartTime = System.currentTimeMillis();
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		@AfterSuite
		public static void AfterTest() {
			driver.quit();
			long EndTtime = System.currentTimeMillis();
			long TotalTimeTaken = EndTtime - StartTime;
			System.out.println("The time Taken for google Testcase = " + TotalTimeTaken);
		}
	
		@Test
		public static void Gotogoogle() {
			// Using System.currenttimemills is to get the time taken for a testcase
	
			driver.get("https://www.google.com/");
	
		}
	
		@Test
		public static void GotoBing() {
	
			driver.get("https://www.bing.com/");
	
		}
	
		@Test
		public void GotoYahoo() {
	
			driver.get("https://in.yahoo.com/");
	
		}
	
		@Test
		public static void GotoYoutube() {
	
			driver.get("https://www.youtube.com/");
	
		}
	
	}
