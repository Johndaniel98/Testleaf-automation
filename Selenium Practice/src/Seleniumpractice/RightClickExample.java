package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.handler.ContextHandler.AliasCheck;

public class RightClickExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		WebElement Explore = driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[1]/ytd-topbar-logo-renderer/a/div/yt-icon"));
		Actions act = new Actions(driver);
		act.contextClick(Explore);
		
		//it is wrong
		AliasCheck screenshot;
	}

}
