package testScenarios;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.framework.BaseTest;

import objects.LoginPageObjects;
import objects.TripCreatePopup;

public class AllocateTruck extends BaseTest {
	@Test
    public void allocateTruck() throws Exception {
        TripCreatePopup tripCreatePopup = new TripCreatePopup(driver);
        allocateTruckTest = extent.createTest("Allocate Truck", "The test is for allocate a truck for a Trip");
		LoginPageObjects logPageObjects=new LoginPageObjects();
		logPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
		Thread.sleep(5000);
        try {
            tripCreatePopup.allocateTruck();
            allocateTruckTest.log(Status.PASS, "This is a Test For allocating a truck for a created trip it is got passed");
        } catch (Exception e) {
            allocateTruckTest.log(Status.FAIL, "This is a Test For allocating a truck for a created trip it is got FAILED");
            throw e; // Explicitly throw the exception to mark the test as failed
        }
        
        try {
            System.out.println("Waiting for 5 minutes...");
            Thread.sleep(360000); // 300000 milliseconds = 6 minutes
        } catch (InterruptedException e) {								
            e.printStackTrace();
        }
        driver.navigate().refresh();
    }
    
}
