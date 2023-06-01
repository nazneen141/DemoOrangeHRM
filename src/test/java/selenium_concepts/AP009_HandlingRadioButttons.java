package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AP009_HandlingRadioButttons {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
		driver.get("https://www.facebook.com/");
		
		Boolean status = true;
		
		cu.ClickOnElelment(driver.findElement(By.linkText("Create new account")), "Create New Account Link");
		
		Thread.sleep(5000);
		//Xpath - extended path
		
		//Relative X path
		//*[@id="u_2_o_y3"]/span[1]/label
		//*[@id="u_l_o_JB"]/span[1]/label
		//*[@id="u_2_o_rZ"]/span[1]/label
		
		//Absolute Xpath
		///html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label
		
		
		//tagname[@attributename ='attributevalue']
		
		//<button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="websubmit" id="u_2_s_8Q">Sign Up</button>
		
		//button[@type='submit]
		
		/*(//button[@type='submit])[2]
		
		//select[@title='Month']
				
				
				//<a href="/policies/cookies/" id="cookie-use-link" target="_blank" rel="nofollow">Cookies Policy</a>
				
				//a[contains(text(),'Cookies Policy')]
				
				//<button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="websubmit" id="u_l_s_t/">Sign Up</button>
				
				//button[contains(text(),'Sign Up')]
				//(//button[contains(text(),'Sign Up')])[1]
				(//button[contains(text(),'Sign Up')])[position()=1]
						
						<label class="_58mt" for="u_2_4_aw">Female</label>*/
						//label[contains(text(),'Female')]
		cu.ElelementDisplayed(driver.findElement(By.xpath("//label[contains(text(),'Female')]")));
		cu.ClickOnElelment(driver.findElement(By.xpath("//label[contains(text(),'Female')]")), "Female Radio Button");
		
		/*status = driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isDisplayed();
		if (status == true) {
			System.out.println("Female radio button is diaplayed");
			driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
			System.out.println("Selected Female radio button");
		} else {
           System.out.println("Female radio button is not displayed");
		}*/
		
		
		
	}

}
