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

import com.test.utility.Incident_investigation_Util;

public class Incident_Review_DepartmentHead_Test {

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
	public void Incident_Review_DepartmentHead(String UserName,String Password,String SubUnit,String Department,String Contractor,String Area,String Shift,String ExactLocation,
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
		driver.findElement(By.id("txtUserName")).sendKeys(DepartmentHeadUsername);
		Thread.sleep(1000);
		//Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys(DepartmentHeadPassword);
		Thread.sleep(1000);
		//Click on submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);
		
		//For you Review
		driver.findElement(By.xpath("//div[contains(@class,'lead-statistics relative two bg-warning')]//i[@class='arrow icofont-arrow-right']")).click();
		Thread.sleep(10000);
		//Click on that 
		driver.findElement(By.partialLinkText(Clickonthat)).click();
		Thread.sleep(15000);
						
		//New window handle
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}	
		//code to do something on new window
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//scroll down
		jse.executeScript("scroll(0, 250);");
		
		//Injured Person Details
		driver.findElement(By.xpath("//span[contains(text(),'Injured Person Details')]")).click();
		Thread.sleep(3000);
		jse.executeScript("scroll(0, 250);");
		Thread.sleep(2000);
		
		//Type of Injury
		Select TypeofInjurY = new Select(driver.findElement(By.id("ddlIncidentType0")));
		TypeofInjurY.selectByVisibleText(TypeofInjury);
		Thread.sleep(2000);
		
		//injury Details
		//Nature of Injury 
		Select NatureofInjurY =new Select(driver.findElement(By.xpath("//select[@name='ddlNatureOfInjury0']")));
		NatureofInjurY.selectByVisibleText(NatureofInjury);
		Thread.sleep(2000);
		
		//Body Part 
		driver.findElement(By.xpath("//label[contains(text(),'Chest')]")).click();
		Thread.sleep(1000);
		
		//scroll down
		jse.executeScript("scroll(0, 250);");
		
		//Authorization Action
		Select Authorizationaction = new Select(driver.findElement(By.id("ddlAction")));
		Authorizationaction.selectByVisibleText(AuthorizationAction);
		Thread.sleep(2000);
		
		//Comment
		driver.findElement(By.id("txtComment")).sendKeys(Comment);
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
