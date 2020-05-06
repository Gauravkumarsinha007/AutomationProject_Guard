package com.datadriven.test;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.Meeting_Util;

public class MeetingPostpone_Test {

	
	WebDriver driver;
	
	@BeforeMethod
	public void BMTest () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/GAURAV/workspace/Vguard_Automation/driver/chromedriver.exe");
        driver = new ChromeDriver();
		System.out.println("Launch browser successfully");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://safeaskehs.cloudapp.net:65002/Account/Login");
		Thread.sleep(10000);
		  
	}
	@DataProvider
	public Iterator<Object[]> GetTestData()
	{
		
		ArrayList<Object[]>testdata=Meeting_Util.GetDataFromExcel();
		return testdata.iterator();
		
		
	}
	
	@Test(dataProvider="GetTestData",enabled=true)
	public void Schedule_Meeting_PostPone_Test(String UserName,String Password,String MeetingType,String MeetingTopic,String MeetingVenue,String StartTime,String EndTime,String MeetingHost,
			String MeetingChairPerson,String Meetingagenda,String Employeename,String Email,String Attach1,String Attach2,String Meetingpoint,String AuthorizationactionCompleted,
			String Comment,String AuthorizationactionPostpone,String PostponeStartTime,String PostponeEndTime,String Postponecomment,String Authorizationactioncancelled,
			String cancelledcomment) throws InterruptedException, AWTException
	{
		//Enter User name 
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		Thread.sleep(1000);
		//Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(5000);
		//Click on submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		
		//click on side bar
		driver.findElement(By.xpath("//a[@class='nav-link toggleMenubar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnBack")).click();
		Thread.sleep(1000);
	
		//Click on meeting 
		driver.findElement(By.xpath("//span[text()='Meeting']")).click();
		Thread.sleep(1000);
		
		//Schedule Meeting
		driver.findElement(By.xpath("//span[text()='My Meeting']")).click();
		Thread.sleep(10000);
		
		//Click on Edit Meeting 
		driver.findElement(By.xpath("//tr[1]//a[@title='Edit']")).click();
		Thread.sleep(5000);
	
		
		//New window handle
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		
		for (String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}	
		//code to do something on new window
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//scroll down
		jse.executeScript("scroll(0, 250);");

		//Authorization Action
		Select Authorizationaction = new Select(driver.findElement(By.id("ddlAction")));
		Authorizationaction.selectByVisibleText(AuthorizationactionPostpone);
		Thread.sleep(2000);
		
		//Start Time 
		Select StartTime1 = new Select(driver.findElement(By.id("ddlStartTime")));
		StartTime1.selectByVisibleText("04:45 PM");
		Thread.sleep(2000);
		
		//End Time 
		Select EndTime1 = new Select(driver.findElement(By.id("ddlEndTime")));
		EndTime1.selectByVisibleText("04:45 PM");
		Thread.sleep(2000);

		//scroll down
		jse.executeScript("scroll(0, 250);");
		
		
		//Comment
		driver.findElement(By.id("txtComment")).sendKeys(Postponecomment);
		Thread.sleep(1000);
							
		
		//Submit 
		driver.findElement(By.xpath("//button[@class='btn btn-success waves-effect w-md waves-light m-b-5']")).click();
		Thread.sleep(5000);
		
		driver.close(); // close newly opened window when done with it
		driver.switchTo().window(parentHandle); // switch back to the original window

	
	}

	
	
	@AfterMethod
	public void AMTest() throws InterruptedException
	{
		driver.quit();
		System.out.println("Close browser successfully");
	}

}
