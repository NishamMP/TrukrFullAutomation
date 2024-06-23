package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class PutUserOnHoldTest extends BaseTest{
		
		@Test
		public void putUserOnHoldTest() throws InterruptedException {	
			AdminObjects adminObjects=new AdminObjects();
			adminObjects.putUserOnHold();
			
		}
}
