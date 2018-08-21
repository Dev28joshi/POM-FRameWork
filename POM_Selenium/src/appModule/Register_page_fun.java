package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_page_fun 
{
	
	public  void OpenBrowser(WebDriver driver)
	{
		driver.get(utility.Pagedetails.url);
	}
	public 	void Link(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
	}
	public 	void Verification(WebDriver driver)
	{
		WebElement verify =driver.findElement(By.xpath("//h1[text()='Register']"));
		String verifyname= verify.getText();
		System.out.println(verifyname);
		
		WebElement verify1 =driver.findElement(By.xpath("//strong[text()='Your Personal Details']"));
		String verifyname1= verify1.getText();
		System.out.println(verifyname1);
		
		WebElement verify2 =driver.findElement(By.xpath("//strong[text()='Your Password']"));
		String verifyname2= verify.getText();
		System.out.println(verifyname2);
	}
	public 	void Register(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
	}
	public 	void CloseBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
