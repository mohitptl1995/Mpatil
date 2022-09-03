package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public void initiate() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.5paisa.com/");
		}
}
