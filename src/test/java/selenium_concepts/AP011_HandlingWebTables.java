package selenium_concepts;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AP011_HandlingWebTables {
 public static WebDriver driver;
 
	public static void main(String[] args) throws InterruptedException {
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
			
		String Expvalue = "Island Trading";
		String ExpSeccolval = "Roland Mendel";
		
		Boolean status = true;
		
		
		//cu.ClickOnElelment(driver.findElement(By.linkText("HTML Tables")), "HTML Tables Link");
		
		
		String Row1val = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
		System.out.println(Row1val);
		
		String Rowval2 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[1]")).getText();
		System.out.println(Rowval2);
		
		List<WebElement> rowvals = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		for (int i = 0; i < rowvals.size(); i++) {
			String ActValues = rowvals.get(i).getText();
			if (ActValues.equalsIgnoreCase(Expvalue)) {
				status = true;
				break;
				
			} else {
                status = false;
			}
		} if (status == true) {
			System.out.println(Expvalue + " is present in the WebTable");
		} else {
			System.out.println(Expvalue + " is not present in the WebTable");
		}
		
		List<WebElement> Seccolvals = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		
		for (int i = 0; i < Seccolvals.size(); i++) {
			String Seccolvalues = Seccolvals.get(i).getText();
			
			if (Seccolvalues.equalsIgnoreCase(ExpSeccolval)) {
				status = true;
				break;
			} else {
				status = false;
			}
		} if (status == true) {
			System.out.println(ExpSeccolval + " is present in the second column of WebTable");
			
		} else {
			System.out.println(ExpSeccolval + " is not present in the second column of WebTable");
		}
		
		
		/*String Col3txt = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[3]")).getText();
		System.out.println(Col3txt);
		
		String Row3val = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]")).getText();
		System.out.println(Row3val);
		
		String Row5val = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]")).getText();
		System.out.println(Row5val);
		*/
		//Boolean status = true;
		
		//To capture all the values of a row
		/*List<WebElement> totvals = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		System.out.println("Total no.of rows are " + totvals.size());
		for (int i = 0; i < totvals.size(); i++) {
			String printvals = totvals.get(i).getText();
			System.out.println(printvals);
		}
		
		List<WebElement> Seccolvals = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		System.out.println("Total no.of vals are " + Seccolvals.size());
		for (int i = 0; i < Seccolvals.size(); i++) {
			String Seccolvalues = Seccolvals.get(i).getText();
		//System.out.println(Seccolvalues);
			if (Seccolvalues.equalsIgnoreCase(expval)) {
				status = true;
				break;
			} else {
               status = false;
			}
		}  if (status == true) {
			System.out.println(expval + " is present in the Web Table");
		} else {
            System.out.println(expval + " is mssing in the Web Table");
		}

		String newval = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]")).getText();
		System.out.println(newval);
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		for (int i = 0; i < row1.size(); i++) {
			String Row1vals = row1.get(i).getText();
			System.out.println(Row1vals);
		}*/
	}

}
