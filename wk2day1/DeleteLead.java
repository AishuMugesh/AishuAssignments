package homeassignment.wk2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL
        driver.get("http://leaftaps.com/opentaps/control/login");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Locate the Weblement and pass values to them - Send USer NAme and Password to Login
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demoSalesManager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		      
		// Navigate to Find Leads page and search for Lead using Phone Number
		driver.findElement(By.partialLinkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Search Lead using phone number
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("100");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		String txt = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println("Captured First Lead ID:" +txt);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		// Delete the Lead
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		//Check for the deleted lead Id
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(txt);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		WebElement txt2 = driver.findElement(By.className("x-paging-info"));
		System.out.println("Result of searching deleted lead: "+txt2.getText());
		

		//Close the browser
		driver.close();
		
		
			}
}
