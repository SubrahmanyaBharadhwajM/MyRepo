package practiceScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getPage 


{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.close();
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https:/www.amazon.com");
		driver1.close();
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver2= new EdgeDriver();
		driver2.get("https:/www.snapdeal.com");
		driver2.close();
	}
}
