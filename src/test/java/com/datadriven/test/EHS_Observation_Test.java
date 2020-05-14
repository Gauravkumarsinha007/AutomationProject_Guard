package com.datadriven.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.EHS_Observation_Util;


public class EHS_Observation_Test {

	
	
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
		
		ArrayList<Object[]>testdata=EHS_Observation_Util.GetDataFromExcel();
		return testdata.iterator();
		
		
	}
	
	@Test(dataProvider="GetTestData",enabled=true)
	public void EHS_ObserVation_Report_operator(String UserName,String Password,String SubUnit,String Department,String Contractor,String Area,String ExactLocation,String Severity,
			String ObservationType,String ObservationCategory,String NoOfPersons,String Descriptionofwhathappened,String ImmediateContainmentAction,String ReportedbyName,String Attachments1,
			String Attachments2,String Attachments3,String Attachments4,String DepartmentHeadUsername,String DepartmentHeadPassword,String Clickonthat,String AuthorizationAction,
			String Comment,String ActiontobeTaken,String Responsibility,String Priority1) throws InterruptedException, AWTException
	{
		//Enter User name 
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		Thread.sleep(1000);
		//Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(1000);
		//Click on submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		
		//click on side bar
		driver.findElement(By.xpath("//a[@class='nav-link toggleMenubar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnBack")).click();
		Thread.sleep(1000);
		//EHS Observation side bar 
		driver.findElement(By.xpath("//span[text()='EHS Observation']")).click();
		Thread.sleep(1000);
		
		//Report EHS Observation 
		driver.findElement(By.xpath("//span[text()='Report EHS Observation']")).click();
		Thread.sleep(4000);
		
		//Sub Unit 
		driver.findElement(By.id("txtSubUnit_value")).sendKeys(SubUnit);
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//Department/Function *
		driver.findElement(By.id("txtFunction_value")).sendKeys(Department);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		//Contractor/Sub-Contractor
		driver.findElement(By.id("txtAgency_value")).sendKeys(Contractor);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//Area 
		driver.findElement(By.id("txtLocation_value")).sendKeys(Area);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		//Exact Location
		driver.findElement(By.id("txtExactLocation")).sendKeys(ExactLocation);
		Thread.sleep(1000);
		
		//Severity
		Select Severity1 = new Select(driver.findElement(By.id("ddlSeverityType")));
		Severity1.selectByVisibleText(Severity);
		Thread.sleep(1000);
		
		//Observation Type 
		Select ObservationType1 = new Select(driver.findElement(By.id("ddlObservationType")));
		ObservationType1.selectByVisibleText(ObservationType);
		Thread.sleep(1000);
		
		//Observation Category 
		Select ObservationCategory1 = new Select(driver.findElement(By.id("ddlObservationCategory")));
		ObservationCategory1.selectByVisibleText(ObservationCategory);
		Thread.sleep(1000);
		
		//No Of Persons 
		driver.findElement(By.id("txtNoOfPerson")).sendKeys(NoOfPersons);
		Thread.sleep(1000);
		
		//Description of what happened 
		driver.findElement(By.id("txtDescription")).sendKeys(Descriptionofwhathappened);
		Thread.sleep(1000);
		
		//Immediate/Containment Action Taken (Also mention who visited site first and what action was proposed by him? if applicable)
		driver.findElement(By.xpath("//textarea[@ng-model='incidentFIRDetail.ImmediateAction']")).sendKeys(ImmediateContainmentAction);
		Thread.sleep(1000);
		
		//Reported by Name 
		driver.findElement(By.id("txtIncidentReportedByName_value")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("txtIncidentReportedByName_value")).sendKeys(ReportedbyName);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		//Attachments
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(Attachments1);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(Attachments2);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(Attachments3);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(Attachments4);
		
		//click on single upload 
		driver.findElement(By.xpath("//tr[1]//td[6]//button[1]//i[1]")).click();
		Thread.sleep(1000);
		
		//click on upload all 
		driver.findElement(By.xpath("//button[@name='btnUploadAll']")).click();
		Thread.sleep(5000);
		
		//Save as draft
//		driver.findElement(By.xpath("//button[@class='btn btn-warning m-b-5 ng-scope']")).click();
//		Thread.sleep(1000);
		
		//Submit
		driver.findElement(By.xpath("//button[@class='btn btn-success waves-effect w-md waves-light m-b-5']")).click();
		Thread.sleep(10000);

	}
	
	@AfterMethod
	public void AMTest() throws InterruptedException
	{
		driver.quit();
		System.out.println("Close browser successfully");
	}
}
