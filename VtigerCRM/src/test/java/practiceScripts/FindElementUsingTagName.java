package practiceScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementUsingTagName 
{
	public static void main(String[] args)
	{
		//welcome to amazon
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.amazon.com");
		driver.findElement(By.tagName("a"));
		//End of test
			
	}
}
