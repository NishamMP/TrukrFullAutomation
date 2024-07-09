package testScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.BrowserBaseTest;

import objects.LoginObjectsNew;

public class LoginTestAfterPasswordReset extends BrowserBaseTest{
	@Test
    public void loginTestAfterPasswordReset() throws InterruptedException {
        String expectedText = "Invalid username or password";
        LoginObjectsNew loginPageObjectsNew = new LoginObjectsNew();
        Thread.sleep(5000);
        loginPageObjectsNew.sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton("Nisham7356", "Pass@123");
        Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message"))) ;
        String extractedText = element.getText();
        Assert.assertEquals(extractedText, expectedText);
    }
}
