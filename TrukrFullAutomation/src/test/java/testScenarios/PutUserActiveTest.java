package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;

import objects.LoginPageObjects;

public class PutUserActiveTest extends BaseTest{
	
	@Test
	public void putUserActiveTest() throws InterruptedException {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.putUserActivate();
		
	}

}
