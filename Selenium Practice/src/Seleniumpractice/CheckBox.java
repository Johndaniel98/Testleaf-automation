package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//Select the languages you know Checkbox
		WebElement languages1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		languages1.click();
		WebElement languages2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[2]/input"));
		languages2.click();
		WebElement languages3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[3]/input"));
		languages3.click();
		WebElement languages4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[4]/input"));
		languages4.click();
		
		//Check it is selected
		WebElement Check = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		boolean Chk = Check.isSelected();
		if(Chk)
		System.out.println("It is Checked");
		else
			System.out.println("It is not Checked");
		
		//Deselect the checked
		WebElement select = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
		
		if(select.isSelected())
		{
		System.out.println("1st is Selected");
		select.click();
		}
		
		/* boolean result1 = select.isSelected();
		 if(result1)
		System.out.println("It is Checked");
		else
			System.out.println("It is not Checked"); */
		
		WebElement Deselect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
		
		if(Deselect.isSelected())
		{
		System.out.println("2nd is Selected");
		Deselect.click();
		}
		
		/* boolean result2 = Deselect.isSelected();
		if(result2)
		System.out.println("It is Checked");
		else
			System.out.println("It is not Checked");*/
		
		
		//Select all the CheckBox
		WebElement Option1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[1]/input"));
		Option1.click();
		WebElement Option2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[2]/input"));
		Option2.click();
		WebElement Option3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[3]/input"));
		Option3.click();
		WebElement Option4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input"));
		Option4.click();
		WebElement Option5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[5]/input"));
		Option5.click();
		
		
		
	}

}
