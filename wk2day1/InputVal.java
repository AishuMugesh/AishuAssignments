package homeassignment.wk2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputVal {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL which has Dropdown Fields
        driver.get("https://leafground.com/input.xhtml");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		// Locate and access all drop downs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		// Locate the input Box using locators/Xpath and send values to them
		
		WebElement ip1 = driver.findElement(By.id("j_idt88:name"));
		ip1.clear();
		ip1.sendKeys("Janani");
		WebElement ip2 = driver.findElement(By.id("j_idt88:j_idt91"));
		ip2.clear();
		ip2.sendKeys("Trichy");
		boolean ip3 = driver.findElement(By.xpath("(//div[@class='grid formgrid']//div)[3]")).isEnabled();
		System.out.println("Disabled field :" +ip3);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		WebElement ip4 = driver.findElement(By.id("j_idt88:j_idt97"));
		String ss = ip4.getAttribute("value");
		System.out.println("REtrieved Text from input box : " +ss);
		WebElement ip5 = driver.findElement(By.id("j_idt88:j_idt99"));
		ip5.sendKeys("check@mail.com");
		ip5.sendKeys(Keys.TAB);
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("testing testing");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("TEST121319371283729837TWST!#@TEWSasds#$#343");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		WebElement ip6 = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
		String errMsg = ip6.getText();
		System.out.println("Error Message : " +errMsg);
		
		//Close the browser
		driver.close();
		
		
	
		
	}
}
