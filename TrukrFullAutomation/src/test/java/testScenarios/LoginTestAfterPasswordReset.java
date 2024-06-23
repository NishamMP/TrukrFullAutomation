package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
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
        WebElement element = driver.findElement(By.className("error-message"));
        String extractedText = element.getText();
        Assert.assertEquals(extractedText, expectedText);
    }
}
