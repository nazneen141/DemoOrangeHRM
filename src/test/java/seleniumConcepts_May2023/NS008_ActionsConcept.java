package seleniumConcepts_May2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NS008_ActionsConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();

   driver = bu.launchBrowser("chrome", "https://jqueryui.com/droppable/");
   
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   Actions actions = new Actions(driver);
      
   driver.switchTo().frame(0);
   
   actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
   
   driver.switchTo().defaultContent();

   
   //actions.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
   
   //cu.clickElement(driver.findElement(By.linkText("CLA")), "CLA link with Contribute");
   
   
 //actions.click(driver.findElement(By.linkText("CLA"))).build().perform();
   
   actions.sendKeys(driver.findElement(By.name("s")), "Actions Concepts").build().perform();
 
   actions.contextClick(driver.findElement(By.linkText("API Documentation"))).build().perform();
 
   actions.click(driver.findElement(By.linkText("Demos"))).build().perform();
 
   
   
   
   
   

	}

}
