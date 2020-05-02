package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class Testng_datadrivenTestScript {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		//launch browser
		System.out.println("browser launched successfully");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8080/validationPro/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Iterator<Object[]> GetTestData()
	{
		
		ArrayList<Object[]>testdata=TestUtil.GetDataFromExcel();
		return testdata.iterator();
		
		
	}
	

	@Test(dataProvider="GetTestData",priority=1)
	public void EmployeeFeedbackSignup_Test(String companyname,String businessemailid, String businessphoneno, String password, String repeatpwd ) throws InterruptedException
	{
	
		
		//click on signup button
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		System.out.println("signup popup open successfully");
				
		//wait 30 seconds
		Thread.sleep(30000);
		
		//Enter Data 
		
		//enter company name
		driver.findElement(By.id("cmname")).clear();
		driver.findElement(By.id("cmname")).sendKeys(companyname);
		System.out.println("company name filled successfully");
		
		//enter business email id 
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(businessemailid);
		System.out.println("business email id entered successfully");
		
		//Enter business phone number
		driver.findElement(By.id("phno")).clear();
		driver.findElement(By.id("phno")).sendKeys(businessphoneno);
		System.out.println("business phone number entered successfully");
		
		//Enter password
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		System.out.println("password entered successfully");
		
		//Enter repeat password
		driver.findElement(By.id("cnfpass")).clear();
		driver.findElement(By.id("cnfpass")).sendKeys(repeatpwd);
		System.out.println("repeat password entered successfully");
		
		
		//click on I agree
		driver.findElement(By.id("agree")).click();
		System.out.println("click successfully");
				
		//click on register
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		System.out.println("successfully registred");
		
		
		
		
				
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//close browser
		driver.quit();		
		System.out.println("browser closed suuccessfully");
	}
	
}
