package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownBox {


	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		/*
		
		//Selecting Using Index
		WebElement IndexDropDown = driver.findElement(By.id("dropdown1"));
		org.openqa.selenium.support.ui.Select Name = new org.openqa.selenium.support.ui.Select(IndexDropDown);
		Name.selectByIndex(2);
		
	
		
		//Selecting Using Text
		WebElement TextDropDown = driver.findElement(By.name("dropdown2"));
		Select Text = new Select(TextDropDown);
		Text.selectByVisibleText("Loadrunner");
		
		//Select Using Value
		WebElement ValueDropDown = driver.findElement(By.id("dropdown3"));
		Select Value = new Select(ValueDropDown);
		Value.selectByValue("3");
		/*
		
		//Get DropDown Options
		WebElement OptionsDropDown = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/select"));
		Select Options = new Select(OptionsDropDown);
		List<WebElement> List = Options.getOptions();
		int count = List.size();
		System.out.println(count);
		*/
		
		//Select Using Send Keys
		WebElement SendkeysDropDown = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		SendkeysDropDown.sendKeys("S");
		
		//Selecting multiple options in dropdown
		WebElement MultipleOptions = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select multiple = new Select(MultipleOptions);
		multiple.selectByIndex(4);
		multiple.selectByIndex(1);
		
		
		
	}

}
