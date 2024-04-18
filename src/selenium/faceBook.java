package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver Driver = new ChromeDriver();
	 Driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	 Driver.manage().window().maximize();
	 Thread.sleep(3000);
	 WebElement name= Driver.findElement(By.xpath("//input[@name='firstname']"));
	 name.sendKeys("AKSbhhbkbhbhY");
	 Driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mm");
	 Thread.sleep(300);
	 Driver.findElement(By.xpath("//input[@id='contactpoint_step_input']")).sendKeys("8805033335");
	 WebElement gender=Driver.findElement(By.xpath("//input[@name='sex']"));
	 gender.click();
	 boolean female =gender.isSelected();
	 System.out.println("female= "+female);
	 Thread.sleep(3000);
	 WebElement day= Driver.findElement(By.id("day"));
//	 day.click();
	 Select select =new Select(day);
	 select.selectByVisibleText("20");
	 WebElement month= Driver.findElement(By.id("month"));
	 Select select2 =new Select(month);
	 select2.selectByVisibleText("Dec");
	 WebElement year= Driver.findElement(By.id("year"));
	 Select select3 = new Select(year);
	 select3.selectByVisibleText("1988");
	 Thread.sleep(3000);
//	 Driver.findElement(By.xpath("//input[@name='submit']")).click();
	 Driver.findElement(By.id("password_step_input")).sendKeys("akskkkggyggugu@1234");
//	 Driver.findElement(By.id("signup_button")).click();
////	 Thread.sleep(3000);
//	 Driver.quit();
//	 Thread.sleep(3000);
	}

}
