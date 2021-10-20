package Seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		//Rearranging the item
		//List<WebElement> reorder = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		Actions drag = new Actions(driver);
		drag.dragAndDrop(driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[7]")), driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[1]")));
		drag.dragAndDrop(driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[6]")), driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[1]")));
		drag.dragAndDrop(driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[5]")), driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[1]")));
		drag.dragAndDrop(driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[4]")), driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[1]")));
		drag.dragAndDrop(driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[3]")), driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[1]")));
		drag.dragAndDrop(driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[2]")), driver.findElement(By.xpath("/html/body/div/div/div[3]/ul/li[1]")));
		drag.build().perform();
	}

}
