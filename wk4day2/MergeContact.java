package homeassignment.wk4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
		
public static void main(String[] args) throws InterruptedException {
		
	        //Instantiate Chrome driver
			ChromeDriver driver = new ChromeDriver();
					
			//Open the URL
	        driver.get("http://leaftaps.com/opentaps/control/login");
		    // Maximize the browser Window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			// Locate the Weblement and pass values to them - Send USer NAme and Password to Login
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("demoSalesManager");
			WebElement pwd = driver.findElement(By.id("password"));
			pwd.sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			      
			// Navigate to Merge Contact Page
			driver.findElement(By.partialLinkText("CRM/SFA")).click();		
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
			// CLick on the Widget near from Contact
			driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following::a[1]")).click();
			String pTitle = driver.getTitle();
			System.out.println("Parent Title is : "+pTitle);
			//get the window handle
			String pWindowHandle = driver.getWindowHandle();
			System.out.println(pWindowHandle);
			//to get all window handles
			Set<String> windowHandles = driver.getWindowHandles();
			//to switch to a particular index
			List<String> handles = new ArrayList<>(windowHandles);
			//switch to the particular window using index
			driver.switchTo().window(handles.get(1));
			//to print all the window handles
			for (String each : windowHandles) {
				System.out.println("Window Handles: " +each);
			}
			//child window title
			String cTitle = driver.getTitle();
			System.out.println("Child Window Title is : " +cTitle);
				// To Verify the control
			
			if (!pTitle.equals(cTitle)) {
				System.out.println("Control Switched to the child Window");
			}
			else {
				System.out.println("Control stays in the parent window");
			}
            //Access First FromContact
			WebElement firstFromID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
			String firstFromIdVal = firstFromID.getText();
			System.out.println("First From Contact: " +firstFromIdVal);
		    firstFromID.click();
		    //driver.findElement(By.xpath("//input[@name='id']")).sendKeys("test");
			 //Access First ToContact
		    driver.switchTo().window(pWindowHandle);
		    String pt1 = driver.getTitle();
		    System.out.println(pt1);
		    driver.findElement(By.xpath("//span[text()='To Contact']/following::a[1]")).click();
		    Set<String> windowHandles2 = driver.getWindowHandles();
		    List<String> handles2 = new ArrayList<>(windowHandles2);
		    driver.switchTo().window(handles2.get(1));
		    //String ct1 = driver.getTitle();
		    //System.out.println(ct1);
		    WebElement firstToID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]"));
			String firstToIdVal = firstToID.getText();
			System.out.println("First To Contact: " +firstToIdVal);
			firstToID.click();
			//Switch control to parent window - Click on Merge Button 
			driver.switchTo().window(pWindowHandle);
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			Alert CfmAlert = driver.switchTo().alert();
			Thread.sleep(2000);
			//Send Message and verify message
			String alertText = CfmAlert.getText();
			System.out.println("Alert Text : " +alertText);	
			CfmAlert.accept();
			Thread.sleep(2000);
			String finalWindow = driver.getTitle();
			System.out.println("Final Window Title after Merge Contact " +finalWindow);
			driver.quit();
}
}
