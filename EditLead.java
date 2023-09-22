
package homeassignment.wk5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends LoginOutClass {
	//public  ChromeDriver	driver;
	@Test
	public  void editLeadTestcase(){
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter the input values for fields to create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FNameg");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LNameg");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Flocalg");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestDeptg");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description 124");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testemail1@test.com");
		
		//Select State/Province field drop down using select Class visible text option
		WebElement st = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(st);
		sec.selectByVisibleText("New York");
		
		// Click on Create button to create lead
		driver.findElement(By.className("smallSubmit")).click();
		
		// Perform edit action in created lead and validate the updated fields
		driver.findElement(By.linkText("Edit")).click();
		//Edit/Update actions
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test Imp note field");
		driver.findElement(By.className("smallSubmit")).click();
		
		// Get title of resulting page
		String title = driver.getTitle();
		System.out.println("Title of the Resulting Page after updating lead:" +title);
				
	}


}
