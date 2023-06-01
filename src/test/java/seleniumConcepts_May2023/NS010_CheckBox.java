package seleniumConcepts_May2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NS010_CheckBox {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();
		
		
		driver= bu.launchBrowser("chrome", "https://jqueryui.com/checkboxradio/");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.switchTo().frame(0);
		   
		  // actions.click(driver.findElement(By.xpath("//label[contains(text(),'New York')]"))).build().perform();
		   
		   
		   if (cu.elementDisplayed(driver.findElement(By.xpath("//label[contains(text(),'New York')]"))) == true) {
			System.out.println("New York radiobutton is displayed");
			cu.clickElement(driver.findElement(By.xpath("//label[contains(text(),'New York')]")), "NewYork radio button");
		} else {
			System.out.println("New York radiobutton is not displayed");
		}
		   
		   cu.clickElement(driver.findElement(By.xpath("//label[contains(text(),'5 Star')]")), "5 Star check box");
		   cu.clickElement(driver.findElement(By.xpath("//label[contains(text(),'1 King')]")), "1 King check box");
		   
		   driver.switchTo().defaultContent();
			}

	}


