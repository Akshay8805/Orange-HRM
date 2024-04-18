package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver Driver = new ChromeDriver();
	  Driver.get("https://opensource-demo.orangehrmlive.com/");
	  Driver.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement login =  Driver.findElement(By.xpath("//input[@name='username']"));
	  Thread.sleep(3000);
	  login.sendKeys("Admin");
	  Thread.sleep(3000);
	  Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  Driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(3000);
      WebElement admin= Driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]"));
      Thread.sleep(3000);
      admin.click();
      Thread.sleep(3000);
//      Driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Akshay");
//      Thread.sleep(3000);
//      Driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
//      Driver.findElement(By.xpath("//button[@type='submit']")).click();
//	  Thread.sleep(3000);
//	  Driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
//	  Driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
//      Driver.quit();
	  JavascriptExecutor js =(JavascriptExecutor) Driver;
	  js.executeScript("window.scrollBy(0,500)");
      Driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
	
	}

}
