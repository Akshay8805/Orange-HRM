package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("datepicker2")).click();
	WebElement date=driver.findElement(By.xpath("//select[@title='Change the month']"));
	Select select=new Select(date);
	select.selectByVisibleText("May");
	WebElement year=driver.findElement(By.xpath("//select[@title='Change the year']"));
	Select select2 =new Select(year);
	select2.selectByVisibleText("2026");
	//a[@title='Select Wednesday, May 20, 2026']
	driver.findElement(By.xpath("//a[@title='Select Thursday, May 21, 2026']")).click();
	
	/////        year 1995is not vsible so we use   for loop 
	
//	int i = 0;
//   while (i == 0)
//{
//	 WebElement year =driver.findElement(By.xpath("//select[@title='Change the year']"));
//	 String yearname=year.getText();
//	 System.out.println(yearname);
//	 if (!(yearname.equals("2020")))
//	 {
//		driver.findElement(By.xpath("//a[text()='<Prev']")).click();
//     }
//	 else
//	 {
//		 break;
//     }
//
//} 
  
	
	
   ////////// table 1
   
    driver.findElement(By.id("datepicker1")).click();
     int a =0;
     while (a ==0)
 {
         WebElement monthname =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
    	 String month =monthname.getText();
    	 System.out.println(month);
    	 if (!(month.equals("October 2020")))
    	 {
    		 driver.findElement(By.xpath("//a[@title='Prev']")).click();
    	 }
    		 else
        {
    	 break;
        }
 } 
      driver.findElement(By.xpath("//a[text()='7']")).click();
} }