package testScenarios;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
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
import objects.MasterDataPageLocationObjects;

public class AddLocationMasterDataTest extends BaseTest{
	
	@BeforeTest
	public void loginSetup(){
        LoginPageObjects loginPageObjects = new LoginPageObjects();
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
		MasterDataPageLocationObjects masterDataPageObjects=new MasterDataPageLocationObjects();
		masterDataPageObjects.navigateToAddLocationPopUp();
	}
	@Test(dataProvider="LocationData")
	public void addLocationTest(
	String LocatioID,
	String LocationName	,
	String Location_Type,	 
	String Owner_Code,
	String LogisticsGroup,
	String Location_Owner_Type,	 
	String Time_Zone,
	String Loading_Time,
	String UnloadingTime,	
	String Arrival_Time,	
	String Ship_Time,
	String Language,
	String Reference_Value_A,	
	String Building,	
	String Street,	
	String City,
	String State,
	String Country,
	String Postal_Code,
	String Locality,
	String Landmark,
	String Latitude,
	String Longitude,
	String Name,
	String Email,
	String PhoneNo,
	String exp) {
		String expectedText="Successful";
		String lat_and_longError="Invalid latitude or longitude";
		String mandatoryError="Unsuccessful";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		MasterDataPageLocationObjects masterDataPageObjects=new MasterDataPageLocationObjects();
		masterDataPageObjects.clickAddButton();
		masterDataPageObjects.locationIdSend(LocatioID);
		masterDataPageObjects.locationNameSend(LocationName);
		masterDataPageObjects.locationTypeSend(Location_Type);
		masterDataPageObjects.locationOwnerCodeSend(Owner_Code);
		masterDataPageObjects.logisticsGroupSelect(LogisticsGroup);
		masterDataPageObjects.locationOwnerTypeSend(Location_Owner_Type);
		masterDataPageObjects.locationTimeZoneSend(Time_Zone);
		masterDataPageObjects.loadingTimeSend(Loading_Time);
		masterDataPageObjects.unLoadingTimeSend(UnloadingTime);
		masterDataPageObjects.arrivalTimeSend(Arrival_Time);
		masterDataPageObjects.shipTimeSend(Ship_Time);
		masterDataPageObjects.languageSelectPath(Language);
		masterDataPageObjects.clickReferencePortionPath();
		masterDataPageObjects.sendReferenceValueInput(Reference_Value_A);
		masterDataPageObjects.clickAddresePath();
		masterDataPageObjects.clickAddressTextField();
		masterDataPageObjects.buldingNameSend(Building);
		masterDataPageObjects.streetNameSend(Street);
		masterDataPageObjects.cityNameSend(City);
		masterDataPageObjects.stateNameSend(State);
		masterDataPageObjects.countryNameSend(Country);
		masterDataPageObjects.postalCodeSend(Postal_Code);
		masterDataPageObjects.localitySend(Locality);
		masterDataPageObjects.landmarkSend(Landmark);
		masterDataPageObjects.latitudeSend(Latitude);
		masterDataPageObjects.longitudeSend(Longitude);
		masterDataPageObjects.clickDoneButton();
		try {
			masterDataPageObjects.clickContactButton();
		}catch(Exception e) {
//			WebElement toast=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div/div")));
//			wait.until(ExpectedConditions.invisibilityOf(toast));
			masterDataPageObjects.cancelButtonAddress();
			masterDataPageObjects.clickContactButton();
		}
		masterDataPageObjects.sendName(Name);
		masterDataPageObjects.sendEmail(Email);
		masterDataPageObjects.sendPhone(PhoneNo);
		masterDataPageObjects.clickSubmitButton();
		WebElement toast=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div/div")));
		
		if(exp.equals("Valid"))
		{
			String TextGot=toast.getText();
			if(expectedText.equals(TextGot))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}else if(exp.equals("Invalid")) {
			System.out.println("Something wentwrong");
			String TextGot=toast.getText();
			if(mandatoryError.equals(TextGot))
			{	wait.until(ExpectedConditions.invisibilityOf(toast));
				masterDataPageObjects.cancelButtonPopUp();
				Assert.assertTrue(true);
			}
			else if(lat_and_longError.equals(TextGot)) {
				wait.until(ExpectedConditions.invisibilityOf(toast));
				masterDataPageObjects.cancelButtonPopUp();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}

		
	}
	@DataProvider(name="LocationData")
	public String [][] getData() throws IOException
	{

		String path=".\\datafiles\\addLocationData.xlsx";
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

