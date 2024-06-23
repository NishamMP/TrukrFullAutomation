package testScenarios;

import org.testng.annotations.Test;

import objects.AdminObjects;

public class DeleteGroupTest {
	@Test
	public void deleteGroupTest() throws InterruptedException {
		AdminObjects adminObjects=new AdminObjects();
		adminObjects.deleteGroup();
		System.out.println("Delete GroupTest");
	}

}
