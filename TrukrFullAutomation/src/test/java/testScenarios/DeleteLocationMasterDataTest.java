package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.LoginPageObjects;
import objects.MasterDataPageLocationObjects;

public class DeleteLocationMasterDataTest extends BaseTest{
	
	@Test
	public void deleteLocationMasterDataTest() {
		MasterDataPageLocationObjects masterDataPageLocationObjects=new MasterDataPageLocationObjects();
			masterDataPageLocationObjects.navigateToAddLocationPopUp();
			masterDataPageLocationObjects.sendDataToInputSearch("MLP10");
			masterDataPageLocationObjects.checkTheDataIsValidOrNot("MLP10");
			masterDataPageLocationObjects.clickOnCheckBox("MLP10");
			masterDataPageLocationObjects.clickDeleteButton();
			masterDataPageLocationObjects.acceptAlert();
			masterDataPageLocationObjects.clearInputSearch();	
	}

}
