package seleniumConcepts_May2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NS001_GetCommands {
	
public static WebDriver driver;

	public static void main(String[] args) {
		String ExpTitle = "Facebook - log in or sign up";
		String Expurltxt = "facebook";
		
		BaseUtils bu = new BaseUtils();
		driver = bu.launchBrowser("chrome" , "https://www.facebook.com");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
         //To capture the title and compare the values
          String ActTitle = driver.getTitle();
          
          System.out.println(ActTitle);
          if (ActTitle.equalsIgnoreCase(ExpTitle)) {
        	  System.out.println("Actual title is same as of "+ ExpTitle);
		} else {
			System.out.println("Actual title is different from "+ ExpTitle);
		}
          
          //Capturing and validating URL
          
          String ActURL = driver.getCurrentUrl();
          if (ActURL.indexOf(Expurltxt) >= 0) { //can also use .contains
			System.out.println("Actual URL contains the expected URL text");
		} else {
			System.out.println("Actual URL does not contain the expected URL text");
		}
          
          //driver.close();
          bu.closeBrowser();
          
	}

}
