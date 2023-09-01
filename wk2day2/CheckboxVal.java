package homeassignment.wk2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxVal {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL which has Dropdown Fields
        driver.get("https://leafground.com/checkbox.xhtml");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		// Locate and access all check boxes
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//span[contains(text(),'Ajax')]")).click();
	    WebElement cb1 = driver.findElement(By.xpath("//div[@class='ui-growl-item']"));
		boolean growlMsg = cb1.isDisplayed();
		System.out.println("Growl Message displays : " +growlMsg);
		String msg = cb1.getText();
		System.out.println("Growl Message is : " +msg );
		driver.findElement(By.id("j_idt87:j_idt100")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		//driver.findElement(By.xpath("//div[@id='j_idt87:multiple']//label[contains(text(),'London')]")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
		Thread.sleep(2000);
		//Close the Browser
		driver.close();
	}	
}
