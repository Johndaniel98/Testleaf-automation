package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

public class DropDown2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement OptionsDropDown = driver.findElement(By.className("dropdown"));
		Select Options = new Select(OptionsDropDown);
		java.util.List<WebElement> Listname = Options.getOptions();
		int count = List.size();
		System.out.println(count);
	}

}
