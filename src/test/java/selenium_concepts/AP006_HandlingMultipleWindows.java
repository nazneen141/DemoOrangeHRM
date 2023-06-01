package selenium_concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AP006_HandlingMultipleWindows {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		driver.get("https://www.facebook.com/");

		//Clicking on create new account
		cu.ClickOnElelment(driver.findElement(By.linkText("Create new account")), "Create new account link");
		Thread.sleep(4000);
		String Beforeclick = driver.getTitle();
		System.out.println("Application tiltle before clicking on cookies policy link is " + Beforeclick);
		
		//cu.ElelementDisplayed(driver.findElement(By.linkText("Cookies")));
		
		cu.ClickOnElelment(driver.findElement(By.id("cookie-use-link")), "Cookie policy link");
		//Selelnium is still struck up on first window only as cookie page opens in other window
		//If we make selelnium to navigate to cookie policy window page
		
		Set<String> ids = driver.getWindowHandles();// this returns a Set interface
		Iterator<String> itr = ids.iterator();
		String firstwindow = itr.next();
		String secondwindow = itr.next();
		System.out.println("ID for first window is "+ firstwindow);
		System.out.println("ID for second window is "+ secondwindow);
		
		driver.switchTo().window(secondwindow);
		
		
		String Afterclick = driver.getTitle(); 
		System.out.println("Application title after clicking on cookies policy link is " + Afterclick);
		
		//driver.close();//Closes the window on which selenium is active presently
		//driver.quit(); //closes all the windows opened by selelnium
		
		driver.switchTo().window(firstwindow);
		Thread.sleep(4000);
		
		cu.EnterAValue(driver.findElement(By.name("firstname")), "Nazneen", "First name field");
	}

}
