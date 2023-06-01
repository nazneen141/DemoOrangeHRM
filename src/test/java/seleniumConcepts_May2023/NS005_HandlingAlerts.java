package seleniumConcepts_May2023;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//Alerts or Pop-Ups
//Alert window does not give option to inspect, has no close/minimize button
import org.openqa.selenium.WebDriver;

public class NS005_HandlingAlerts {
public static WebDriver driver;

	public static void main(String[] args) {
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.launchBrowser("chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
		
		cu.clickElement(driver.findElement(By.name("proceed")), "Sign in button");
		
		Alert alert = driver.switchTo().alert();
		
		String Alerttxt = alert.getText();
		System.out.println("The alert text captured as " + Alerttxt);
		
		alert.accept();//Clicks on Enter
		
		//alert.dismiss(); //Clicks on escape

	}

}
