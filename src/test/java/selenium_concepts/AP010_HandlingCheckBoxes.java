package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AP010_HandlingCheckBoxes {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		PS003_BaseUtlis bu = new PS003_BaseUtlis();
		CommonUtils cu = new CommonUtils();
		
		driver = bu.LaunchBrowser("chrome");
		
		driver.get("https://jqueryui.com/");
		
		cu.ClickOnElelment(driver.findElement(By.linkText("Checkboxradio")), "Check Box Link");
		
		driver.switchTo().frame(0);
		
        cu.ClickOnElelment(driver.findElement(By.xpath("//label[contains(text(),'New York')]")), "New York CheckBox");
        cu.ClickOnElelment(driver.findElement(By.xpath("//label[contains(text(), '4 Star')]")), "4-star checkbox");
        cu.ClickOnElelment(driver.findElement(By.xpath("//label[@for='checkbox-nested-4']")), "King Bed CheckBox");
	}

}
