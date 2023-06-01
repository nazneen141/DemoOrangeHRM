package seleniumConcepts_May2023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NS011_WebTableConcepts {
public static WebDriver driver;

	public static void main(String[] args) {
		BaseUtils bu = new BaseUtils();
		//CommonUtils cu = new CommonUtils();
		
     driver = bu.launchBrowser("chrome", "https://www.w3schools.com/html/html_tables.asp");
     
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
     //Capturing 'Country value from 1st row, 1st column
     
     String Exp2Colval = "Helen Bennett";
     
     String Exp3Colval = "Canada";
     
     String Exp1colval = "Island Trading";
     Boolean status = true;
     
    String Firstrowval = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[3]")).getText(); 
     System.out.println(Firstrowval);
     
    System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[1]")).getText());
     
     List <WebElement> ThirdColValues = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
     int Trirdcolsize = ThirdColValues.size();
     for (int i = 0; i < Trirdcolsize; i++) {
		String Col3Vals = ThirdColValues.get(i).getText();
		//System.out.println(Col3Vals);
		if (Col3Vals.equalsIgnoreCase(Exp3Colval)) {
			status = true;
			break;
		} else {
			status = false;
		}
	} if (status == true) {
		System.out.println(Exp3Colval + " is present in the third column of Web Table");
	} else {
		System.out.println(Exp3Colval + " is missing in the third column of Web Table");
	}
	
	List <WebElement> Col2vals = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	
	for (int i = 0; i < Col2vals.size(); i++) {
		String Col2Vlaues = Col2vals.get(i).getText();
		System.out.println(Col2Vlaues);
	}
	
	driver.close();
	}

}
