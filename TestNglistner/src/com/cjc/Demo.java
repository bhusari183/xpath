package com.cjc;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.cjc.DemoIsueit.class)
public class Demo {
	public WebDriver driver;
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Chrome94\\\\chromedriver.exe");
		 driver=new ChromeDriver();
	System.out.println("browser open succesfully");
	}
	@BeforeTest
	public void enterApplication()
	{
		driver.get("http://demo.guru99.com/test/newtours/");
		System.out.println("before test annotation");
	}
	@BeforeClass
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
		System.out.println("In Maximise Before class annotation");
	}
	@BeforeMethod
	public void getAllCookies()
	{
		System.out.println("Get all cookies Mehtod under before method");
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie cookie:cookies)
		{
			System.out.println("present Cookie name= "+cookie.getName());
		}
	
	}
	
	@Test
	public void loginchech()
	{
		System.out.println("In login with details");
		driver.findElement(By.name("userName")).sendKeys("QQQQQ");
		driver.findElement(By.name("password")).sendKeys("qqqqq");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	}
	
	@Test
	public void loginchech1()
	{
		System.out.println("In login with details");
		driver.findElement(By.name("userName")).sendKeys("AAAA");
		driver.findElement(By.name("password")).sendKeys("aaaa");
		driver.findElement(By.name("submit")).click();
	}
	
	@AfterMethod
	public void captureScreenShot() throws IOException 
	{
		System.out.println("Capture Screen Shot under Aftermethot");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("F:\\Testing data\\screenshot testing\\New folder"));	
		System.out.println("Successfully Screenshot Taken");
	}
	
	@AfterClass
	public void deleteCookies()
	{
		System.out.println("Delete All Cookies");
		driver.manage().deleteAllCookies();
		
	}
	@AfterTest
	public void dbConnectionClosed() 
	{
		System.out.println("Db connection Closed");
	}
	
	@AfterSuite
	public void closesedBrowser()
	{
		driver.close();
		System.out.println("In close browser Methoid after suite");
	}
}
