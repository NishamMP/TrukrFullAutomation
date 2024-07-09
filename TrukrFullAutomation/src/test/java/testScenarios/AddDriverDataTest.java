package testScenarios;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.BaseTest;

import datadriven.XLUtility;
import objects.LoginPageObjects;
import objects.MasterDataPageDriverObjects;

public class AddDriverDataTest extends BaseTest{
	int rowCount=1;
	@BeforeTest
	public void setUpForeTest() throws IOException {
        LoginPageObjects loginPageObjects = new LoginPageObjects();

        MasterDataPageDriverObjects masterDataPageDriverObjects=new MasterDataPageDriverObjects();
		if(!driver.getCurrentUrl().equals("https://smartlinks-qa.trukr.live/master")) {
	        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
	        masterDataPageDriverObjects.clickOnMasterDataPage();
	        masterDataPageDriverObjects.clickOnDriverMenuPath();
	        String path=".\\datafiles\\deleteDriverData.xlsx";
			XLUtility xlUtility=new XLUtility(path);
			
			xlUtility.setCellData("Sheet1", 0, 0, "ProfilePath");
			xlUtility.setCellData("Sheet1", 0, 1, "Driver Name");
			xlUtility.setCellData("Sheet1", 0, 2, "Password");
			xlUtility.setCellData("Sheet1", 0, 3, "Email Address");
			xlUtility.setCellData("Sheet1", 0, 4, "Country");
			xlUtility.setCellData("Sheet1", 0, 5, "Phone No");
			xlUtility.setCellData("Sheet1", 0, 6, "DLS No");
			xlUtility.setCellData("Sheet1", 0, 7, "Language");
			xlUtility.setCellData("Sheet1", 0, 8, "Logistics Group");
			xlUtility.setCellData("Sheet1", 0, 9, "DoB");
			xlUtility.setCellData("Sheet1", 0, 10, "Expected");
	        
		}	
	}
	@Test(dataProvider="DriverData")
	public void addDriverTest(
			String profileImage,
			String driverName,
			String password,
			String emailAddress,
			String country,
			String phoneNo,
			String dlsNo,
			String language,
			String logisticsGroup,
			String dob,
			String exp
			) throws IOException {
        MasterDataPageDriverObjects masterDataPageDriverObjects=new MasterDataPageDriverObjects();
            masterDataPageDriverObjects.clickOnaddNewDriverButton();
            masterDataPageDriverObjects.sendDriverName(driverName);
            masterDataPageDriverObjects.sendProfileImage(profileImage);
            masterDataPageDriverObjects.sendPassword(password);
            masterDataPageDriverObjects.sendEmailAddress(emailAddress);
            masterDataPageDriverObjects.selectCountry(country);
            masterDataPageDriverObjects.sendPhoneNo(phoneNo);
            masterDataPageDriverObjects.sendLicenseNo(dlsNo);
            masterDataPageDriverObjects.selectLanguage(language);
            masterDataPageDriverObjects.selectLogisticsGroup(logisticsGroup);
            masterDataPageDriverObjects.selectDateOfBirth(dob);
            masterDataPageDriverObjects.clickSubmitButton();

    		String path=".\\datafiles\\deleteDriverData.xlsx";
    		XLUtility xlUtility=new XLUtility(path);
		String expectedText="Successful";
		String mandatoryError="Unsuccessful";
		String phoneAlreadyExistError="Phone number already exists";
		String emailExistError="Email already exists";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		if(exp.equals("Valid"))
		{
			WebElement toast=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div/div")));
			String TextGot=toast.getText();
			if(expectedText.equals(TextGot))
			{
				xlUtility.setCellData("Sheet1", rowCount, 0, profileImage);
				xlUtility.setCellData("Sheet1", rowCount, 1, driverName);
				xlUtility.setCellData("Sheet1", rowCount, 2, password);
				xlUtility.setCellData("Sheet1", rowCount, 3, emailAddress);
				xlUtility.setCellData("Sheet1", rowCount, 4, country);
				xlUtility.setCellData("Sheet1", rowCount, 5, phoneNo);
				xlUtility.setCellData("Sheet1", rowCount, 6, dlsNo);
				xlUtility.setCellData("Sheet1", rowCount, 7, language);
				xlUtility.setCellData("Sheet1", rowCount, 8, logisticsGroup);
				xlUtility.setCellData("Sheet1", rowCount, 9, dob);
				xlUtility.setCellData("Sheet1", rowCount, 10, exp);
				rowCount++;
		   		String pathAddData=".\\datafiles\\deleteDriverData.xlsx";
	    		XLUtility xlUtilityAddData=new XLUtility(pathAddData);
	    		xlUtilityAddData.setCellData("Sheet2", 1, 0, emailAddress);
	    		xlUtilityAddData.setCellData("Sheet2", 1, 1, password);
				
				Assert.assertTrue(true);
			}
			else
			{
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div/div")));
				masterDataPageDriverObjects.cancelButton();
				Assert.assertTrue(false);
			}
		}else if(exp.equals("Invalid")) {
			WebElement toast=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div/div")));
			System.out.println("Something wentwrong");
			String TextGot=toast.getText();
			System.out.println(TextGot);
			if(mandatoryError.equals(TextGot) || phoneAlreadyExistError.equals(TextGot) || emailExistError.equals(TextGot) )
			{	
			
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div/div")));
				masterDataPageDriverObjects.cancelButton();
				Assert.assertTrue(true);

			}
			else
			{
				xlUtility.setCellData("Sheet1", rowCount, 0, profileImage);
				xlUtility.setCellData("Sheet1", rowCount, 1, driverName);
				xlUtility.setCellData("Sheet1", rowCount, 2, password);
				xlUtility.setCellData("Sheet1", rowCount, 3, emailAddress);
				xlUtility.setCellData("Sheet1", rowCount, 4, country);
				xlUtility.setCellData("Sheet1", rowCount, 5, phoneNo);
				xlUtility.setCellData("Sheet1", rowCount, 6, dlsNo);
				xlUtility.setCellData("Sheet1", rowCount, 7, language);
				xlUtility.setCellData("Sheet1", rowCount, 8, logisticsGroup);
				xlUtility.setCellData("Sheet1", rowCount, 9, dob);
				xlUtility.setCellData("Sheet1", rowCount, 10, exp);
				rowCount++;
				Assert.assertTrue(false);
			}
		}
	}
	@DataProvider(name="DriverData")
	public String [][] getData() throws IOException
	{
		String path=".\\datafiles\\addDriverData.xlsx";
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);	
				
		String locationData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				locationData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
				
		}
		
		return locationData;
	}
	

}
