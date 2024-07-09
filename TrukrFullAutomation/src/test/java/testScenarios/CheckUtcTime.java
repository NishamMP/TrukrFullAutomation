package testScenarios;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class CheckUtcTime extends BaseTest {
	@Test
	public void checkUtcTime(){
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.checkUtcTimeChangingOrNot();
	}

}
