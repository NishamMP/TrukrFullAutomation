package testScenarios;

import org.testng.annotations.Test;

import objects.AdminObjects;

public class AddGroupTest {
	@Test
	public void addGroupTest() throws InterruptedException {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.addGroup();
		System.out.println("Add GroupTest");
	}

}
