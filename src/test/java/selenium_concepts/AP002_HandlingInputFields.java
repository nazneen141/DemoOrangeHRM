package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AP002_HandlingInputFields {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
				
		//To open an application
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
		//Mandatory Wait time //Not to be used in real time
				Thread.sleep(5000); //5000 ms is 5 sec
				
		//Check if Username field is displayed
			
				
				Boolean statususername = cu.ElelementDisplayed(driver.findElement(By.name("username")));
				
				if (statususername == true) {
					System.out.println("Username field is displayed");
					cu.EnterAValue(driver.findElement(By.name("username")), "Admin", "UsernameField");
				} else {
					System.out.println("Username field is not displayed");
				}
				
				//driver.findElement(By.name("username")).clear();
				
				//Boolean statuspasswrd = cu.ElelementDisplayed(driver.findElement(By.name("password")));	
				
				if (cu.ElelementDisplayed(driver.findElement(By.name("password"))) == true) {
					System.out.println("Password field is displayed");
					cu.EnterAValue(driver.findElement(By.name("password")), "admin123", "PasswordField");
					
				} else {
					System.out.println("Password field is not displayed");
				}
				
							
				
				
//				boolean val = ElelementDisplayed(driver.findElement(By.name("username")));
//				if (val == true) {
//					System.out.println("username field is displayed");
//					entervalue(driver.findElement(By.name("username")), "Admin", "Username Field");
//				} else {
//					System.out.println("username field is not displayed");
//				}	
		    
		/*//Check if Password field is displayed
				
				if (ElelementDisplayed(driver.findElement(By.name("password"))) == true) {
					System.out.println("Password field is displayed");
					entervalue(driver.findElement(By.name("password")), "admin123", "password field");
				} else {
					System.out.println("password field is not displayed");
				}*/
	    
		
		//Close the window
				//bu.CloseBrowser();
	}

	/*public static void entervalue(WebElement ele , String val, String elementname) {
		    try {
		    	ele.sendKeys(val);
				String valentered = ele.getAttribute("value");
				System.out.println("The value entered in " + elementname + " is " + valentered);
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
			
	}*/
	
}
