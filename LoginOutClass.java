package homeassignment.wk5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginOutClass {
	public  ChromeDriver	driver;
	
	@BeforeMethod
	public void  Login()
	{
	//Instantiate Chrome driver
	 driver = new ChromeDriver();
	//Open the URL
    driver.get("http://leaftaps.com/opentaps/control/login");
    // Maximize the browser Window
	driver.manage().window().maximize();
	
	// Locate the Weblement and pass values to them - Send USer NAme and Password to Login
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("demoSalesManager");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	      
	// Navigate to Create Leads page
	driver.findElement(By.partialLinkText("CRM/SFA")).click();		
}
	@AfterMethod
	public void Logout()
	{
		//Close the browser
		driver.close();
	}
}

