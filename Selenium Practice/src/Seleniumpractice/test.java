package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class test {

    //Do not change this url. Otherwise your evaluation will fail
    public static final String URL = "http://127.0.0.1:4444/wd/hub";

    public static void main(String[] args) throws Exception {

	    //Do not change the below line. Otherwise your evaluation will fail
        @SuppressWarnings("deprecation")
		DesiredCapabilities caps = DesiredCapabilities.phantomjs();

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Hello, World!");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

  }
}
