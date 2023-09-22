package homeassignment.wk5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends LoginOutClass {

	@Test
	public  void deleteLeadTestcase()throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Search Lead using phone number
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("99");
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
