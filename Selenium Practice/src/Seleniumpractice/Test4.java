package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium-apps.doselect.in/jquery-alertable/");
        WebElement element = driver.findElement(By.xpath("/html/body/button[5]"));
        element.click();
        WebElement username = driver.findElement(By.xpath("/html/body/form/div[2]/input[1]"));
        username.sendKeys("johndoe");
        WebElement password = driver.findElement(By.xpath("/html/body/form/div[2]/input[2]"));
        password.sendKeys("foobar");
        WebElement checkbox = driver.findElement(By.xpath("/html/body/form/div[2]/label/input"));
        checkbox.click();
        WebElement ok = driver.findElement(By.xpath("/html/body/form/div[3]/button[2]"));
        ok.click();
        System.out.println(driver.getTitle());
        driver.quit();
	}

}
