package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
     driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("firstname")).sendKeys("akshay");
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).sendKeys("fff").sendKeys(Keys.TAB).sendKeys("28282").perform();
	 WebElement a= driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
	 a.click();
      //act.doubleClick()        
	 //righclick=act.contextclick()
	 //act.sendKeys(Keys.ENTER)
	 //act.sendKeys(Keys.down)
	//act.moveToElement(element name)
	
	}

}
