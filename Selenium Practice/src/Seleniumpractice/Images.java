package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Images {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//Clicking image and going to link
		WebElement Homepage = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img"));
		Homepage.click();
		/*
		if(Homepage.getAttribute("naturalWidth").equals("0"))
			System.out.println("Image is broken");
		else 
			System.out.println("Its not broken");
			*/
		driver.navigate().back();
		
		//Checking the broken image
		WebElement Brokenimage = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
		if(Brokenimage.getAttribute("naturalWidth").equals("0"))
			System.out.println("Image is broken");
		else 
			System.out.println("Its not broken");
		
		//Clicking the image using the Keyboard or Mouse
		WebElement Clicking = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/img"));
		Actions actions = new Actions(driver);
		actions.click(Clicking).perform();
		
	
	}

}
