package testScenarios;

import org.testng.annotations.BeforeTest;

import com.framework.BaseTest;

import objects.LoginPageObjects;

public class SetUp extends BaseTest{
	@BeforeTest
	public void loginNow() {
        LoginPageObjects loginPageObjects = new LoginPageObjects();
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
	}

}
