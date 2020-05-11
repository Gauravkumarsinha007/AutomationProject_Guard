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

import com.test.utility.Incident_investigation_Util;

public class Report_Incident_Test {

	
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
		
		ArrayList<Object[]>testdata=Incident_investigation_Util.GetDataFromExcel();
		return testdata.iterator();
		
		
	}
	
	@Test(dataProvider="GetTestData",enabled=true)
	public void Report_Incident_operator(String UserName,String Password,String SubUnit,String Department,String Contractor,String Area,String Shift,String ExactLocation,
			String Descriptionofwhathappened,String ImmediateContainmentAction,String Employee,String Name,String Age,String DepartmentOP,String Gender,String Attachments1,
			String Attachments2,String Attachments3,String Attachments4,String DepartmentHeadUsername,String DepartmentHeadPassword,String Clickonthat,String TypeofInjury,
			String NatureofInjury,String AuthorizationAction,String Comment,String UnitMRUsername,String UnitMRPassword,String AuthorizationActionUnitMR,String CommentUnitMR,
			String searchemployee,String operatorInvestigationUsername,String operatorInvestigationPassword,String Actiontobetaken,String Responsibility,String Priority,
			String AuthorizationActionoperatorInvestigation,String CommentoperatorInvestigation,String ClusterEHSHeadUsername,String ClusterEHSHeadPassword,
			String AuthorizationActionClusterEHSHead,String ClusterEHSHeadComment,String InvstegationUnitMRUsername,String InvstegationUnitMRPassword,
			String AuthorizationActionInvstegationUnitMR,String InvstegationUnitMRComment,String InvstegationUnitHEADUsername,String InvstegationUnitHEADPassword,
			String AuthorizationActionInvstegationUnitHEAD,String InvstegationUnitHEADComment) throws InterruptedException, AWTException
	{
		//Enter User name 
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		Thread.sleep(1000);
		//Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(5000);
		//Click on submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		
		//click on side bar
		driver.findElement(By.xpath("//a[@class='nav-link toggleMenubar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnBack")).click();
		Thread.sleep(1000);
		//EHS Observation side bar 
		driver.findElement(By.xpath("//span[text()='Incident']")).click();
		Thread.sleep(1000);
		
		//Report EHS incident
		driver.findElement(By.xpath("//span[text()='Report Incident']")).click();
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

		//Shift 
		Select ShifT = new Select(driver.findElement(By.xpath("//select[@id='ddlShift']")));
		ShifT.selectByVisibleText(Shift);
		Thread.sleep(1000);
		
		//Exact Location
		driver.findElement(By.xpath("//input[@placeholder='Exact Location']")).sendKeys(ExactLocation);
		Thread.sleep(1000);
		
		//Injury occured
		driver.findElement(By.xpath("//label[contains(text(),'Injury Occured ?')]")).click();
		Thread.sleep(1000);
		
		//click on first aid case 
		driver.findElement(By.xpath("//input[@id='chkincidentCategory_Acc0']")).click();
		Thread.sleep(1000);
		
		//Description of what happened
		driver.findElement(By.id("txtWhatHappenedDesc")).sendKeys(Descriptionofwhathappened);
		Thread.sleep(1000);
		
		//Immediate/Containment Action Taken (Also mention who visited site first and what action was proposed by him? if applicable)
		driver.findElement(By.xpath("//textarea[@ng-model='incidentFIRDetail.ImmediateAction']")).sendKeys(ImmediateContainmentAction);
		Thread.sleep(1000);
		
		//add injured person 
		driver.findElement(By.id("btnAddVictim")).click();
		Thread.sleep(2000);
		
				//Employee(s) / Other
				Select emp = new Select(driver.findElement(By.xpath("//select[@name='ddlVictimType']")));
				emp.selectByVisibleText(Employee);
				Thread.sleep(1000);
				
				//Name
				driver.findElement(By.xpath("//input[@placeholder='Employee Name']")).sendKeys(Name);
				Thread.sleep(1000);
				
				//Age 
				driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys(Age);
				Thread.sleep(10000);
		
				//Department
				driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys(DepartmentOP);
				Thread.sleep(1000);
				
				//Gender 
				Select GendeR = new Select(driver.findElement(By.xpath("//select[@name='ddlVictimGender']")));
				GendeR.selectByVisibleText(Gender);
				Thread.sleep(1000);
				
				//Save 
				driver.findElement(By.xpath("//button[@class='btn btn-icon btn-success btn-xs waves-effect waves-light m-r-5']")).click();
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
