package com.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	By Username=By.id("username");
	By Password=By.id("inputPassword");
	By LoginButton=By.xpath("//button[contains(.,'Login')][1]");
	By ForgotPassword=By.xpath("//button[contains(.,'Forgot Password?')]");
	By LoginButtonWithOneLogin=By.xpath("//button[contains(.,'Login with OneLogin')]");
	By NextButton=By.xpath("/html/body/app-root/forgot-password/div/div/div/div/button");
	By ForgotUsernameField=By.xpath("//*[@id=\"username\"]");
	By OtpInput=By.xpath("/html/body/app-root/forgot-password/div/div/div/div/div[1]/input[2]");
	By NewPasswordInput=By.xpath("/html/body/app-root/forgot-password/div/div/div/div/div[1]/input[3]");
	By ConfirmPasswordInput=By.xpath("/html/body/app-root/forgot-password/div/div/div/div/div[1]/input[4]");
	By ResePasswordButton=By.xpath("//button[contains(.,'Reset Password')]");
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void sendUsername(String userName) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Username)).clear();
		driver.findElement(Username).sendKeys(userName);
	}
	public void sendPassword(String password) {
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(password);
	}
	public void enterLoginButton() {
		driver.findElement(LoginButton).click();
	}
	public void clickForgotPassword() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ForgotPassword)).click();
	}
	public void nextButtonClick() {
		driver.findElement(NextButton).click();
	}
	public void sendOtp(String Otp) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(OtpInput)).sendKeys(Otp);
	}
	public void sendNewPassword(String newPasword) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(NewPasswordInput)).sendKeys(newPasword);
	}
	public void sendConfirmPassword(String confPassword) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmPasswordInput)).sendKeys(confPassword);
	}
	public void clickResetButton() {
		driver.findElement(ResePasswordButton).click();
	}
}
