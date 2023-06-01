package testngConcepts;
//Exception concept can be applied for test cases but not for before method and after method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AP005_EnabledConcept {
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApplication() {
		System.out.println("*********Open Application********");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}
	
	 @AfterMethod
	 public void closeApplication() {
    	System.out.println("*************Close Application***********");
		 driver.close();
	 }
	
	@Test(priority=1)
	public void CheckForgotPassword() {
		boolean status = driver.findElement(By.linkText("Forgot password?")).isDisplayed();
		Assert.assertEquals(status, true, "Forgot password? link is not displayed");
		System.out.println("Forgot password? link is displayed");
	}
	
	//Enabled concept is to exclude the execution instead of commenting
	@Test(priority=2, enabled = false)
	public void CheckNewAccButtonDisplayed() {
		boolean status = driver.findElement(By.linkText("Create new account")).isDisplayed();
		Assert.assertTrue(status, "Create new account Link is not displayed");
		System.out.println("Create new acoount link is not displayed");
	}
	@Test (priority=3, enabled = false)
	public void verifyLoginbutton() {
		Assert.assertEquals(driver.findElement(By.xpath("//button[@name='login']")).isDisplayed(), true, "Login buttton is missing");
		System.out.println("Login button is displayed");
	}
   
}
