package testScenarios;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.BaseTest;

import objects.AdminObjects;
import objects.LoginPageObjects;

public class AdminPageTest extends BaseTest {	
	@Test
	public void addGroupCodeTest() throws Exception {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.addGroupCode();
		
	}


	
}
