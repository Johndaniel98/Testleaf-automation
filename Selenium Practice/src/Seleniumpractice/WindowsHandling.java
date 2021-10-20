package Seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		//Initializing it as a parent window
		String parent = driver.getWindowHandle();
		
		//New homepage window
		WebElement Homepage = driver.findElement(By.id("home"));
		Homepage.click();
		
		//redirecting to newly opened window for that we are adding window handles
		Set<String> windows = driver.getWindowHandles();
		for (String next: windows)
		{
			driver.switchTo().window(next);
		}
		WebElement Edit = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/h5"));
		Edit.click();
		
		//closing the newly opened window
		driver.close();
		
		//Switching back to parent window
		driver.switchTo().window(parent);
		
		//finding count
		WebElement Count = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		Count.click();
		
		//.size is to count the number of windows
		int number = driver.getWindowHandles().size();
		System.out.println(number);
		
		// another way of getting o/p
	   //System.out.println(driver.getWindowHandles().size());
		
		//close opened windwow
		WebElement Dontcloseme = driver.findElement(By.id("color"));
		Dontcloseme.click();
		
		Set<String> closewindows = driver.getWindowHandles();
		for (String n : closewindows)
		{
		}
	}

}
