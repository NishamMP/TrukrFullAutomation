package testScenarios;

import org.testng.annotations.Test;
import com.framework.BaseTest;
import objects.AdminObjects;

public class UserPasswordReset extends BaseTest{

	@Test
	public void resetUserPassewordTest() throws InterruptedException {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.resetPassword();
		Thread.sleep(5000);
		System.out.println("User Password Reset");
	}

}
