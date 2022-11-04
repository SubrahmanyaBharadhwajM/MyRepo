package practiceScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSourceOfFlipkartApplication 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.amazon.com");
		String PS = driver.getPageSource();
		System.out.println(PS);
	}
}
