package homeassignment.wk2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter the input values for fields to create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestGCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LName");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Flocal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestDept");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description 123");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testemail@test.com");
		
		//Select State/Province field drop down using select Class visible text option
		WebElement st = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(st);
		sec.selectByVisibleText("New York");
		
		// Click on Create button to create lead
		driver.findElement(By.className("smallSubmit")).click();
		
		// Get title of resulting page
		String title = driver.getTitle();
		System.out.println("Title of the Resulting Page after creating lead:" +title);
		
		//Close the browser
		driver.close();

	}

}
