package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	private static Object javaExecutor;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
	  driver.get("https://artoftesting.com/samplesiteforselenium");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.id("fname")).sendKeys("akshay");
	  driver .findElements(By.xpath("//button[@id='idOfButton']"));
	  WebElement click=driver.findElement(By.xpath("//input[@id='male']"));
	  boolean result1=click.isSelected();
	  System.out.println("result1 " +result1);
	  click.click();
	  boolean result2=click.isSelected();
	  System.out.println("result2 " +result2);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,500)");
	  driver.findElement(By.id("testingDropdown")).click();
	  driver.findElement(By.id("performance")).click();
	  String title = driver.getTitle();
	  System.out.println("title is: "+title);
	
	  driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
	  Thread.sleep(2000);
	  String text2 =driver.getTitle(); 
	  System.out.println("text2 "+text2);
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000); 
//	  driver.navigate().refresh();
//	  Thread.sleep(2000); 
	  String tag =driver.findElement(By.id("fname")).getTagName();
	  System.out.println("tagname "+tag);
	  driver.quit();
	}

}

