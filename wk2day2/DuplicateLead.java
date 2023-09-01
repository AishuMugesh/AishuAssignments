package homeassignment.wk2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL
        driver.get("http://leaftaps.com/opentaps/control/login");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Locate the WebElement and pass values to them - Send USer NAme and Password to Login
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demoSalesManager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		      
		// Navigate to Find Leads page and search for Lead using Email
		driver.findElement(By.partialLinkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ags");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		String txt = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).getText();
		System.out.println("Captured First Lead ID name :" +txt);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).click();
		
		// Duplicate the Lead
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		String title = driver.getTitle();
		System.out.println("Page Title : " +title);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String dupLeadid = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println("Duplicate Lead Name : " +dupLeadid);
		
		if(txt.equals(dupLeadid))
		System.out.println("Created and Duplicate Lead Name matches");
		else
		System.out.println("Created and Duplicate Lead Name not matches");
		
		//Close the browser
		driver.close();	
			
	}
}
