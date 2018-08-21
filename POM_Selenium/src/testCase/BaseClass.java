package testCase;

import org.openqa.selenium.WebDriver;

public class BaseClass
{

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=pageUtility.CallBrowser.Browser("firefox");
		utility.ExcelFunction.writeExcel(driver);
		//driver.quit();
		System.out.println("****************************");
	}
}
