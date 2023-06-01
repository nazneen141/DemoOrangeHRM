package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PS003_BaseUtlis {
	public static WebDriver driver;
   //Opening Browser
	
	public WebDriver LaunchBrowser(String BrowserName) {
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Chrome browser is launched");
			
		} else if (BrowserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("edge browser is launched");
			
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("firefox browser is launched");
		} else {
			System.out.println("Please pass BrowserName as Chrome, Edge or Firefox");
		}
			
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		return driver;
		
		
		
	}
	
   //Closing Browser	
	
	public void CloseBrowser() {
		driver.close();
	}
	
}
