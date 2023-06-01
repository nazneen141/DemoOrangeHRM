package selenium_concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AP005_HandlingAlertsOrPopUps {
 public static WebDriver driver;
 
	public static void main(String[] args) throws InterruptedException {
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
		String ExpPopUpTxt = "valid user name";
		
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        //Clicking on Signin button
        cu.ClickOnElelment(driver.findElement(By.name("proceed")), "Sing In to Reddit");
        
        //Switching to alert pop-up, Capturing the pop-up text
        
        Alert alert = driver.switchTo().alert();
        String Alerttext = alert.getText();
        System.out.println(Alerttext);
        if (Alerttext.contains(ExpPopUpTxt)) {
			System.out.println(ExpPopUpTxt + " is present in the pop-up alert text");
		} else {
			System.out.println(ExpPopUpTxt + " is missing in the pop-up alert text");
		}
        
        Thread.sleep(5000);
        
        
        //Click on OK button 
        //alert.accept();  //This actually presses Enter key on keyboard but does not click on O button of pop-up alert
        alert.dismiss(); //This hits the esc key on keyboard
	}

}
