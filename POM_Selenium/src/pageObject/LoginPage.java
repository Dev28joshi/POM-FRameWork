package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Pagedetails;

public class LoginPage
{
private static WebElement wEle=null;
	
	public static WebElement loginLink(WebDriver driver)
	{
		wEle = driver.findElement(By.xpath(Pagedetails.lkLogin));
		return wEle;
	}
	public static WebElement txt_username(WebDriver driver)
	{
		wEle = driver.findElement(By.xpath(Pagedetails.txt_login));
		return wEle;
	}
	public static WebElement txt_password(WebDriver driver)
	{
		wEle = driver.findElement(By.name(Pagedetails.txt_pwd));
		return wEle;
	}
	public static WebElement btn_login(WebDriver driver)
	{
		wEle = driver.findElement(By.xpath(Pagedetails.btn_login));
		return wEle;
	}
}
