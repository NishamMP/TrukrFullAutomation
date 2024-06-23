package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.BrowserBaseTest;

import objects.LoginObjectsNew;

public class CheckUserOnHoldUsingLoginTest extends BrowserBaseTest{
	
	@Test(dependsOnMethods = "testScenarios.PutUserOnHoldTest.putUserOnHoldTest")
    public void checkUserOnHoldUsingLoginTest() throws InterruptedException {
        String expectedText = "Something went wrong. Please contact your administrator";
        LoginObjectsNew loginPageObjectsNew = new LoginObjectsNew();
        Thread.sleep(5000);
        loginPageObjectsNew.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("Nisham7356", "Pass@123");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.className("error-message"));
        String extractedText = element.getText();
        Assert.assertEquals(extractedText, expectedText);
    }

}
