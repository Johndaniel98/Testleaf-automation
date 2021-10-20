package Seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//Selecting the first Four Items
		List<WebElement> Selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		Actions action = new Actions(driver);
		action.clickAndHold(Selectable.get(0));
		action.clickAndHold(Selectable.get(1));
		action.clickAndHold(Selectable.get(2));
		action.clickAndHold(Selectable.get(3));
		action.release().build().perform();
	}

}
