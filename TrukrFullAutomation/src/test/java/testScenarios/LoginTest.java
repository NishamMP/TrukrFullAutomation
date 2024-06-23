package testScenarios;

import java.time.Duration;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.framework.BaseTest;
import objects.LoginPageObjects;
import objects.TripPageObjects;

public class LoginTest extends BaseTest{
    @Test
    public void loginAndEnterToHomePage() throws InterruptedException {
        LoginPageObjects loginPageObjects = new LoginPageObjects();
        loginPageObjects.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("tesco_admin", "Testing12*");
        TripPageObjects tripPageObjects = new TripPageObjects(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginTest = extent.createTest("Login Test", "Confirm That The user is Successfully Logged into Trukr HomePage");
        try {
            tripPageObjects.confirmTitlePage();
            loginTest.log(Status.PASS, "This is a Login event of trukr and it is got Passed");
            tripPageObjects.logoutUser();
        } catch (Exception e) {
            loginTest.log(Status.FAIL, "This is a Login event of trukr and it is got Failed");
            throw e; // Explicitly throw the exception to mark the test as failed
        }
    }
}
