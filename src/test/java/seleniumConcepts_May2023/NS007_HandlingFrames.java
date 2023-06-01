package seleniumConcepts_May2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NS007_HandlingFrames {
	public static WebDriver driver;
	public static void main(String[] args) {
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();

   driver = bu.launchBrowser("chrome", "https://jqueryui.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		cu.clickElement(driver.findElement(By.linkText("Droppable")), "Droppable link");
		//To switch into the iframe
		
		driver.switchTo().frame(0);
		
		String droptxt = driver.findElement(By.id("droppable")).getText();
		System.out.println("Captured droppable text as - " + droptxt);
		
		//To switch out of frame
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.linkText("Selectable")).getText());
		
		
	}

}
