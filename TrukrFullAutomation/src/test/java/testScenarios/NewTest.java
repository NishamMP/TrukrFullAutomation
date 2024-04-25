package testScenarios;

import org.testng.annotations.Test;

import objects.CreateNewTrip;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class NewTest {
	
	//com.fullAutomation.java.NewTest
	WebDriver driver;
  @Test
  public void createNewTrip() {
	  CreateNewTrip trip=new CreateNewTrip(driver);
	  
		  trip.createTrip("Trip001122");  
	  
	  
  }
	

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://smartlinks-qa.trukr.live/workbench");
	  driver.findElement(By.id("username")).sendKeys("tesco_admin");
      driver.findElement(By.id("inputPassword")).sendKeys("Testing12*");
      driver.findElement(By.cssSelector(".btn-color-primary-large.mb-2.ng-tns-c95-0")).click();
      
	  

  }
  

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
