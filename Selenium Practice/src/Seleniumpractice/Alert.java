package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//Alert Box
		WebElement Alertbox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		Alertbox.click();
		Thread.sleep(1000);
		org.openqa.selenium.Alert okalert = driver.switchTo().alert();
		okalert.accept();
		
		//Confirm box
		WebElement ConfirmBox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		ConfirmBox.click();
		Thread.sleep(0);
		org.openqa.selenium.Alert confirm = driver.switchTo().alert();
		confirm.accept();
		//confirm.dismiss(); //To Cancel the option
		
		//Prompt Box
		WebElement PromptBox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		PromptBox.click();
		org.openqa.selenium.Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("John");
		Thread.sleep(2000);
		prompt.accept();
		
		//Line Breaks
		WebElement Linebreak = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		Linebreak.click();
		org.openqa.selenium.Alert line = driver.switchTo().alert();
		Thread.sleep(2000);
		line.accept();
		
		//Sweet alert
		WebElement SweetAlert = driver.findElement(By.id("btn"));
		SweetAlert.click();
		SweetAlert.sendKeys(Keys.ESCAPE);
		
	}

}
