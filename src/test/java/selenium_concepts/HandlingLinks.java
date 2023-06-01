package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingLinks {
public static WebDriver driver;

	public static void main(String[] args) {
		String ExpLink = "Create a Page";
		boolean status = true;
		
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
		//Opening Application
		driver.get("https://www.facebook.com/");
		
		//If same step is being used repeatedly then better to store inside a variable and use
		//ex here variable ele can be used instead
		WebElement ele = driver.findElement(By.linkText("Create new account"));
		
		
		boolean Crtstatus = cu.ElelementDisplayed(driver.findElement(By.linkText("Create new account")));
		if (Crtstatus == true) {
			System.out.println("Create new account is displayed");
			ele.click();
			
		} else {
			System.out.println("Create new account is not displayed");
		}
		WebElement elem = driver.findElement(By.linkText("Forgot password?"));
		boolean forgotLinkStatus = elem.isDisplayed();
		if (forgotLinkStatus == true) {
			System.out.println("Forgot password link is displayed");
			//Clicking on a link
			//cu.ClickOnElelment(driver.findElement(By.linkText("Forgot password?")), "Forgot password");
			//System.out.println("Clicked on Forgot Password Link");
		} else {
			System.out.println("Forgot password link is not displayed");
		}
		//Capturing link text
		WebElement link = driver.findElement(By.linkText("Create a Page"));
		
		String Createpagelinktxt = link.getText();
		//System.out.println(Createpagelinktxt);
		if (Createpagelinktxt.equalsIgnoreCase("Create a Page")) {
			System.out.println("Create a Page - link is present");
			//cu.ClickOnElelment(driver.findElement(By.linkText("Create a Page")), "Create a Page");
			//System.out.println("Clicked on - Create a Page - link");
		} else {
			System.out.println("Create a Page - link is not present");
		}
		//Count number of links (third locator is Tagname/Links start with tab a)
		
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		int LinksCnt = Links.size();
		System.out.println("No.of links on Facebook login page is " + LinksCnt);
		//Print links
		for (int i = 0; i < LinksCnt; i++) {
			String actualLink = Links.get(i).getText();
			//System.out.println(actualLink[i]);
			if (actualLink.equalsIgnoreCase(ExpLink)) {
				status = true;
			break;
		} else {
                 status = false;
		}
		}
		if (status == true) {
			System.out.println("Create a Page link is present - PASS");
		} else {
			System.out.println("Create a Page link is missing - FAIL");
		}
		
	}

}
