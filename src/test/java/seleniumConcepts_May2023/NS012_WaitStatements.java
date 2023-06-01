package seleniumConcepts_May2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NS012_WaitStatements {
	
public static WebDriver driver;

	public static void main(String[] args) {
		
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();

   driver = bu.launchBrowser("chrome", "https://www.facebook.com");
   //Dynamic Waits
   //Implicit wait- Given on top applicable for every element in script//used when needed//can be given in any timeunits
   
   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   cu.clickElement(driver.findElement(By.linkText("Create new account")), "Create New Account");
   
   //Explicit Wait// Should be used where required along the script, timeunit can only be in seconds
  WebDriverWait wait = new WebDriverWait(driver, 20);
 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
   driver.findElement(By.name("firstname")).sendKeys("Nazneen");
	}
}
