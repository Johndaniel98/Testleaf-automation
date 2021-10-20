package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		
		WebElement from = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		//actions.dragAndDrop(from, to).build().perform();
		actions.dragAndDropBy(from, 120, 90).perform();
		actions.dragAndDropBy(from, 12, 80).perform();
	}
}
