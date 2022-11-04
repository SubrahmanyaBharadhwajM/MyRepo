package practiceScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLoFFlipkartApplication 

{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipcart.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String url = driver.getCurrentUrl();
	}
}