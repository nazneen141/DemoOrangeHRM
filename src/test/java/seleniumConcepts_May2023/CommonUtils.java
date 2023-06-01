package seleniumConcepts_May2023;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {
	public void ValidateDropDownOptions(WebElement ele, String elementname, String ExpValue) {
		try {
			Select select = new Select(ele);
			boolean status = true;
			List <WebElement> Listofdd = select.getOptions();
			int Listsize = Listofdd.size();
			System.out.println("The no. of options in the " +elementname + " are " + Listsize);
			for (int i = 0; i < Listsize; i++) {
				String Listvals = Listofdd.get(i).getText();
				if (Listvals.equalsIgnoreCase(Listvals)) {
					status = true;
					break;
				} else {
					status = false;
				}
			} if (status == true) {
				System.out.println(ExpValue + " is present in " + elementname);
			} else {
				System.out.println(ExpValue + " is missing in " +elementname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public void selectValFromDropDown(WebElement ele, int indexno, String elelmentname) {
		try {
			Select select = new Select (ele);
			select.selectByIndex(indexno);;
			System.out.println("Value selected from "+ elelmentname + " drop down");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void selectValFromDropDown(WebElement ele, String val, String elelmentname) {
		try {
			Select select = new Select (ele);
			select.selectByVisibleText("val");
			System.out.println(val + "selected from drop down "+ elelmentname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void clickElement(WebElement ele, String elelmentname) {
		try {
			ele.click();
			System.out.println("Clicked on "+ elelmentname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
public boolean elementDisplayed(WebElement ele) {
	boolean displaystatus = ele.isDisplayed();
		
	return displaystatus;
}
/***
 * @author chand
 * @Description: This method is used to enter value in input fields based on element details passed
 * @Date: 2023-05-24
 * @param val
 * @param ele
 * @param Elementname
 */
public void enterValue(String val, WebElement ele, String Elementname) {
	try {
		ele.sendKeys(val);
		String valentered = ele.getAttribute("value");
		System.out.println("Value entered in " + Elementname + " is "+ valentered);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}




}
