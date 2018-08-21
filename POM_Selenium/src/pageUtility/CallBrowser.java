package pageUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallBrowser 
{
	static WebDriver driver;
	public static WebDriver Browser(String browser)
	{
		if(browser!=null&&browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zeus\\Desktop\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser!=null&&browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Zeus\\Desktop\\Selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser!=null&&browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Zeus\\Desktop\\Selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}
}
