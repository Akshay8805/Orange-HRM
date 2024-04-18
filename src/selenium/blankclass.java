package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blankclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("ama");
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	int i=0;
	while(i<4)
	{	
	
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.DOWN);
//	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.DOWN);
//	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.DOWN);
	i++;
	}
	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
	
}}
