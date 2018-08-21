package pageUtility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import appModule.Register_page_fun;
import utility.ExcelFunction;

public class CallFunction 
{
	List<String> getResultValue = new ArrayList<>();
	List<String> getResultValue1 = new ArrayList<>();
	//static WebDriver driver;
public	List<String> getResult(WebDriver driver) throws InterruptedException
	{
	Register_page_fun dp = new Register_page_fun();
		ExcelFunction efo = new ExcelFunction();
		getResultValue= efo.gettcNstatus();
		for(int i=0;i<getResultValue.size();i++)
		{
			if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("OpenBrowser"))
			{
				dp.OpenBrowser(driver);
				getResultValue1.add("True");
				
			}
			else if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("Link"))
			{
				dp.Link(driver);
				getResultValue1.add("True");
			}
			else if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("Verification"))
			{
				getResultValue1.add("True");
			}
			else if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("Register"))
			{
				getResultValue1.add("True");
			}
			else if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("CloseBrowser"))
			{
				dp.CloseBrowser(driver);
				getResultValue1.add("True");
			}
			else if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("openLink"))
			{
				pageObject.HomePage.openLink(driver);
				getResultValue1.add("True");
			}
			else if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("registration"))
			{
				appModule.UserRegistration.registration(driver);
				getResultValue1.add("True");
			}
			else if(getResultValue.get(i)!=null && getResultValue.get(i).equalsIgnoreCase("login_User"))
			{
				appModule.UserLogin.login_User(driver);
				getResultValue1.add("True");
			}
			
			else 
			{
				getResultValue1.add("False");
			}
		}
		return getResultValue1;
		
	}
	public static void Threadcall(int i) throws InterruptedException 
	{
			Thread.sleep(i);
		
	}
}
