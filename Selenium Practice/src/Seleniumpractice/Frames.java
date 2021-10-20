package Seleniumpractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//Clicking inside a first frame
		driver.switchTo().frame(0);
		WebElement Button1 = driver.findElement(By.id("Click"));
		Button1.click();
		//System.out.println(Button1.getText());
		
		if(Button1.getText().equals("Hurray! You Clicked Me."))
		{
			System.out.println("Button has been clicked");
		}
		else
		{
			System.out.println("Button has not been clicked");
		}
		
		driver.switchTo().defaultContent();
		
		//Clicking in the nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement Button2 = driver.findElement(By.id("Click1"));
		Button2.click();
		driver.switchTo().defaultContent();
		
		//Finding total number of frame
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		count.size();
		System.out.println(count.size());
		 
		
		

	}

}
