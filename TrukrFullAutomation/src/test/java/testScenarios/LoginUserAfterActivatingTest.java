package testScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import com.framework.BrowserBaseTest;

import objects.LoginObjectsNew;
import objects.TripPageObjects;

public class LoginUserAfterActivatingTest extends BrowserBaseTest{
	
	@Test
	public void loginUserAfterActivating() throws InterruptedException{
        LoginObjectsNew loginPageObjectsNew = new LoginObjectsNew();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPageObjectsNew.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("Nisham7356", "Testing@123");
        if(driver!=null) {
            TripPageObjects tripPageObjects = new TripPageObjects(driver);
            Thread.sleep(5000);
            tripPageObjects.confirmTitlePage();
            Thread.sleep(2000);
            tripPageObjects.logoutUser();
            System.out.println("NewUserLoginTest");
		
	}

}}
