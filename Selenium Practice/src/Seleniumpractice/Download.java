package Seleniumpractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/download.html");
		WebElement DownloadExcel = driver.findElement(By.partialLinkText("Download Excel"));
		DownloadExcel.click();

		File location = new File("C:\\Users\\Asus\\Downloads");

		// check each elements whether it is from test leaf

		File[] totalfiles = location.listFiles();
		// list of files so we use for each loop
		for (File file : totalfiles) {
			if (file.getName().equals("testleaf.xlsx"))
			{
				System.out.println("File I want is Downloaded");
				//As break is given after downloading first file it will stop looking for downloads
				
				break;
			}

		}
	}

}
