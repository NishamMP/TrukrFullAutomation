package com.Login;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v124.fetch.Fetch;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.framework.BaseTest;

import freemarker.core.JavaScriptCFormat;

public class ForgetPasswordTest extends BaseTest{
	@Test
	public void forgetPasswordTest() {
		LoginPage loginPage=new LoginPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		loginPage.clickForgotPassword();
		wait.until(urlToBe("https://smartlinks-qa.trukr.live/forgot-password"));
		loginPage.sendUsername("nishumuhammednisham@gmail.com");
		loginPage.nextButtonClick();
        WebElement labelElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/forgot-password/div/div/div/div/div[2]/div/label")));// Adjust locator as per your HTML structure
        String labelText = labelElement.getText();
        System.out.println("Label Text: " + labelText);
     	loginPage.nextButtonClick();
		FetchOTP fetchOTP=new FetchOTP();
		String otp=fetchOTP.getOTP();
		loginPage.sendOtp(otp);
		loginPage.sendNewPassword("Nisham@123");
		loginPage.sendConfirmPassword("Nisham@123");
		loginPage.clickResetButton();
	}
    public static ExpectedCondition<Boolean> urlToBe(String url) {
        return driver -> driver.getCurrentUrl().equals(url);
    }
}
