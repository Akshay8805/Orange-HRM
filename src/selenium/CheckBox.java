package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		 WebDriver Driver = new ChromeDriver();
		 Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		 Driver.manage().window().maximize();
	    
		 WebElement check = Driver.findElement(By.id("ch"));
	     boolean result1 = check.isSelected();
         System.out.println("result1 " +result1);
         
         check.click();
         Thread.sleep(14000);
         boolean result2 = check.isSelected();
         System.out.println("result2 " +result2);
	     Thread.sleep(2000);
        
	     WebElement button= Driver.findElement(By.xpath("//button[@id='disable']"));
	     boolean result3  = button.isEnabled();
	     System.out.println("result3 " +result3);
	     Thread.sleep(3000);
	    
	     WebElement button2= Driver.findElement(By.xpath("//button[@id='enable-button']"));
	     button2.click();
	     Thread.sleep(15000);
	     boolean result4  = button.isEnabled();
	     System.out.println("result4 " +result4);
	     Thread.sleep(3000);
	      
	     WebElement displaybutton = Driver.findElement(By.xpath("//button[@id='hidden']"));
		 boolean result5 = displaybutton.isDisplayed();
		 System.out.println("result5 " +result5);
		 
		
		 WebElement displaybutton1 = Driver.findElement(By.xpath("//button[@id='display-other-button']"));
		 displaybutton1.click();
		 boolean result6 = displaybutton1.isDisplayed();
		 System.out.println("result6 " +result6);
         Driver.quit();
	}

		// WebElement displaybutton2 = Driver.findElement(By.xpath("//button[@id='hidden']"));
		

}
//button[@id='enable-button']
//button[@id='display-other-button']