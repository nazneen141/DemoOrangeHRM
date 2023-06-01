package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AP001_GetCommands {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		String ExpAppTitle = "OrangeHRM";
		
		String ExpURLText = "orangehrmlive";
		
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		driver = bu.LaunchBrowser("chrome");
		
		//To open an application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Capturing Application title
		String ActAppTitle =driver.getTitle();
		System.out.println(ActAppTitle);
		
		//Checking if your title is correct
		if (ActAppTitle.equalsIgnoreCase(ExpAppTitle)) {
			System.out.println(ExpAppTitle + " application is opened");
		} else {
			System.out.println(ExpAppTitle + " application is not opened");
		}
		
		//To capture the URL
		String ActAppURL = driver.getCurrentUrl();
		System.out.println("Application URL is - " + ActAppURL);
		
				
		if (ActAppURL.indexOf("orangehrmlive")>= 0) {
			System.out.println(ExpURLText + " text is present in the URL");
		} else {
			System.out.println(ExpURLText + " text is not present in the URL");
		}
		
		if (ActAppURL.contains("orangehrmlive")) {
			System.out.println(ExpURLText + " text is present in the URL");
		} else {
			System.out.println(ExpURLText + " text is not present in the URL");
		}
		//Close the window
		//bu.CloseBrowser();
		
		
	}

}