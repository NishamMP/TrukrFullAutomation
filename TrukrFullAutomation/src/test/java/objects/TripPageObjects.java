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

public class TripPageObjects extends BaseTest{
	WebDriver driver;
	By adminButton=By.xpath("/html/body/app-root/app-home/app-page-header/div/div[2]/div[2]/button");
	By logoutButton=By.xpath("/html/body/app-root/app-home/app-page-header/div/div[2]/div[2]/div/div[4]");
	
	public TripPageObjects(WebDriver driver) {

		this.driver=driver;
	}
	
	//public String addButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/ul/li/div/a/text()";
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public void confirmTitlePage() {
		WebElement addButton=driver.findElement(By.linkText("Trips"));
        String buttonText = addButton.getText();
        String expectedButtonText="Trips";
        Assert.assertEquals(buttonText, expectedButtonText);
        
	}
	public void logoutUser() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(adminButton).click();
		driver.findElement(logoutButton).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	
}
