package selenium_concepts;

import java.util.concurrent.TimeUnit;

//Static wait - is Thread.sleep, which is not used as it may take up longer time to run the scripts
//Dynamic Waits
//1. Implicit Wait - always given on top of program as it is applicable to every elelment and is used when required.
//2. Explicit Wait

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AP012_HandlingWaits {
	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
		driver.get("https://www.facebook.com");
		//Implicit wait 
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		cu.ClickOnElelment(driver.findElement(By.linkText("Create new account")), "Create New Account Link");
		
		//Explicit wait- need to be added as required for every element and only in seconds
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		
		
		cu.EnterAValue(driver.findElement(By.name("firstname")), "Nazneen", "First Name Field");
 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Sign Up')])[1]")));
	}

}
