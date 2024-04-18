package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	Thread.sleep(3000);
	WebElement products =driver.findElement(By.xpath("//select[@id='first']"));
	Select select1 = new Select(products);
	select1.selectByVisibleText("Iphone");
	WebElement animal =driver.findElement(By.xpath("//select[@id='animals']"));
	Select select2 = new Select(animal);
	select2.selectByVisibleText("Baby Cat");
	}

}
