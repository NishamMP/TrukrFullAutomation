package testScenarios;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Login.LoginPage;
import com.framework.BaseTest;

import datadriven.XLUtility;
import objects.MasterDataPageDriverObjects;

public class ActivateDriverTest extends BaseTest {

    @Test(dataProvider = "DriverData")
    public void driverActiveTest(String profileImage, String driverName, String password, String emailAddress,
                                 String country, String phoneNo, String dlsNo, String language, String logisticsGroup,
                                 String dob, String exp) {
        MasterDataPageDriverObjects masterDataPageDriverObjects = new MasterDataPageDriverObjects();
        if (!driver.getCurrentUrl().equals("https://smartlinks-qa.trukr.live/master")) {
            masterDataPageDriverObjects.clickOnMasterDataPage();
        }
        masterDataPageDriverObjects.clickOnDriverMenuPath();
        masterDataPageDriverObjects.sendPhoneNoSearchField(phoneNo);
        masterDataPageDriverObjects.checkTheDataIsValidOrNot(phoneNo);
        masterDataPageDriverObjects.clickOnCheckBox(phoneNo);
        masterDataPageDriverObjects.clickStatusButton();
        masterDataPageDriverObjects.clickActivate();
        masterDataPageDriverObjects.acceptAlert();
    }

    @DataProvider(name = "DriverData")
    public String[][] getData() throws IOException {
        String path = ".\\datafiles\\deleteDriverData.xlsx";
        XLUtility xlutil = new XLUtility(path);

        int totalrows = xlutil.getRowCount("Sheet1");
        int totalcols = xlutil.getCellCount("Sheet1", 1);

        String[][] locationData = new String[totalrows][totalcols];

        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                locationData[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
            }
        }

        return locationData;
    }
}
