package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/?");
	driver.manage().window().maximize();
    driver.findElement(By.id("fromCity")).sendKeys("sa");
	int i=0;
	while(i<3)
	{		
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
	i++;
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
	Thread.sleep(2000);
	
	int a=0;
	while (a==0)
{	
	WebElement month=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
	String monthtext=month.getText();
	System.out.println(monthtext);
	driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).click();
	if (!(monthtext.equals("September 2024")))
	{	
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
    }
	else
	  {
	break;
	  }
}
  driver.findElement(By.xpath("(//p[text()='19'])[1]")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//span[@class='switcherDownArrow appendLeft10']")).click();
  WebElement drop1= driver.findElement(By.xpath("//p[@class='selectConInput']"));
  drop1.click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("(//P[@class='listRow'])[2]")).click();
  Thread.sleep(2000);
  driver.findElement(By.id("toCity")).click(); 
  Thread.sleep(2000);
  driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[4]")).click();
  driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[20]")).click();
  Thread.sleep(2000);
   WebElement rdate=driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]"));
   String rdatetext=rdate.getText();
   System.out.println(rdatetext);

          

	} }
