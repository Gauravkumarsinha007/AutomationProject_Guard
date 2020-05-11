package com.datadriven.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Incident_investigation_Test {

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
	public void Incident_Review_operator_Investigation(String UserName,String Password,String SubUnit,String Department,String Contractor,String Area,String Shift,String ExactLocation,
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
		driver.findElement(By.id("txtUserName")).sendKeys(operatorInvestigationUsername);
		Thread.sleep(1000);
		//Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys(operatorInvestigationPassword);
		Thread.sleep(1000);
		//Click on submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);
	
		//Click on that 
		driver.findElement(By.partialLinkText(Clickonthat)).click();
		Thread.sleep(10000);

		
		//New window handle
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		
		for (String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}	
		//code to do something on new window
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Click on Investigation 
		driver.findElement(By.xpath("//a[@class='st_tab']")).click();
		Thread.sleep(8000);
		
		//scroll down
		jse.executeScript("scroll(0, 250);");
		Thread.sleep(8000);
		
		//Section D : IMPROVE & CONTROL (Recommendation(s))
		driver.findElement(By.xpath("//span[contains(text(),'Section F : IMPROVE & CONTROL (Recommendation(s))')]")).click();
		Thread.sleep(1000);
		
		//Add Action to be Taken
		driver.findElement(By.xpath("//button[@id='btnAddCAPA300']")).click();
		Thread.sleep(1000);
		
		//Action to be taken 
		driver.findElement(By.xpath("//textarea[@name='txtTaskDescription']")).sendKeys(Actiontobetaken);
		Thread.sleep(1000);
		
		//Responsibility 
		driver.findElement(By.xpath("//input[@name='txtResponsible']")).sendKeys(Responsibility);
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//Priority
		Select priority = new Select(driver.findElement(By.xpath("//select[@name='ddlTaskPriority']")));
		priority.selectByVisibleText(Priority);
		Thread.sleep(1000);
		
		//Save CAPA
		driver.findElement(By.xpath("//button[@class='btn btn-icon btn-success btn-xs waves-effect waves-light m-r-5 save-btn']")).click();
		Thread.sleep(2000);
	
		//Authorization Action
		Select Authorizationaction = new Select(driver.findElement(By.id("ddlAction")));
		Authorizationaction.selectByVisibleText(AuthorizationActionoperatorInvestigation);
		Thread.sleep(2000);
		
		//Comment
		driver.findElement(By.id("txtComment")).sendKeys(CommentoperatorInvestigation);
		Thread.sleep(1000);
			
		//scroll down
		jse.executeScript("scroll(0, 250);");
		
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
