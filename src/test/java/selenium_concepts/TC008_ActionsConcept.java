package selenium_concepts;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class TC008_ActionsConcept {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
		driver.get("https://jqueryui.com/");
		
		cu.ClickOnElelment(driver.findElement(By.linkText("Droppable")), "Droppable link on jquery.com");
		
		//Switch into the frame//Frames start with 0
		
		driver.switchTo().frame(0);		
		String Droppabletext = driver.findElement(By.id("droppable")).getText();
         System.out.println(Droppabletext);
         
         Actions actions = new Actions(driver);
         
         actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
         //Switch out of all the frame
         
     
         driver.switchTo().defaultContent();
         
         Thread.sleep(5000);
         
         actions.sendKeys(driver.findElement(By.name("s")), "Nazneen").build().perform();
         
         Thread.sleep(5000);
         
         actions.click(driver.findElement(By.linkText("Demos"))).build().perform();
         
        //Capturing Selectable link text
         String Selecttxt = driver.findElement(By.linkText("Selectable")).getText();
         System.out.println(Selecttxt);
         
         
         
         //Actions actions = new Actions(driver);
         
         //driver.switchTo().frame(0);
         
         
         //Clicking on CLA within Contribute
        // driver.findElement(By.linkText("Contribute")).click();
        // driver.findElement(By.linkText("CLA")).click();
         
         //can be done with Actions class, can perform actions using mouse and keyboard
         
        /* Actions actions = new Actions(driver);
         actions.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();;
         
         Thread.sleep(5000);
         
         driver.findElement(By.linkText("CLA")).click();*/
         
       /*//Switch to first window
         Set <String> ids = driver.getWindowHandles();
         Iterator<String> itr = ids.iterator();
         String FirstWindID = itr.next();
         String SencondWindID = itr.next();
         
         System.out.println(FirstWindID);
         System.out.println(SencondWindID);
         
         driver.switchTo().window(FirstWindID);*/
         
         //driver.close();
         
         
         
         
         
         
	}

}