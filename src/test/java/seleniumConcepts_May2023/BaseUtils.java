package seleniumConcepts_May2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtils {
	public static WebDriver driver;
	
	
	
	public WebDriver launchBrowser(String Browsername, String URL) {
		if (Browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(URL);
			System.out.println("Chrome browser is launched");
			
		} else if (Browsername.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(URL);
            System.out.println("Firefox browser is launched");
            
		} else if (Browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(URL);
			System.out.println("Edge browser is launched");
			
		}else {
			System.out.println("Please provide the browsername as - chrome, firefox or edge");
		}
		driver.manage().window().maximize();
		return driver;
	}
	
       public void closeBrowser() {
    	   driver.close();
       }
}
