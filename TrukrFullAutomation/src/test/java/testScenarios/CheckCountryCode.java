package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class CheckCountryCode extends BaseTest{
	
	@Test
	public void checkCountryCode(){
        LoginPageObjects loginPageObjects = new LoginPageObjects();
//        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("Nisham_123", "Nisham12*");
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
        AdminObjects adminObjects=new AdminObjects();
		adminObjects.checkCounryCodeChangingOrNot();
	}

}
