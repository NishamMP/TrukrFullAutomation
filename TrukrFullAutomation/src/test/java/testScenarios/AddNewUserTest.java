package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class AddNewUserTest extends BaseTest {
	
	

	@Test
	public void addNewUserTest() throws InterruptedException {	
		AdminObjects adminObjects=new AdminObjects();
//		adminObjects.addNewUser();
//		System.out.println("Add NewUserTest");
		 LoginPageObjects loginPageObjects = new LoginPageObjects();
	     loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
		adminObjects.navigateToAddUserPage();
		adminObjects.clickAddUserButton();
		adminObjects.sendLoginId();
		adminObjects.sendUserName();
		adminObjects.sendEmail();
		adminObjects.sendPassword();
		adminObjects.selectUserType();
		adminObjects.selectCountry();
		adminObjects.selectTimeZone();
		adminObjects.sendPhoneNumber();
		adminObjects.selectLanguage();
		adminObjects.selectPasswordPolicy();
	}
	

}
