package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amzon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Midnight")).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,100)");
	  Set<String> windowid= driver.getWindowHandles();
	  System.out.println(windowid);//for window id print
	  Iterator<String> itr =windowid.iterator();
	  String mainwindow =itr.next();
	  String childwindow=itr.next();
      driver.switchTo().window(childwindow);
	  driver.findElement(By.id("add-to-cart-button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("attach-close_sideSheet-link")).click();
	  Thread.sleep(3000);
//	  driver.navigate().back();   ///not work back because opton is not available
//	  driver.close();
//	  driver.findElement(By.xpath("//i[@title='Share']"));
	  
//	  driver.findElement(By.xpath("//a[@title='Share on Facebook']")).click();
//	  driver.navigate().back();
//	  driver.close();
	  Thread.sleep(2000);
	  driver.switchTo().window(mainwindow);
	  driver.findElement(By.linkText("Apple iPhone 15 (128 GB) - Green")).click();
	  Thread.sleep(2000);
//      String windowid2 = driver.getWindowHandle();
//      System.out.println("id2 "+windowid2);
//      driver.switchTo().window(windowid2);
//      Iterator<String>itr2 =windowid2.iterator();
//      String childwindow2=itr2.next();
//      driver.switchTo().window(childwindow2);        
	  driver.switchTo().window(childwindow);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//i[@title='Share']")).click();
	
//	  driver.quit();
//	  
	
	}

}
