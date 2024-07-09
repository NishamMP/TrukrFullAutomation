package testScenarios;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.framework.BaseTest;

import datadriven.XLUtility;
import objects.MasterDataPageDriverObjects;

public class DriverHoldTest extends BaseTest {

	@Test(dataProvider = "DriverData")
	public void driverHoldTest(String profileImage, String driverName, String password, String emailAddress,
			String country, String phoneNo, String dlsNo, String language, String logisticsGroup, String dob,
			String exp) {
		MasterDataPageDriverObjects masterDataPageDriverObjects = new MasterDataPageDriverObjects();
		// try {

		masterDataPageDriverObjects.clickOnMasterDataPage();
		masterDataPageDriverObjects.clickOnDriverMenuPath();
		masterDataPageDriverObjects.sendPhoneNoSearchField(phoneNo);
		masterDataPageDriverObjects.checkTheDataIsValidOrNot(phoneNo);
		masterDataPageDriverObjects.clickOnCheckBox(phoneNo);
		masterDataPageDriverObjects.clickStatusButton();
		
		  masterDataPageDriverObjects.clickHold();
		  masterDataPageDriverObjects.acceptAlert();
		 

	}

	@DataProvider(name = "DriverData")
	public String[][] getData() throws IOException {
		String path = ".\\datafiles\\deleteDriverData.xlsx";
		XLUtility xlutil = new XLUtility(path);

		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);

		String locationData[][] = new String[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) // 1
		{
			for (int j = 0; j < totalcols; j++) // 0
			{
				locationData[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
			}

		}

		return locationData;
	}

}
