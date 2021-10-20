package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("jodan@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input")).sendKeys("Jodan");
		String s = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(s);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input")).clear();
		//driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input")).isEnabled();
		boolean a = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input")).isEnabled();
		System.out.println(a);

	}

}
