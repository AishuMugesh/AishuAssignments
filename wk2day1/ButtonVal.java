package homeassignment.wk2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonVal {
	public static void main(String[] args) throws InterruptedException {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL which has Dropdown Fields
        driver.get("https://leafground.com/button.xhtml");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		// Locate and access all drop downs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		// Locate the buttons using locators and validate
		driver.findElement(By.xpath("//div[@class='grid button-demo']//span[contains(text(),'Click')]")).click();
		String title = driver.getTitle();
		System.out.println("Title : " +title);
		driver.navigate().back();
		boolean disbutton = driver.findElement(By.xpath("//div[@class='grid button-demo']//button[@id='j_idt88:j_idt92']")).isEnabled();
		System.out.println("Is Button Enabled : " + disbutton);
		WebElement bt1 = driver.findElement(By.xpath("//div[@class='grid button-demo']//button[@id='j_idt88:j_idt96']"));
		String btnClr = bt1.getCssValue("Color");
		System.out.println("Save Button Color : " +btnClr);
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		WebElement bt2 = driver.findElement(By.xpath("//div[@class='grid button-demo']//span[contains(text(),'Primary')]"));
		String ss = bt2.getText();
		System.out.println("Hidden Button is : " +ss);
		//bt2.click();
		
		//Close the browser
		driver.close();
		
	}
}
