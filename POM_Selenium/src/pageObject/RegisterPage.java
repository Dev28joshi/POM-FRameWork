package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Pagedetails;

public class RegisterPage
{
	private static WebElement wEle=null;
	
	public static WebElement registerLink(WebDriver driver)
	{
		wEle = driver.findElement(By.xpath(Pagedetails.lk_reg));
		return wEle;
	}
	
	public static WebElement genderCb(WebDriver driver)
	{
		wEle = driver.findElement(By.id(Pagedetails.genderchk));
		return wEle;
	}
	
	public static WebElement txtFirstName(WebDriver driver)
	{
		wEle = driver.findElement(By.id(Pagedetails.txtfirstName));
		return wEle;
	}
	
	public static WebElement txtLasttName(WebDriver driver)
	{
		wEle = driver.findElement(By.id(Pagedetails.txtLastName));
		return wEle;
	}
	
	public static WebElement eMail(WebDriver driver)
	{
		wEle = driver.findElement(By.id(Pagedetails.email));
		return wEle;
	}
	public static WebElement pwd(WebDriver driver)
	{
		wEle = driver.findElement(By.id(Pagedetails.pwd));
		return wEle;
	}
	public static WebElement cnpwd(WebDriver driver)
	{
		wEle = driver.findElement(By.id(Pagedetails.cnpw));
		return wEle;
	}
	public static WebElement btn_register(WebDriver driver)
	{
		wEle = driver.findElement(By.id(Pagedetails.btnReg));
		return wEle;
	}
}
