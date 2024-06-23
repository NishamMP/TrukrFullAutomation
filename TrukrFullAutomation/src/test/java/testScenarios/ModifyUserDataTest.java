package testScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class ModifyUserDataTest extends BaseTest{
	
	
	@Test
	public void modifyUserDataTest() throws InterruptedException {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.modifyUserData();
		Thread.sleep(5000);
		System.out.println("UseData NAme modified From Nisham to Nisham123");
	}

}
