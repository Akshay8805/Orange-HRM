package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		 WebDriver driver = new ChromeDriver();
        
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         WebElement SearchBox = driver.findElement( By.id("twotabsearchtextbox"));
         SearchBox.sendKeys("iphone11");
	     SearchBox.submit();
	     Thread.sleep(3000);
	     driver.findElement(By.linkText("Apple iPhone 12 (64GB) - (Product) RED")).click();
	     Thread.sleep(3000);
	    WebElement seller = driver.findElement(By.linkText("Appario Retail Private Ltd"));
	    seller.click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); 
	    
	}
	
	 }
	
	
	
	

