package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SeleniumClass1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        WebDriver Driver = new ChromeDriver();
	    Driver.get("https://www.amazon.in/");
	    Driver.manage().window().maximize();
	   WebElement search = Driver.findElement(By.id("twotabsearchtextbox"));
	   search.sendKeys("iphone");
	   search.submit();
	   Driver.findElement(By.linkText("(//span[text()='iPhone 13 (128GB) - Blue'])[1]")).click();
	   Thread.sleep(3000);
	   Driver.findElement(By.id("add-to-cart-button")).click();
	   Thread.sleep(3000);
	   WebElement cart = Driver.findElement(By.id("nav-cart"));
	   cart.click();
	   Driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	   TakesScreenshot scr= (TakesScreenshot)Driver;
	   File source=scr.getScreenshotAs(OutputType.FILE);
	   File dest=new File("C:\\\\Automation Testing\\\\Screenshot selenium\\\\TestFile4.png");
	   Files.copy(source, dest);
	   
	}
	

}



