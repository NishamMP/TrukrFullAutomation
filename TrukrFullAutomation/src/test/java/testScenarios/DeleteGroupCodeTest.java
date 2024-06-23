package testScenarios;

import org.testng.annotations.Test;

import objects.AdminObjects;

public class DeleteGroupCodeTest {
	
	@Test
	public void deleteGroupCodeTest() throws InterruptedException {	
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.deleteGroupCode();
		System.out.println("Delete GroupCodeTest");
	}

}
