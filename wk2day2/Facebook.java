package homeassignment.wk2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
				
		//Open the URL
        driver.get(" https://en-gb.facebook.com/");
	    // Maximize the browser Window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Locate elements and create new Account in FB
		driver.findElement(By.xpath("//div[@class='_6ltg'][2]/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Popeye");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sailor");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Myspinach");
		
		// Handle all drop down to select DOB
		WebElement date = driver.findElement(By.id("day"));
		Select sec = new Select(date);
		sec.selectByIndex(5);
		WebElement mon = driver.findElement(By.id("month"));
		Select sec1 = new Select(mon);
		sec1.selectByValue("7");
		WebElement year = driver.findElement(By.id("year"));
		Select sec2 = new Select(year);
		sec2.selectByVisibleText("2019");
		
		// Select Radio button for field Gender
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		//Close the browser
				driver.close();
				
	}
}
