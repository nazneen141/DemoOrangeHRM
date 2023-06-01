package testngConcepts;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Exception concept can be applied for test cases but not for before method and after method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AP006_ApplicationLoginTests {
	public WebDriver driver;
	public Properties prop;
	
	
	@BeforeMethod
	public void OpenApplication() throws IOException {
		
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Selenium\\Java_Programming_Nov2022\\April2023_Selenium_MavenProject\\config.properties");
	prop.load(fis);
		String AppURL = prop.getProperty("url");
		
		System.out.println("*********Open Application********");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(AppURL);
	}
	
	 @AfterMethod
	 public void closeApplication() {
    	System.out.println("*************Close Application***********");
		 driver.close();
	 }
	@Test
	public void LoginTest() {
		
		String EmailID = prop.getProperty("emailid");
		
		String pwd = prop.getProperty("password");
	
		driver.findElement(By.id("email")).sendKeys(EmailID);
		String Username = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("Email ID entered is " +Username);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		String Passwrd = driver.findElement(By.id("pass")).getAttribute("value");
		System.out.println("Password entered is " + Passwrd);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("Clicked on Login button");
	}
   
}
