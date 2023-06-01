package selenium_concepts;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {
	
  
	public void SelectValFromDropDown (WebElement ele , String elementname, String val) {
		try {
			Select select = new Select(ele);
			select.selectByVisibleText(val);
	   System.out.println("Value selected in - " + elementname + " is " + val);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void SelectValFromDropDown (WebElement ele , String elementname, int indexno) {
		try {
			Select select = new Select(ele);
			select.selectByIndex(indexno);
			System.out.println("Value selected in - " + elementname + " is " + indexno);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/***
	 * @author Nazneen
	 * @Description This method can be used to enter values into fields after entering Webelement
	 * @param ele
	 * @param val
	 * @param ElelmentName
	 */
	public void EnterAValue (WebElement ele, String val , String ElelmentName) {
		try {
			ele.sendKeys(val);
		    String valenetered = ele.getAttribute("value");
		    System.out.println("The value entered in " + ElelmentName + " is " + valenetered);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	    public boolean ElelementDisplayed (WebElement ele) {
		boolean status = ele.isDisplayed();
		//System.out.println("");
		return status;
		
		
		 }
	  //Click can be on a link,field, checkbox, dropdown
	   /***
	    * @author chand
	    * @description Method created to click on a WebElelment
	    * @param ele
	    * 
	    */
		 public void ClickOnElelment (WebElement ele, String elename) {
			 try {
				 ele.click();
				 System.out.println("Clicked on " + elename);
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 
		
	}
         public void CheckValInDropDown(WebElement ele, String ExpVal, String elementname) {
        	 boolean status = true;
			 
				 Select select = new Select(ele);
				 List <WebElement> ll = select.getOptions();
				 //int Listsize = ll.size();
				 
				 //System.out.println("The no.of values in " + elementname + " is "+ Listsize);
				 
				 for (int i = 0; i < ll.size(); i++) {
					String ActVal = ll.get(i).getText();
					//System.out.println(ActVal);
					if (ActVal.equalsIgnoreCase(ExpVal)) {
						status = true;
						break;
					} else {
                       status = false;
					}
					
				}
				 
				 if (status == true) {
						System.out.println(ExpVal + " is present in the " + elementname);
					} else {
                    System.out.println(ExpVal + " is missing in the " + elementname);
					}
			 
		 }  
	    	
	    	
	    	
	    }
	   





