package homeassignment.wk2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownVal {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL which has Dropdown Fields
        driver.get("https://leafground.com/select.xhtml");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		// Locate and access all drop downs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dd1 = driver.findElement(By.className("ui-selectonemenu"));
		Select sec = new Select(dd1);
		sec.selectByIndex(1);
		
		WebElement dd2 = driver.findElement(By.id("j_idt87:country_label"));
		dd2.click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[contains(text(),'India')]")).click();
		
		Thread.sleep(2000);
		WebElement dd3 = driver.findElement(By.id("j_idt87:city_label"));
		dd3.click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[contains(text(),'Chennai')]")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary ui-icon ui-icon-triangle')]")).click();
		driver.findElement(By.xpath("//span[contains(@id,'j_idt87:auto-complete_panel')]//li[contains(text(),'Selenium WebDriver')]")).click();
		
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[contains(text(),'Tamil')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//li[contains(text(),'மூன்று')]")).click();
		//Close the browser
		driver.close();
				
	}
}
