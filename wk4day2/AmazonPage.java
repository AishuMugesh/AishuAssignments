package homeassignment.wk4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
	public static void main(String[] args) throws InterruptedException {
	    //Instantiate Chrome driver
				ChromeDriver driver = new ChromeDriver();
						
				//Open the URL
		        driver.get("https://www.amazon.in/");
			    // Maximize the browser Window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//2.search as oneplus 9 pro 
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
				//3.Get the price of the first product
				WebElement pdt = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
				String pdtName = pdt.getText();
				System.out.println("Product Name : "+pdtName);
				String pdtPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
				String pr =  pdtPrice.replaceAll(",","");
				int pdtPriceInt = Integer.parseInt(pr);
				System.out.println("Product Price : " +pdtPriceInt);
				//4. Print the number of customer ratings for the first displayed product
				String custRatings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
			    System.out.println("No of Customer Rating for this product : " +custRatings);
				//5. Click the first text link of the first image
			    pdt.click();
			    Set<String> windowHandles = driver.getWindowHandles();
			    List<String> handles1 = new ArrayList<>(windowHandles);
			    driver.switchTo().window(handles1.get(1));
				//6. Take a screen shot of the product displayed -- will be covered after it thought in class
				//7. Click 'Add to Cart' button
			    driver.findElement(By.id("add-to-cart-button")).click();
				//8. Get the cart subtotal and verify if it is correct.
			    Thread.sleep(4000);
			    String cartPrice = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
			    String pr1 = cartPrice.replaceAll("₹","");
			    String pr2 = pr1.replaceAll(",", "");
			    String pr3 = pr2.replaceAll("0","");
			    String pr4 = pr3.replace(".", "");
			    int cartPriceInt = Integer.parseInt(pr4);
			    System.out.println("Cart Price: " +pr4);
			    if(pdtPriceInt==cartPriceInt)
			    	System.out.println("Product price is same in cart and Prodcuct window");
			    else
			    	System.out.println("Price Mismatch");
			
				//9.close the browser
			    driver.quit();
	
	}
}
