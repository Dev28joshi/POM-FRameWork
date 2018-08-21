package appModule;

import org.openqa.selenium.WebDriver;

import pageObject.LoginPage;
import utility.ClassExcel;
import utility.Pagedetails;

public class UserLogin 
{
	public static void login_User(WebDriver driver) throws InterruptedException 
	{
		try {
		LoginPage.loginLink(driver).click();
		pageUtility.CallFunction.Threadcall(5000);
		LoginPage.txt_username(driver).sendKeys(Pagedetails.login_email);
		LoginPage.txt_password(driver).sendKeys(Pagedetails.Login_pwd);
		LoginPage.btn_login(driver).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
