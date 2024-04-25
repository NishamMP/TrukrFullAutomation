package testScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objects.LoginPageObjects;
import objects.TripCreatePopup;
import objects.TripPageObjects;

public class LoginTest {
	
	static WebDriver driver;
	static ExtentReports extent=new ExtentReports();
	static ExtentReports report;
	static ExtentTest loginTest;
	static ExtentTest createTripTest;
	static ExtentTest allocateTruckTest;
	
	
	@BeforeTest
	public  void setup() {
		driver=new ChromeDriver();
		driver.get("https://smartlinks-qa.trukr.live/workbench");
		driver.manage().window().maximize();	
		ExtentSparkReporter spark=new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
	}
	@Test
	public void loginAndEnterToHomePage() throws InterruptedException {
		LoginPageObjects loginPageObjects=new LoginPageObjects(driver);
		loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin","Testing12*");
		TripPageObjects tripPageObjects=new TripPageObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginTest=extent.createTest("Login Test","Confirm That The use is Succesfully Logged into Trukr HomePage");
		
		
		try {
			tripPageObjects.confirmTitlePage();
			loginTest.log(Status.PASS, "This is a Loggin event of trukr and it is got Passed");
		}catch(Exception e) {
			loginTest.log(Status.FAIL, "This is a Loggin event of trukr and it is got Failed");
		}
		
		
		
	}
	@Test(dependsOnMethods="loginAndEnterToHomePage")
	public void createTrip() {
		
		TripCreatePopup tripCreatePopup=new TripCreatePopup(driver);
		createTripTest=extent.createTest("Create Trip","The test is for creating a Trip");
		try {
			tripCreatePopup.addNewTrip();
			createTripTest.log(Status.PASS,"This is a Test For  Creating A Trip and its got PASSED");
		}catch(Exception e) {
			createTripTest.log(Status.FAIL,"This is a Test For  Creating A Trip and its got FAILED");
		}
	}
	@Test(dependsOnMethods="createTrip")
	public void allocateTruck() throws InterruptedException {
		TripCreatePopup tripCreatePopup=new TripCreatePopup(driver);
		allocateTruckTest=extent.createTest("Allocate Truck","The test is for allocate a truck for a Trip");
		try {
			tripCreatePopup.allocateTruck();
			allocateTruckTest.log(Status.PASS,"This is a Test For  allocating a truck for a created trip it is got passed");
			
		}catch(Exception e) {
			allocateTruckTest.log(Status.FAIL,"This is a Test For  allocating a truck for a created trip it is got FAILED");
		}
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
	}

	@AfterTest	
	public void cleanUp() {
		extent.flush();
	}
}
