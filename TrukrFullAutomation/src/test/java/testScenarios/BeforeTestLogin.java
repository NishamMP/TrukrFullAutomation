package testScenarios;

import org.testng.annotations.BeforeTest;

import com.framework.BaseTest;

import objects.LoginPageObjects;

public class BeforeTestLogin extends BaseTest {
	@BeforeTest
	public void loginnow() {
        LoginPageObjects loginPageObjects = new LoginPageObjects();
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
	}

}
