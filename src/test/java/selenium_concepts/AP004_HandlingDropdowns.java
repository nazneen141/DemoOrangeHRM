package selenium_concepts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AP004_HandlingDropdowns {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		String Expddval = "10";
		String Expmmval = "Sep";
		String Expyyval = "1990";
		
		boolean status = true;
			
		driver.get("https://www.facebook.com/");
		
		if (cu.ElelementDisplayed(driver.findElement(By.linkText("Create new account"))) == true) {
			System.out.println("Create new account link is present");
		
		} else {
			System.out.println("Create new account link is not present");
		}
		
		cu.ClickOnElelment(driver.findElement(By.linkText("Create new account")), "Create a new account");
		
		Thread.sleep(5000);
		
		
		//Select drop downs can be done by select method in two ways ways
		
		//i method
		
		//driver.findElement(By.id("month")).sendKeys("Nov");
		//driver.findElement(By.name("birthday_day")).sendKeys("8");
		//driver.findElement(By.id("year")).sendKeys("1982");
		
		//ii method by using select class
		
		//Select class
		
		//Select selectm = new Select(driver.findElement(By.id("month")));
		
		
		//1.SelectbyVisibleText
		//selectm.selectByVisibleText("Nov");
		//2.SelectbyIndex
		//selectm.selectByIndex(10);
		//3.SelectbyVal
		//selectm.selectByValue("11");
		
		//Count no.of values in a dropdown// List values in drop down//Validate Value in drop down
		
		cu.SelectValFromDropDown(driver.findElement(By.id("month")), "Month drop down", "Nov");
		cu.CheckValInDropDown(driver.findElement(By.id("month")), "Sep", "Month drop down");
		
		/*List<WebElement> mm = selectm.getOptions();
		
		int mmval = mm.size();
		System.out.println("No of values in month drop down is " + mmval);
		for (int i = 0; i < mmval; i++) {
			String mmvals = mm.get(i).getText();
			//System.out.println(mmvals);
			if (mmvals.equalsIgnoreCase(Expmmval)) {
				status = true;
				break;
			} else {
              status = false;
			}
			
		}
		if (status == true) {
			System.out.println(Expmmval + " is present in the drop down of month");
		} else {
          System.out.println(Expmmval + " is missing in the drop down of month");
		}*/
		
		//Select selectd = new Select(driver.findElement(By.name("birthday_day")));
			
	
		//1.SelectbyVisibleText
		//selectd.selectByVisibleText("8");
		//2.SelectbyIndex
		//selectd.selectByIndex(7);
		//3.SelectbyVal
		//selectd.selectByValue("8");
		
		//Count no.of values in day drop down// List values in drop down
		
		cu.SelectValFromDropDown(driver.findElement(By.name("birthday_day")), "Day drop down", "8");
		cu.CheckValInDropDown(driver.findElement(By.name("birthday_day")), "11", "Day drop down");
		
		/*List  <WebElement> dd = selectd.getOptions();
		int noofdays = dd.size();
		System.out.println("No of values in days drop down is " + noofdays);
		for (int i = 0; i < noofdays; i++) {
			String ddvals = dd.get(i).getText();
			System.out.println(ddvals);
		}
		*/
		
		
		//Select selecty = new Select(driver.findElement(By.id("year")));
		//1.SelectbyVisibleText
		//selecty.selectByVisibleText("1982");
		//2.SelectbyIndex
		//selecty.selectByIndex(41);
		//3.SelectbyVal
		//selecty.selectByValue("1982");
		
		//Count no of values in year drop down// List values in drop down
		
		cu.SelectValFromDropDown(driver.findElement(By.id("year")), "year drop down", "1982");
		cu.CheckValInDropDown(driver.findElement(By.id("year")), "1978", "year drop down");
		
		/*List<WebElement> yy = selecty.getOptions();
		int noofvalsinyear = yy.size();
		System.out.println("No of values in year drop down is " + noofvalsinyear);
		for (int i = 0; i < noofvalsinyear; i++) {
			String yyvals = yy.get(i).getText();
			System.out.println(yyvals);
		}*/
		
		/*if (cu.ElelementDisplayed(driver.findElement(By.linkText("Create new account"))) == true) {
			System.out.println("Create new account - link is present");
			
		} else {
			System.out.println("Create new account - link is present");
		}*/
      
      
      //Selecting a value from a drop-down
      //1. One way of selecting values
      /*driver.findElement(By.id("month")).sendKeys("November");
      driver.findElement(By.id("day")).sendKeys("8");
      driver.findElement(By.id("year")).sendKeys("1982");*/
      
      //2.Other way of selecting values from drop down
      
      
      
      //Use Select class
      //Select select = new Select(driver.findElement(By.id("month")));
   
     // select.selectByVisibleText("November");
      
     // cu.SelectValFromDropDown(driver.findElement(By.id("month")), "Month drop down", 10);
    // cu.SelectValFromDropDown(driver.findElement(By.id("year")), "Year drop down", "1982");
      
     // cu.SelectValFromDropDown(driver.findElement(By.id("day")), "day drop down", 7);
      
      //Select select = new Select(driver.findElement(By.id("day")));
   // - selectByVisibletext
      //select.selectByVisibleText("8");
      
      //-selectByIndex
     // select.selectByIndex(7);
      
      //-SelectByValue
      //select.selectByValue("20");
     // Select select = new Select(driver.findElement(By.id("year")));
      
      
      //Count no.of values in a dropdown
      
     /* List<WebElement> dd = select.getOptions();
        int vals = dd.size(); 
        System.out.println("The no.of values in the drop down for day is " + vals);
        for (int i = 0; i < vals; i++) {
        	String ddvals = dd.get(i).getText();
			System.out.println(ddvals);
			
			if (ddvals.equalsIgnoreCase(Expddval)) {
				status = true;
				break;
			} else {
				status = false;
				
			}
			
		}
        if (status == true) {
			System.out.println(Expddval + " present in the drop down in days");
			System.out.println("PASS");
			
		} else if (status == false){
			System.out.println("FAIL");
		}*/
     //cu.CheckValInDropDown(driver.findElement(By.id("month")), "Nov", "Month drop down");
     //cu.CheckValInDropDown(driver.findElement(By.id("year")), "1982", "Year drop down");
      //cu.CheckValInDropDown(driver.findElement(By.id("day")), "8", "Day drop down");
	}

}
