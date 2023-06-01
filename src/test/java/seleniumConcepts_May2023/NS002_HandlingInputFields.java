package seleniumConcepts_May2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NS002_HandlingInputFields {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.launchBrowser("chrome", "https://www.facebook.com");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 boolean status = cu.elementDisplayed(driver.findElement(By.name("email")));
	 if (status == true) {
		 System.out.println("Username field is displayed");
		 cu.enterValue("nazneen141@gmail.com", driver.findElement(By.name("email")), "username field");
		 
	} else {
		System.out.println("Username field is not displayed");
	}
	 
	 if (cu.elementDisplayed(driver.findElement(By.name("pass"))) == true) {
		 System.out.println("Password field is displayed");
		 cu.enterValue("Hibah@2014", driver.findElement(By.name("pass")), "Password field");
	} else {
		System.out.println("Password field is not displayed");
	}
    
    bu.closeBrowser();
    
	}

	
}
