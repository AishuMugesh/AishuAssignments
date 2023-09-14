package homeassignment.wk4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandling1 {
	public static void main(String[] args) {
	    //Instantiate Chrome driver
				ChromeDriver driver = new ChromeDriver();
						
				//Open the URL
		        driver.get("https://leafground.com/window.xhtml");
			    // Maximize the browser Window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// Verify New Window opens
				driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
				Set<String> winCloseHandler = driver.getWindowHandles();
			    List<String> handles1 = new ArrayList<>(winCloseHandler);
			    String ptitle1 = driver.getTitle();
			    System.out.println("Parent Window Title: " +ptitle1);
			    //TRaverse to each child window and close them except Primary
			    for (int i = 1; i < handles1.size(); i++) 
			    {
			    	driver.switchTo().window(handles1.get(i));
			    	String ctitle1 = driver.getTitle();
			    	System.out.println("Opened Child Window 1 Title: " +ctitle1);
			    	 if(!ptitle1.equals(ctitle1))
					    	System.out.println("Control Switched to Child Window");
					    else
					    	System.out.println("Control still in Parent Window");
			    	 
			       System.out.println("Close the " +ctitle1 +" - Child Window");
				   driver.close();
			
			    }
					
				}
			
}
