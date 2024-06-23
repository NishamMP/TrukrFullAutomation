package testScenarios;

import org.testng.annotations.Test;

import objects.AdminObjects;

public class AddGroupCodeTest {

	@Test
	public void addGroupCodeTest() throws Exception {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.addGroupCode();
		
		System.out.println("Add GroupCodeTest");
		
	}


}
