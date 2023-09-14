package homeassignment.wk4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandling {

	public static void main(String[] args) {
	    //Instantiate Chrome driver
				ChromeDriver driver = new ChromeDriver();
						
				//Open the URL
		        driver.get("https://leafground.com/window.xhtml");
			    // Maximize the browser Window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// Verify New Window opens
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				Set<String> winOneHandler = driver.getWindowHandles();
			    List<String> handles1 = new ArrayList<>(winOneHandler);
			    String ptitle1 = driver.getTitle();
			    //Switch to Child Window
			    driver.switchTo().window(handles1.get(1));
			    String cTitle1 = driver.getTitle();
			    if(!ptitle1.equals(cTitle1))
			    	System.out.println("Control Switched to Child Window");
			    else
			    	System.out.println("Control still in Parent Window");
	
			    driver.close();
			
			    //Verify the number of tabs opened
			    driver.switchTo().window(handles1.get(0));
			    driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
			    Set<String> winCountHandler = driver.getWindowHandles();
			    //List<String> handles2 = new ArrayList<>(winCountHandler);
			    int countOfTabs = winCountHandler.size();
			    System.out.println("No of Windows opened: " +countOfTabs);
			    driver.quit();
	}
}
