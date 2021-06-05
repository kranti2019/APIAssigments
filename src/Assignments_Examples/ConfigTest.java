package Assignments_Examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ConfigTest {
	public static Properties prop1;
	public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		prop1 = new Properties();

		
		
			FileInputStream ip = new FileInputStream("/Users/ue/javaworkspace/javapractice/"
				+ "src/Assignments_Examples/config2.properties");
			
			prop1.load(ip);
			
String browserName = prop1.getProperty("browser");
			
			if(browserName.equals("chrome"))
		     {
				System.out.println("chrome..");
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium_3.141.59\\resources\\chromedriver.exe");	
				driver = new ChromeDriver(); 
			 }
			
			else
			if(browserName.equals("FF"))
		    {
					System.setProperty("webdriver.gecko.driver", "C:\\Selenium_3.141.59\\resources\\geckodriver-64bit.exe");	
					driver = new FirefoxDriver();  
			}
			else
			{
				System.out.println("No Browser Found");
		
			}
			driver.get(prop1.getProperty("url"));
			driver.findElement(By.className(prop1.getProperty("avactics_logo"))).isDisplayed();
			driver.findElement(By.xpath(prop1.getProperty("signbttn_xpath"))).click();
			driver.findElement(By.name(prop1.getProperty("username_name"))).sendKeys(prop1.getProperty("username"));
			driver.findElement(By.name(prop1.getProperty("password_name"))).sendKeys(prop1.getProperty("password"));
			driver.findElement(By.xpath(prop1.getProperty("loginbttn-Xpath"))).click();

	}
	}
	

	


