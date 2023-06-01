package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AP007_HandlingFrames {
 public static WebDriver driver;
 
	public static void main(String[] args) {
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
		driver.get("https://jqueryui.com/");
		
		cu.ClickOnElelment(driver.findElement(By.linkText("Droppable")), "Droppable link on jquery.com");
		
		//Switch into the frame//Frames start with 0
		
		driver.switchTo().frame(0);		
		String Droppabletext = driver.findElement(By.id("droppable")).getText();
         System.out.println(Droppabletext);
         
         //Switch out of all the frame
         driver.switchTo().defaultContent();
         
        //Capturing Selectable link text
         String Selecttxt = driver.findElement(By.linkText("Selectable")).getText();
         System.out.println(Selecttxt);
         
	}

}
