package testngConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AP004_Application {
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
	@Test(priority=2)
	public void CheckNewAccButtonDisplayed() {
		boolean status = driver.findElement(By.linkText("Create new account")).isDisplayed();
		Assert.assertTrue(status, "Create new account Link is not displayed");
		System.out.println("Create new account link is displayed");
	}
	@Test (priority=3)
	public void verifyLoginbutton() {
		Assert.assertEquals(driver.findElement(By.xpath("//button[@name='login']")).isDisplayed(), true, "Login buttton is missing");
		System.out.println("Login button is displayed");
	}
   
}
