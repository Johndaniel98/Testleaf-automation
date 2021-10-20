package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class RadioButtons {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//Enjoying the class
		WebElement EnjoyingClass = driver.findElement(By.id("yes"));
		EnjoyingClass.click();
		
		//Finding default selected
		WebElement Option1 = driver.findElement(By.name("news"));
		WebElement Option2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		boolean Opt1 = Option1.isSelected();
		boolean Opt2 =  Option2.isSelected();
		if(Opt1)
			System.out.println("Option 1 is Checked");
		if(Opt2)
			System.out.println("Option 2 is Checked");
		
		//Selecting age group
		WebElement AgeOption1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		WebElement AgeOption2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[2]"));
		WebElement AgeOption3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
		boolean AOpt1 = AgeOption1.isSelected();
		boolean AOpt2 =  AgeOption2.isSelected();
		boolean AOpt3 =  AgeOption3.isSelected();
		if(!AOpt1)
			AgeOption1.click();
			System.out.println("Age 1 to 20 is Selected");
		if(!AOpt2)
			AgeOption2.click();
			System.out.println("Age 20 to 40 is Selected");
		if(!AOpt3)
			AgeOption3.click();
			System.out.println("Age Above 40 is Selected");
	}

}
