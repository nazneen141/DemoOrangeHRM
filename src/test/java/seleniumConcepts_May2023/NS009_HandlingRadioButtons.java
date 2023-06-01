package seleniumConcepts_May2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NS009_HandlingRadioButtons {
	public static WebDriver driver;
	public static void main(String[] args) {
	
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();

   driver = bu.launchBrowser("chrome", "https://www.facebook.com");
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
  // cu.clickElement(driver.findElement(By.linkText("Checkboxradio")), "Check Radio Button");
   
   Actions actions = new Actions(driver);
   
   actions.click(driver.findElement(By.linkText("Create new account"))).build().perform();
   
   //Syntax for Xpath
   //tagname[@attribute name = 'attribute value']
   //tagname[contains(text(),'given text')]
   
   cu.clickElement(driver.findElement(By.xpath("//input[@value='2']")), "male radio button");
   
   //actions.click(driver.findElement(By.xpath("//input[@type='radio']"))).build().perform();
   
   driver.close();
	}
}

		
		
   /*driver= bu.launchBrowser("chrome", "https://jqueryui.com/checkboxradio/");
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   driver.switchTo().frame(0);
   
  // actions.click(driver.findElement(By.xpath("//label[contains(text(),'New York')]"))).build().perform();
   
   
   if (cu.elementDisplayed(driver.findElement(By.xpath("//label[contains(text(),'New York')]"))) == true) {
	System.out.println("New York radiobutton is displayed");
	cu.clickElement(driver.findElement(By.xpath("//label[contains(text(),'New York')]")), "NewYork c");
} else {
	System.out.println("New York radiobutton is not displayed");
}
   
   cu.clickElement(driver.findElement(By.xpath("//label[contains(text(),'5 Star')]")), "5 Star check box");
   cu.clickElement(driver.findElement(By.xpath("//label[contains(text(),'1 King')]")), "1 King check box");
   
   driver.switchTo().defaultContent();
	}

}
*/