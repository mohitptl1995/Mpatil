# Mpatil
package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog_3 {
	
	public static void main(String[]aargs) throws IOException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JAVA\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.swiggy.com/");
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
    File destination= new File ("C:\\Users\\Admin\\eclipse-workspace\\JAVA\\src\\Screenshot\\swiggy.jpg");
	
	FileHandler.copy(src,destination);
		
		driver.close();
	}
}
