package objects;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.framework.BaseTest;
import com.framework.BrowserBaseTest;

public class TripPageObjects extends BrowserBaseTest{
	WebDriver driver;
	By adminButton=By.xpath("/html/body/app-root/app-home/app-page-header/div/div[2]/div[2]/button");
	By logoutButton=By.xpath("/html/body/app-root/app-home/app-page-header/div/div[2]/div[2]/div/div[4]");
	
	public TripPageObjects(WebDriver driver) {

		this.driver=driver;
	}
	public void confirmTitlePage() {
	    System.out.println("Driver is: " + driver);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Trips")));
	    String buttonText = addButton.getText();
	    String expectedButtonText = "Trips";
	    Assert.assertEquals(buttonText, expectedButtonText);
	}


	public void logoutUser(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(adminButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	
}
