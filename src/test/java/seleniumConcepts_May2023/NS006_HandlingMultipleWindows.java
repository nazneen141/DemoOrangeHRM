package seleniumConcepts_May2023;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NS006_HandlingMultipleWindows {
public static WebDriver driver;

	public static void main(String[] args) {
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();
		
		
		
		driver = bu.launchBrowser("chrome", "https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cu.clickElement(driver.findElement(By.linkText("Create new account")), "Create new Account link");
		
		cu.clickElement(driver.findElement(By.linkText("Cookies Policy")), "Cookies policy link");
		
		//To get the Multiple window handle IDS use Set statement/method
		
		Set <String> ids = driver.getWindowHandles();
		Iterator <String> itr = ids.iterator();
		String FirstWindowID = itr.next();
		System.out.println("First window ID is " + FirstWindowID);
		String SecondWindoeID = itr.next();
		System.out.println("Second window ID is " + SecondWindoeID);
		
		driver.switchTo().window(SecondWindoeID);
		
		driver.close();//Closes the second window opened by selenium
		System.out.println("Closed second window");
		//driver.quit();//closes all the windows opened by selenium
		

	}

}
