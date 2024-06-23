package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.LoginPageObjects;
import objects.MasterDataPageObjects;

public class AddLocationMasterDataTest extends BaseTest{
	@Test
	public void addLocationTest() {
        LoginPageObjects loginPageObjects = new LoginPageObjects();
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");	
		MasterDataPageObjects masterDataPageObjects=new MasterDataPageObjects();
		masterDataPageObjects.addNewLocation();
			
	}

}
