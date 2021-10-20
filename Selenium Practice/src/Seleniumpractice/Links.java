package Seleniumpractice;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.javac.util.List;

public class Links {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		
		//Click on the homepage link
		WebElement Homepage = driver.findElement(By.linkText("Go to Home Page"));
		Homepage.click();
		driver.navigate().back();
		
		//Partial link
		WebElement PatialLinkHomepage = driver.findElement(By.partialLinkText("Home Page"));
		PatialLinkHomepage.click();
		driver.navigate().back();
		
		//Finding where it is going without clicking it
		WebElement Findlink = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/a"));
		String URL = Findlink.getAttribute("href");
		System.out.println(URL);
		
		//Verify am I broken?
				WebElement verify = driver.findElement(By.linkText("Verify am I broken?"));
				verify.click();
				String t = driver.getTitle();
				if(t.contains("404"))
				System.out.println("Page is broken");
				else
				System.out.println("Page isn't broken");
				driver.navigate().back();
		
		
		//Accesing the homepage interact with the first link
		WebElement HomepageInteract = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/a"));
		HomepageInteract.click();
		
		
		//links available in the page
		String URLNew;
		java.util.List<WebElement> Linksavailable = driver.findElements(By.tagName("a"));
		int j = 0;
		Iterator<WebElement> n = Linksavailable.iterator();
		while(n.hasNext())
		{
			URLNew = n.next().getAttribute("href");
			j++;
			System.out.println(URLNew);
		}
		System.out.println(j);
		
	}

}
