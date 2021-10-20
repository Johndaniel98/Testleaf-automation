package Seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToDisapper {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/disapper.html");
		
	//  Wait for the button to disappear
		WebElement ButtonClickDisappear = driver.findElement(By.id("btn"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		if(wait.until(ExpectedConditions.invisibilityOf(ButtonClickDisappear)))
			System.out.println("Button is Invisible");
		else
			System.out.println("Button is Visible");

	 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
