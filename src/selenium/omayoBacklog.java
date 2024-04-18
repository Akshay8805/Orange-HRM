package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class omayoBacklog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		
//		 WebElement frame3=driver.findElement(By.id("//div[@id='navbar-iframe-container']"));
//		
//		 driver.switchTo().frame(frame3);
//		 driver.findElement(By.id("b-query")).sendKeys("akshay");
		 driver.findElement(By.id("ta1")).sendKeys("akshay");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1800)");
		 WebElement table=driver.findElement(By.id("table1"));
		 String tabletext =table.getText();
		 
		 System.out.println("tabledata= "+tabletext);
		 WebElement frame2=driver.findElement(By.id("iframe2"));
		 driver.switchTo().frame(frame2);
		WebElement q= driver.findElement(By.xpath("//h2[text()='The server encountered an error and could not complete your request.']"));
		String q2=q.getText();
		System.out.println("frame text "+q2);
		Thread.sleep(2000);
		WebElement doubleclick=driver.findElement(By.id("testdoubleclick"));
		Actions act =new Actions (driver);
		act.doubleClick(doubleclick).build().perform();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.quit();
	}

}
