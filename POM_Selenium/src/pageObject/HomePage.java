package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Pagedetails;

public class HomePage 
{

	public static void openLink(WebDriver driver)
	{
		driver.get(utility.Pagedetails.url);
	}
}
