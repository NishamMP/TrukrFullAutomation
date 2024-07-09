package com.TripPage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.BaseTest;
public class TripPage extends BaseTest{
	
	By TripLocate=By.xpath("//a[text()]");
	By adminButton=By.xpath("/html/body/app-root/app-home/app-page-header/div/div[2]/div[2]/button");
	By logoutButton=By.xpath("//div[@class=\"drop-items-sub-menu\"]");	
	public String locateTripLocate() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement tripElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Trips")));;
		String text=tripElement.getText();
		return text;
	}
	public void logoutUser(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(adminButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
}
