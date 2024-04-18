package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.youtube.com/");	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	TakesScreenshot screen=(TakesScreenshot)driver;
    File source = screen.getScreenshotAs(OutputType.FILE);	
	File destination= new File("C:\\Automation Testing\\Screenshot selenium\\TestFile2.png");
	Files.copy(source, destination);
	driver.quit();
	File source2= screen.getScreenshotAs(OutputType.FILE);
	File destnation2=new File("C:\\Automation Testing\\Screenshot selenium\\TestFile3.png");
	Files.copy(source2, destnation2);
	}
    
}
