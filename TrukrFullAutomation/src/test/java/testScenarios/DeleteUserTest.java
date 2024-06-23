package testScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class DeleteUserTest extends BaseTest{
	@Test
	public void deleteUserTest() throws InterruptedException {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.deleteUser();
	}

}
