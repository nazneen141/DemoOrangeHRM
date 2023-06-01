package seleniumConcepts_May2023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NS004_HandlingDropDowns {
 public static WebDriver driver;
 
	public static void main(String[] args) {
		BaseUtils bu = new BaseUtils();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.launchBrowser("chrome", "https://www.facebook.com");
		
		cu.clickElement(driver.findElement(By.linkText("Create new account")), "Create new Account Link");
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   //Selecting values directly by .sendkeys
   driver.findElement(By.id("month")).sendKeys("Nov");
   driver.findElement(By.id("day")).sendKeys("8");
   
   //Selecting Value from month dropdown
   //1.Select by visibleText
   //2.Select by index
   //3.Select by value
   
  
   String ExpDayVal = "10";
   boolean statusd = true;
   String ExpYearVal = "2000";
   boolean statusy = true;
   
   /*Select selectm = new Select(driver.findElement(By.id("month")));
    selectm.selectByVisibleText("Nov");*/
   cu.selectValFromDropDown(driver.findElement(By.id("month")), "Nov", "Month drop down");
    
   // Listing the values in Month drop down
   cu.ValidateDropDownOptions(driver.findElement(By.id("month")), "Month drop down", "Oct");
    
    //**************************************************************************************************
    Select selectd = new Select (driver.findElement(By.id("day")));
    selectd.selectByIndex(7);
    
    List <WebElement> daylist = selectd.getOptions();
    int Daysize = daylist.size();
    System.out.println("No.of values in day drop down are - " + Daysize);
    for (int i = 0; i < Daysize; i++) {
    	String Dayvals = daylist.get(i).getText();
    	if (Dayvals.equalsIgnoreCase(ExpDayVal)){
			statusd = true;
			break;
		} else {
			statusd = false;
		}
		
	} if (statusy == true) {
		System.out.println(ExpDayVal + " is present in day drop down");
	} else {
		System.out.println(ExpDayVal + " is missing in day drop down");
	}
	//********************************************************************************************************
    Select selecty = new Select (driver.findElement(By.id("year")));
    
   selecty.selectByValue("1982");
   
   List <WebElement> yearlist = selecty.getOptions();
  int yearsize = yearlist.size();
   System.out.println("No.of options in year drop down are " + yearsize);
   for (int i = 0; i < yearsize; i++) {
	String Yearval = yearlist.get(i).getText();
	if (Yearval.equalsIgnoreCase(ExpYearVal)) {
		statusy = true;
		break;
	} else {
		statusy = false;
	}
} if (statusy == true) {
	System.out.println(ExpYearVal + " is present in drop down");
} else {
	System.out.println(ExpYearVal + " is missing in drop down");
}
	}

}
