package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver){
		this.driver=driver;
	}
	By userNameField=By.id("username");
	By passwordField=By.id("inputPassword");
	By LoginButton=By.xpath("/html/body/app-root/app-login/div/div/div/div[1]/form/div/button[1]");
	public void sendDataTousernameFieldAndPasswordFieldAndEnterLoginButton(String userName,String userPassword) {
		
		driver.findElement(userNameField).sendKeys(userName);
		driver.findElement(passwordField).sendKeys(userPassword);
		driver.findElement(LoginButton).click();
	}
	
}
