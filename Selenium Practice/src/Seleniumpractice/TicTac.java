package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TicTac {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver john = new FirefoxDriver();
		john.get("https://selenium-apps.doselect.in/tic-tac-toe/");
		john.findElement(By.xpath("/html/body/div/ul/li[1]")).click();
		john.findElement(By.xpath("/html/body/div/ul/li[2]")).click();
		john.findElement(By.xpath("/html/body/div/ul/li[3]")).click();
		john.findElement(By.xpath("/html/body/div/ul/li[4]")).click();
		john.findElement(By.xpath("/html/body/div/ul/li[5]")).click();
		john.findElement(By.xpath("/html/body/div/ul/li[6]")).click();
		john.findElement(By.xpath("/html/body/div/ul/li[7]")).click();
	    String s=john.findElement(By.xpath("/html/body/div/div/span[1]")).getText();
	    System.out.println(s);

	}
}
