package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OmayoBlog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	 WebDriver driver= new ChromeDriver();
	 driver.get("http://omayo.blogspot.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement drop= driver.findElement(By.id("drop1"));
	 Select select = new Select(drop);
	 select.selectByVisibleText("doc 2");
	 Thread.sleep(2000);
	 WebElement selectmulti = driver.findElement(By.id("multiselect1"));
	 Select select2 =new Select(selectmulti);
	 select2.selectByVisibleText("Volvo");
	 select2.selectByVisibleText("Audi");
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("akshay");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Thread.sleep(2000);
	 WebElement text = driver.findElement(By.xpath("//input[@name='q']"));
	 String text1=driver.getTitle();
	 System.out.println("text "+text1);
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,300)");
	 Thread.sleep(2000);
	 WebElement gender = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
	 gender.click();
	 boolean result1 =gender.isSelected();
	 System.out.println("result "+result1);
     WebElement buton = driver.findElement(By.id("but1"));
	 boolean result2 =buton.isEnabled();
	 System.out.println("result2 "+result2);
//	 List<WebElement> click= driver.findElements(By.xpath("//input[@name='vehicle']"));
	 Thread.sleep(2000);
	 WebElement read =driver.findElement(By.id("rotb"));
	 String result =read.getText();
	 System.out.println(result);
	 driver.findElement(By.id("alert1")).click();
	 Alert alert1= driver.switchTo().alert();
	 String alerttext=alert1.getText();
	 System.out.println("alerttext: "+alerttext);
     alert1.accept(); 
	 WebElement text2 =driver.findElement(By.id("rotb"));
	 String tex3=text2.getText();
	 System.out.println(tex3);
	 driver.findElement(By.linkText("SeleniumTutorial")).click();
	 Set<String> windowid= driver.getWindowHandles();
	 Iterator<String> itr= windowid.iterator();
	 String mainwindow=itr.next();
	 String childwindow=itr.next();
	 driver.switchTo().window(childwindow);
	 driver.findElement(By.linkText("What is Selenium?")).click();
     driver.switchTo().window(mainwindow);
	 driver.findElement(By.id("ta1")).sendKeys("akshay");
//	 WebElement fulltext= driver.findElement(By.linkText("The cat was playing in the garden."));
//	 String fulltext2 =fulltext.getText();
//	 System.out.println(fulltext2);
	 WebElement iframe =driver.findElement(By.id("iframe2"));
	 driver.switchTo().frame(iframe);
	 Thread.sleep(2000);
	 WebElement more =driver.findElement(By.id("b-more"));
	 Select select3=new Select(more);
	 select3.selectByVisibleText("Share with Facebook");
	 WebElement table=driver.findElement(By.id("V"));
	 String tabletext =table.getText();
	 System.out.println(tabletext);
	 driver.switchTo().alert();
//	 js.executeScript("arguments[0],scrollIntoView()",table);
	
	}

}
