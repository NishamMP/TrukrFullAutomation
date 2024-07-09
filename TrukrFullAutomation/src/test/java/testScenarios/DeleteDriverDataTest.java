package testScenarios;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.BaseTest;

import datadriven.XLUtility;
import objects.MasterDataPageDriverObjects;

public class DeleteDriverDataTest extends BaseTest{
	
	@BeforeTest
	public void setup() {
		MasterDataPageDriverObjects masterDataPageDriverObjects=new MasterDataPageDriverObjects();
		if(!driver.getCurrentUrl().equals("https://smartlinks-qa.trukr.live/master")) {
	        masterDataPageDriverObjects.clickOnMasterDataPage();
	        
		}
	}
	
	@Test(dataProvider="DriverData")
	public void deleteDriverDataTest(			
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
			String exp) {
		MasterDataPageDriverObjects masterDataPageDriverObjects=new MasterDataPageDriverObjects();
		if(!driver.getCurrentUrl().equals("https://smartlinks-qa.trukr.live/master")) {
	        masterDataPageDriverObjects.clickOnMasterDataPage();
	        
		}
			masterDataPageDriverObjects.clickOnDriverMenuPath();
	        masterDataPageDriverObjects.sendPhoneNoSearchField(phoneNo);
	        masterDataPageDriverObjects.checkTheDataIsValidOrNot(phoneNo);
	        masterDataPageDriverObjects.clickOnCheckBox(phoneNo);
	        masterDataPageDriverObjects.clickDeleteButton();
	        masterDataPageDriverObjects.acceptAlert();
	        masterDataPageDriverObjects.clearInputSearch();
	        masterDataPageDriverObjects.clickClearButton();
	}
	@DataProvider(name="DriverData")
	public String [][] getData() throws IOException
	{
		String path=".\\datafiles\\deleteDriverData.xlsx";
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
	@AfterTest
	public void tearDown() {
		String path=".\\datafiles\\deleteDriverData.xlsx";
		XLUtility xlUtility=new XLUtility(path);
		xlUtility.deleteFile();
	}

}
