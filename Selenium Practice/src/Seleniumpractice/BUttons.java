package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BUttons {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//click the first button and go to home page
		
		WebElement HomeClick = driver.findElement(By.id("home"));
		HomeClick.click();
		
		
		//Click on the Buttons again in the the home page
		//WebElement Button = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[2]/a"));
		//Button.click();
		driver.navigate().back();
		
		//Click on the get the position of Button
		WebElement GetPosition = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		org.openqa.selenium.Point xypoint = GetPosition.getLocation();
		int x =xypoint.getX();
		int y =xypoint.getY();
		System.out.println("x y ="+x+" "+y);
		
		//Click on the colour to find the colour
		WebElement FindColour = driver.findElement(By.id("color"));
		String color = FindColour.getCssValue("background-color");
		System.out.println("The given colour is "+color);
		
		//click on the size to get height and width
		WebElement Size = driver.findElement(By.id("size"));
		int height = Size.getSize().getHeight();
		int width = Size.getSize().getWidth();
		System.out.println("The Height and Width is "+ height + " "+ width);
		

	}

}
