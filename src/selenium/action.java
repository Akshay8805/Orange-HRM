package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver =

    		
    		
    		ChromeDriver();
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	WebElement dc= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act= new Actions(driver);
	act.doubleClick(dc).perform();
	Alert alert =driver.switchTo().alert();
	String text =alert.getText();
	System.out.println(text);
	alert.accept();
	List<WebElement> iframe =driver.findElements(By.tagName("iframe"));
	iframe.size();
	System.out.println(iframe);
	
	}

}
