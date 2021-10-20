package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.leafground.com/pages/tooltip.html");
	
	//checking the tooltip given for the box
	
	  WebElement Tooltip = driver.findElement(By.id("age"));
      System.out.println(Tooltip.getAttribute("title"));
	
	//Using however
	
	WebElement Tooltip1 = driver.findElement(By.id("age"));
	Actions mouse = new Actions(driver);
	mouse.moveToElement(Tooltip1).perform();
	Thread.sleep(2000);
	
}
}
