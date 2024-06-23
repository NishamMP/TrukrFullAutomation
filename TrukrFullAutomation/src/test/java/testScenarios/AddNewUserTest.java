package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class AddNewUserTest extends BaseTest {
	
	

	@Test
	public void addNewUserTest() throws InterruptedException {
        LoginPageObjects loginPageObjects = new LoginPageObjects();
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");	
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.addNewUser();
		System.out.println("Add NewUserTest");
		
	}
	

}
