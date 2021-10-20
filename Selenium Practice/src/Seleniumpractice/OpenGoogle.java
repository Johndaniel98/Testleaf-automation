package Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	public static void main(String[] args) {
		
		//Tell the system which browser u gonna use
		//Creating object for the browser
		//using that object open url
		//Do whatever u want
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}

}
