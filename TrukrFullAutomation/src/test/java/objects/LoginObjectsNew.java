package objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.BrowserBaseTest;

public class LoginObjectsNew extends BrowserBaseTest {
	By userNameField=By.id("username");
	By passwordField=By.id("inputPassword");
	By loginButton=By.xpath("//button[.//span[text()='Login']]");
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public void sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton(String userName,String userPassword) {
		wait.until(ExpectedConditions.elementToBeClickable(userNameField)).clear();
		wait.until(ExpectedConditions.elementToBeClickable(passwordField)).clear();
		wait.until(ExpectedConditions.elementToBeClickable(userNameField)).sendKeys(userName);;
		wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(userPassword);;
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}


}
