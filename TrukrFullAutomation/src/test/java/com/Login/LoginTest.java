
package com.Login;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.TripPage.TripPage;
import com.framework.BaseTest;

import datadriven.XLUtility;


public class LoginTest extends BaseTest{
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user,String pwd,String exp)
	{
		LoginPage loginPage=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		loginPage.sendUsername(user);
		System.out.println(user);
		loginPage.sendPassword(pwd);
		System.out.println(pwd);
		loginPage.enterLoginButton();
		String exp_title="Trips";
		System.out.println(driver.getCurrentUrl());
		TripPage tripPage=new TripPage();
		if(exp.equals("Valid"))
		{
			String act_title=tripPage.locateTripLocate();
			if(exp_title.equals(act_title))
			{
				tripPage.logoutUser();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid"))
		{
			String act_title="Invalid";
			String expectedErrorIvalidIsername="Invalid username or password";
			String expectedErrorBlocked="User login blocked. Please reset your password using Forgot Password";
			if(exp_title.equals(act_title))
			{
				tripPage.logoutUser();					
				Assert.assertTrue(false);
			}
			else
			{
		        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message"))) ;
		        String extractedText = element.getText();
				if(expectedErrorIvalidIsername.equals(extractedText)) {
					Assert.assertTrue(true);
				}else if(expectedErrorBlocked.equals(extractedText)) {
					Assert.assertTrue(true);
				}
				
			}
		}
		
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{

		String path=".\\datafiles\\LoginData.xlsx";
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
				
		}
		
		return loginData;
	}
	
}
