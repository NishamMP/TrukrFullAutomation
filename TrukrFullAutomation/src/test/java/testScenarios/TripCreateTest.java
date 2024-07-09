package testScenarios;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.framework.BaseTest;

import objects.LoginPageObjects;
import objects.TripCreatePopup;

public class TripCreateTest extends BaseTest{
	@Test
	public void createTrip() throws Exception {
		LoginPageObjects logPageObjects=new LoginPageObjects();
		logPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
		Thread.sleep(3000);
        TripCreatePopup tripCreatePopup = new TripCreatePopup(driver);
        createTripTest = extent.createTest("Create Trip", "The test is for creating a Trip");
        try {
        	
            tripCreatePopup.addNewTrip();
            createTripTest.log(Status.PASS, "This is a Test For Creating A Trip and its got PASSED");
        } catch (Exception e) {
            createTripTest.log(Status.FAIL, "This is a Test For Creating A Trip and its got FAILED");
            throw e;
        }
        
    }
}
