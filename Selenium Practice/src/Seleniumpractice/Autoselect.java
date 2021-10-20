package Seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		// Finding the tag

		WebElement Select = driver.findElement(By.id("tags"));
		Select.sendKeys("s");
		Thread.sleep(2000);

		// Capturing the list of courses available

		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(options.size());

		for (WebElement webElement : options) {
			if (webElement.getText().equals("SOAP")) {
				webElement.click();

				break;
			}
		}
	}

}
