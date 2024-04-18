package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement click=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
    click.click();
    Thread.sleep(4000);
    WebElement iframe=driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']"));
    driver.switchTo().frame(iframe);
    driver.findElement(By.xpath("//a[@class='close']")).click();
//    Thread.sleep(3000);
//    WebElement iframe2=driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb45366']"));
//    driver.switchTo().frame(iframe2);
//    driver.findElement(By.xpath("//a[@class='close']")).click();
//    driver.switchTo().defaultContent();
    driver.findElement(By.id("fromCity")).sendKeys("mu");
//    for(int i=0;i<2;i++ )
    
    {
    
    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
    driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys(Keys.DOWN);
    driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys(Keys.DOWN);
    driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys(Keys.DOWN);
     
    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
     
    }
  
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("argument[0].scrollIntoView()",click);
    
    
    
	
	}

}
