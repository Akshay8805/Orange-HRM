package selenium2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;
import com.sun.org.apache.xpath.internal.operations.Equals;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("akash");
	 driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("akash");
	 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("akash");
	 Thread.sleep(3000);
	 WebElement empid=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	 empid.click();
	 Thread.sleep(2000);
	 empid.sendKeys(Keys.BACK_SPACE);
	 empid.sendKeys(Keys.BACK_SPACE);
	 empid.sendKeys(Keys.BACK_SPACE);
	 empid.sendKeys(Keys.BACK_SPACE);
	 Thread.sleep(2000);
	 empid.sendKeys("12345");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	 Thread.sleep(2000);
	 WebElement text=driver.findElement(By.xpath("//p[text()='Successfully Saved']"));
	 String message=text.getText();
	 System.out.println("Emp Add Status:= " +message);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("ak");
	 Thread.sleep(3000);
	 int i=0;
	 while(i<3)
	 {
		 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.DOWN);
		 i++;
	 }
	 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
	 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("akash");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[2]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	 Thread.sleep(3000);
	 WebElement delet=driver.findElement(By.xpath("//p[text()='Successfully Deleted']"));
	 String text1=delet.getText();
	 System.out.println("emp delete status:=  "+text1);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("akash");
	 driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("akshay");
	 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("patil");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("2");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Akshay");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Pass@123");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Pass@123");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")).click();
	 driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-down'])[1]")).click();
	 driver.findElement(By.xpath("//a[text()='Add Entitlements']")).click();
	 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("akash");
	 Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.DOWN);
     driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.DOWN);
	 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
	 driver.findElement(By.xpath("(//div[@class='oxd-select-option'])[3]")).click();
	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("3");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	 Thread.sleep(4000);
//	 JavascriptExecutor js=(JavascriptExecutor)driver;
//	 js.executeScript("window.scrollBy(0,400)");
//	 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Akshay");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(3000);
	 WebElement login =driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
	 System.out.println("Login As:= "+login.getText());
	 driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
	 driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
	 WebElement drop=driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")); 
	 drop.click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).sendKeys(Keys.DOWN);
	 driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	 WebElement date=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	 date.click();
	 Thread.sleep(3000);
	 date.sendKeys("2023-12-08");
	 Thread.sleep(3000);
	 WebElement drop2=driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")); 
	 drop2.click();
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@type='submit']")).submit();
	 
	 Thread.sleep(3000);
	 WebElement leave=driver.findElement(By.xpath("//p[text()='Successfully Saved']"));
	 String leaves=leave.getText();
	 System.out.println("leave apply status:= "+leaves);
	 
	
	}}
