package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		 driver.get("https://selenium-apps.doselect.in/flag_match/");
//	        WebElement element2 = driver.findElement(By.id("white"));
//	        WebElement element3 = driver.findElement(By.id("blue"));
//	        WebElement element1 = driver.findElement(By.id("red"));
//	        WebElement top = driver.findElement(By.xpath("/html/body/greenbox/target[1]"));
//	        WebElement middle = driver.findElement(By.xpath("/html/body/greenbox/target[2]"));
//	        WebElement bottom = driver.findElement(By.xpath("/html/body/greenbox/target[3]"));
//	        Actions a = new Actions (driver);
//	        a.dragAndDrop(element3, bottom).build().perform();
//	        a.dragAndDrop(element2, middle).build().perform();
//	        a.dragAndDrop(element1, top).build().perform();
		
		
		driver.get("https://selenium-apps.doselect.in/to-do-list/");
        WebElement element = driver.findElement(By.xpath("/html/body/div/form/input"));

        element.sendKeys("Taskone");
        WebElement element2 = driver.findElement(By.xpath("/html/body/div/div"));
        element2.click();
        element2.sendKeys("TaskTwo");
        element2.click();
        element.sendKeys("TaskThree");
        element.click();
        WebElement element3 = driver.findElement(By.xpath("/html/body/div/ol/li[2]"));
        Actions a = new Actions(driver);
        a.doubleClick(element3).build().perform();
	}

}
