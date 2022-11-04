package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic 
{
	public class TestNGExample2 
	{
		@Test
		
		public void instagramLogin()
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.instagram.com");
			Reporter.log("insta",true);
		}
		
		@Test
		public void vtiger()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost:8888");
			Reporter.log("vtiger",true);
		}
	}


}
