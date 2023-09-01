package homeassignment.wk2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	
	public static void main(String[] args) {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL
        driver.get("http://leaftaps.com/opentaps/control/login");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Locate the Weblement and pass values to them - Send USer NAme and Password to Login
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demoSalesManager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		      
		// Navigate to Create Contact Page
		driver.findElement(By.partialLinkText("CRM/SFA")).click();		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
	
		// Enter value for the given fields and create a contact
		
		driver.findElement(By.id("firstNameField")).sendKeys("John");
		driver.findElement(By.id("lastNameField")).sendKeys("Jacob");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("LocalF");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LocalL");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("TestDept2");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test Description 223");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Testjohn@test.com");
		
		//Select State/Province field drop down using select Class visible text option
		WebElement st = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sec = new Select(st);
		sec.selectByVisibleText("New York");
		
		// Click on Create Contact to create contact
		driver.findElement(By.className("smallSubmit")).click();
		
		// Edit the contact and update
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("ImpNote for Update");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		// Title of the page
		String title = driver.getTitle();
		System.out.println("Page Title : " +title);
		
		//Close the browser
		driver.close();	
				
		
		
		
	}

}
