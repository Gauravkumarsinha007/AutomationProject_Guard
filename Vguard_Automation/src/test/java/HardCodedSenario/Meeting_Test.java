package HardCodedSenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Meeting_Test {
	
	
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
	
	@Test(priority=1,enabled=false)
	public void Schedule_Meeting_Test() throws InterruptedException, AWTException
	{
		//Enter User name 
		driver.findElement(By.id("txtUserName")).sendKeys("demogaurav007");
		Thread.sleep(1000);
		//Enter Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
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
		driver.findElement(By.xpath("//span[text()='Schedule Meeting']")).click();
		Thread.sleep(15000);
		
		//Meeting Type 
		Select MeetingType = new Select(driver.findElement(By.id("ddlMeetingType")));
		MeetingType.selectByVisibleText("EHS Committee Meeting");
		Thread.sleep(2000);
		
		//Meeting Topic 
		Select MeetingTopic = new Select(driver.findElement(By.id("ddlMeetingTopic")));
		MeetingTopic.selectByVisibleText("EHS M");
		Thread.sleep(2000);
		
		//Meeting Venue 
		Select MeetingVenue =new Select(driver.findElement(By.id("ddlMeetingVenue")));
		MeetingVenue.selectByVisibleText("Conference Hall Chavdi Unit");
		Thread.sleep(2000);
		
		//Start Time 
		Select StartTime = new Select(driver.findElement(By.id("ddlStartTime")));
		StartTime.selectByVisibleText("03:45 PM");
		Thread.sleep(2000);
		
		//End Time 
		Select EndTime = new Select(driver.findElement(By.id("ddlEndTime")));
		EndTime.selectByVisibleText("03:45 PM");
		Thread.sleep(2000);
				
		//Meeting Host 
		driver.findElement(By.id("txtMeetingHost_value")).sendKeys("gaurav");
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//Meeting Chair Person 
		driver.findElement(By.id("txtMeetingChairPerson_value")).sendKeys("Mathew");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//Meeting Agendas
		//Add Meeting agenda 
		driver.findElement(By.xpath("//button[@class='btn btn-primary waves-effect waves-light btn-xs m-t-5 pull-right']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@name='txtCheckListName']")).sendKeys("Test Agenda");
		Thread.sleep(2000);
		
		//Save 
		driver.findElement(By.xpath("//button[@class='btn btn-icon btn-success btn-xs waves-effect waves-light m-r-5']")).click();
		Thread.sleep(2000);
	
		//Meeting Attendees
		//Add Participants
		driver.findElement(By.xpath("//button[@id='btnAddEmployee']")).click();
		Thread.sleep(2000);
	
		//Employee name 
		driver.findElement(By.id("txtVictimName_value")).sendKeys("Ravi Kumar");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//Email id 
		driver.findElement(By.xpath("//input[@placeholder='Email Id']")).sendKeys("Test@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-icon btn-success btn-xs waves-effect waves-light m-r-5']")).click();
		Thread.sleep(2000);
		
		//Attach file 
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\GAURAV\\workspace\\Vguard_Automation\\Images\\Image.jpg");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\GAURAV\\workspace\\Vguard_Automation\\Images\\CeilingFan.jpg");
		Thread.sleep(2000);
		//click on single upload 
		driver.findElement(By.xpath("//tr[1]//td[6]//button[1]//i[1]")).click();
		Thread.sleep(1000);
		
		//click on upload all 
		driver.findElement(By.xpath("//button[@name='btnUploadAll']")).click();
		Thread.sleep(5000);
	
		//Is Meeting Schedule 
		driver.findElement(By.xpath("//label[@class='PointerHand']")).click();
		Thread.sleep(2000);
		
		
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
