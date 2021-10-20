package Seleniumpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SortTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		List<WebElement> Name = driver.findElements(By.xpath("//td[2]"));
		
		ArrayList<String> list = new ArrayList<String>();
 		
		for (WebElement webElement : Name) {
			System.out.println(webElement.getText());
			list.add(webElement.getText());
		}
		
		System.out.println("The New List Contents are: \n"+list);
		
		Collections.sort(list);
		System.out.println("The New List Contents are: \n"+list);
		
		driver.close();
		
		//Click on the name header
		
				WebElement NameHeader = driver.findElement(By.xpath("//th[2]"));
				NameHeader.click();
				
				//Again all the value and store in list
				List<WebElement> Name1 = driver.findElements(By.xpath("//td[2]"));
				ArrayList<String> list1 = new ArrayList<String>();
				for (WebElement webElement : Name1) {
					System.out.println(webElement.getText());
					//Put it in a an array list add the elements
					list1.add(webElement.getText());
				}
				
				System.out.println("The new list contents are: \n" +list1);
				Collections.sort(list1);
				
				System.out.println("The new list contents are: \n" +list1);
				 if (list.equals(list1))
			            System.out.println("Equal");
			        else
			            System.out.println("Not equal");
	}

}
