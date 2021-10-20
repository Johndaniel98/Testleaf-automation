package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		
		//Hover and click testleaf
		WebElement Testleaf = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/a"));
		Actions Mouse = new Actions(driver);
		Mouse.moveToElement(Testleaf).perform();
		WebElement Selenium = driver.findElement(By.xpath("/html/body/div/div/div[5]/ul/li/ul/li[1]/a"));
		Selenium.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert okSelenium = driver.switchTo().alert();
		Thread.sleep(2000);
		okSelenium.accept();
	//	Actions OkSeleniumAlert = new Actions(driver);
	//	OkSeleniumAlert.moveToElement(Selenium)
		
	//  RPA
		WebElement Testleaf1 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/a"));
		Actions Mouse1 = new Actions(driver);
		Mouse1.moveToElement(Testleaf1).perform();
		Thread.sleep(2000);
		WebElement RPA = driver.findElement(By.xpath("/html/body/div/div/div[5]/ul/li/ul/li[2]/a"));
		Thread.sleep(2000);
		RPA.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert okRPA = driver.switchTo().alert();
		Thread.sleep(2000);
		okRPA.accept();
		
		

	}
}
