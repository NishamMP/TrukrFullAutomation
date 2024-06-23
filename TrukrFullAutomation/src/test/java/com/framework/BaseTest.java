package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseTest {
	   public static WebDriver driver;
	   public static ExtentReports extent = new ExtentReports();
	   public static ExtentTest loginTest;
	   public static ExtentTest createTripTest;
	   public static ExtentTest allocateTruckTest;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://smartlinks-qa.trukr.live");
	        driver.manage().window().maximize();
	        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	        extent.attachReporter(spark);
	    }
}
