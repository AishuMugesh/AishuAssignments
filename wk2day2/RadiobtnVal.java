package homeassignment.wk2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobtnVal {
	public static void main(String[] args) throws InterruptedException {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL which has Dropdown Fields
        driver.get("https://leafground.com/radio.xhtml");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		// Locate and access all Radio Buttons
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='col-12']//label[contains(text(),'Chrome')])[1]")).click();
		driver.findElement(By.xpath("//div[@class='ui-g']//label[contains(text(),'Bengaluru')]")).click();
		driver.findElement(By.xpath("//div[@class='ui-g']//label[contains(text(),'Bengaluru')]")).click();
		WebElement rb1 = driver.findElement(By.xpath("(//div[@class='col-12']//label[contains(text(),'Chrome')])[2]"));
		WebElement rb2 = driver.findElement(By.xpath("(//div[@class='col-12']//label[contains(text(),'Firefox')])[2]"));
		WebElement rb3 = driver.findElement(By.xpath("(//div[@class='col-12']//label[contains(text(),'Safari')])[2]"));
		WebElement rb4 = driver.findElement(By.xpath("(//div[@class='col-12']//label[contains(text(),'Edge')])[2]"));
		WebElement rbb1 = driver.findElement(By.xpath("(//table[@id='j_idt87:console2']//div[contains(@class,'ui-radiobutton')]//span[contains(@class,'radiobutton-icon')])[1]"));
		WebElement rbb2 = driver.findElement(By.xpath("(//table[@id='j_idt87:console2']//div[contains(@class,'ui-radiobutton')]//span[contains(@class,'radiobutton-icon')])[2]"));
		WebElement rbb3 = driver.findElement(By.xpath("(//table[@id='j_idt87:console2']//div[contains(@class,'ui-radiobutton')]//span[contains(@class,'radiobutton-icon')])[3]"));
		WebElement rbb4 = driver.findElement(By.xpath("(//table[@id='j_idt87:console2']//div[contains(@class,'ui-radiobutton')]//span[contains(@class,'radiobutton-icon')])[4]"));	
		String ss,s1,s2,s3;
		//rbb1.click();
		//rbb2.click();
		//System.out.println(rbb3.getAttribute("Checked"));
		if(rbb1.isSelected()==true)
		{
			ss = rb1.getText();
			System.out.println(ss + "is selected as default"); 
		}
		else if (rbb2.isSelected()==true)
		{
			s1 = rb2.getText();
			System.out.println(s1 + "is selected as default");
		}
		else if (rbb3.isSelected()==true)
		{
			s2 = rb3.getText();
			System.out.println(s2 + "is selected as default");
		}
		else if (rbb4.isSelected()==true)
		{
			s3 = rb4.getText();
			System.out.println(s3 + "is selected as default");
		}
		else
			System.out.println("No default selection");
		
		Thread.sleep(2000);
		//Close the browser
		driver.close();
	}
}
