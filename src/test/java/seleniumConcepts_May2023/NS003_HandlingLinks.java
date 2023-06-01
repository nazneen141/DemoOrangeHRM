package seleniumConcepts_May2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NS003_HandlingLinks {
 public static WebDriver driver;
 
	public static void main(String[] args) {
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.launchBrowser("chrome", "https://www.facebook.com/");
		
		//Check if link is displayed
		boolean forgotlinkstatus = driver.findElement(By.linkText("Forgot password?")).isDisplayed();
		if (forgotlinkstatus == true) {
			System.out.println("Forgot password? - link is displayed");
		} else {
           System.out.println("Forgot password? - link is not displayed");
		}
		
		//cu.clickElement(driver.findElement(By.linkText("Forgot password?")), "Forgot password?");
	
		//Capture a link text
		String  LinktextValidation = driver.findElement(By.linkText("Cookies")).getText();
		//String LinktextValidation = ele.getText();
		System.out.println(LinktextValidation + " Link text captured");
		
		//Count no.of links on homepage
		String Explinktxt = "Create new account";
		boolean Linkstatus = true;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int Linksize = links.size();
		System.out.println("No.of links on homepage are " + Linksize);
		for (int i = 0; i < Linksize; i++) {
			String Linktxt = links.get(i).getText();
			if (Linktxt.isEmpty() == false) {
				System.out.println(Linktxt);
			}
			if (Linktxt.equalsIgnoreCase(Explinktxt)) {
				Linkstatus = true;
				break;
			} else {
				Linkstatus = false;
			}
		} if (Linkstatus == true) {
			System.out.println(Explinktxt + " link is present - PASS");
		} else {
            System.out.println(Explinktxt + " link is not present - FAIL");
		}
         
	}

}

