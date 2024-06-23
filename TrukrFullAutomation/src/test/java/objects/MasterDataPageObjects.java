package objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.BaseTest;

public class MasterDataPageObjects extends BaseTest{
	public String msaterDataXpath="/html/body/app-root/app-home/app-sidebar/nav[1]/div/div[2]";
	public String locationMenuPath="/html/body/app-root/app-home/app-sidebar/nav[2]/div/div[1]";
	
	//Location Buttons
	public String locationAddButtonPath="//button[contains(., 'Add')]";
	
	//inputFields
	public String locationIdInputPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[1]/div/input";
	public String locationNamePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/div/input";
	public String locationTypePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[3]/div/input";
	public String locationOwnerCodePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[4]/div/input";
	public String locationOwnerTypePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[6]/div/input";
	//Common
	String overlayPath = "//div[contains(@class, 'loader__overlay')]";
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public void addNewLocation() {
		 	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
		 	WebElement locationsPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationMenuPath)));
	        locationsPage.click();
	        WebElement addUser=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationAddButtonPath)));
	        addUser.click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationIdInputPath))).sendKeys("98765");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationNamePath))).sendKeys("Malappuram");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationTypePath))).sendKeys("Express");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerCodePath))).sendKeys("TESCO");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerTypePath))).sendKeys("TESCO");
	        
	}
}
