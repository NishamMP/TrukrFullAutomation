package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.LoginPageObjects;
import objects.MasterDataPageLocationObjects;

public class LocationMasterDataModifyTest extends BaseTest{
	@Test
	public void locationDriverDataModifyTest() {
        LoginPageObjects loginPageObjects = new LoginPageObjects();
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
		MasterDataPageLocationObjects masterDataPageLocationObjects=new MasterDataPageLocationObjects();
		masterDataPageLocationObjects.navigateToAddLocationPopUp();
			masterDataPageLocationObjects.sendDataToInputSearch("MLP10");
	        masterDataPageLocationObjects.checkTheDataIsValidOrNot("MLP10");
			masterDataPageLocationObjects.clickOnCheckBox("MLP10");
			masterDataPageLocationObjects.clickModifyButton();
			masterDataPageLocationObjects.locationTypeSend("TestExpress");
			masterDataPageLocationObjects.clickSubmitButton();
	}

}
