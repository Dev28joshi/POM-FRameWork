package appModule;

import org.openqa.selenium.WebDriver;

import pageObject.RegisterPage;
import utility.Pagedetails;

public class UserRegistration 
{
	public static void registration(WebDriver driver) throws InterruptedException 
	{
		try
		{
		pageObject.HomePage.openLink(driver);
		RegisterPage.registerLink(driver).click();
		pageUtility.CallFunction.Threadcall(5000);
		RegisterPage.genderCb(driver).click();
		RegisterPage.txtFirstName(driver).sendKeys(Pagedetails.login_username);
		RegisterPage.txtLasttName(driver).sendKeys(Pagedetails.login_usernamelast);
		RegisterPage.eMail(driver).sendKeys(Pagedetails.email);
		RegisterPage.pwd(driver).sendKeys(Pagedetails.pwd);
		RegisterPage.cnpwd(driver).sendKeys(Pagedetails.Login_cpwd);
		RegisterPage.btn_register(driver).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
