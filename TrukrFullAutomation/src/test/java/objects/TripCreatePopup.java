package objects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import readData.ReadData;

public class TripCreatePopup {
	WebDriver driver;
	public TripCreatePopup(WebDriver driver) {
		this.driver=driver;
	}
	public String addButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[1]/div[1]/div[1]/div/button";
	public String tripIdFieldPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[2]/input";
	public String logisticsGroupFieldPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div/div";
	public String selectFromGroup1FieldPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]/div/div/div";
	public String selectTruckTypeFieldPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[6]/div/div[2]/app-search-dropdown/div/div/div[1]/div";
	public String selectTruckTypeIndex1FieldPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[6]/div/div[2]/app-search-dropdown/div/div/div[2]/div/div[2]/span";
	public String nextButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/button";
	//Stop Deatails
	public String stop1LocationInputPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div";
	public String stop1LocationInputSearchPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[1]/input";
	public String stop1LocationSelectIndexPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]";
	public String stop2LocationInputPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div";
	public String stop2LocationInputSearchPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[1]/input";
	public String stop2LocationSelectIndexPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]";
	public String stop3LocationInputPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div";
	public String stop3LocationInputSearchPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[1]/input";
	public String stop3LocationSelectIndexPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]/span";
	
	//ExtraStopButton
	public String addExtraStopButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/div[1]";
	//Recompute And Sumbit Buttons
	public String recomputeButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/div[2]/button[2]";
	public String submitButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/div[2]/button[1]";
	public String confirmTripCreationPath="//*[@id=\"data_table\"]/div[1]/div/div[1]/div";
	public String allocateButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[1]/div[1]/div[3]/div/button";
	public String allocatePopUpTruck="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-allocation/div/div[2]/ul/li[2]/a";
	public String truckSearchFieldPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-allocation/div/div[3]/div/input";
	public String truckSelectAvailble="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-allocation/div/div[4]/div[1]/div[2]";
	public String truckAllocateButtonPath="/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-allocation/div/div[5]/button";
	public String tripIdField="//*[@id=\"id\"]/div/div/div[2]/div/div/div/div[2]/span/input";
	public void addNewTrip() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		ReadData readData=new ReadData();
		readData.DataReadTest();
		Thread.sleep(1000);
		String tripId=readData.tripId;
			//add Button
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
			WebElement addButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addButtonPath)));
			addButton.click();
			//TripId
			WebElement tripIdField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(tripIdFieldPath)));
			tripIdField.sendKeys(tripId);
			//logistics group
			WebElement logisticsGroup=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupFieldPath)));
			logisticsGroup.click(); 
			//select1 from the group
			WebElement selectFromGroup1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectFromGroup1FieldPath)));
			selectFromGroup1.click();
			//select truck
			WebElement selectTruckType=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectTruckTypeFieldPath)));
			selectTruckType.click();
			
			//select index 1
			WebElement selectTruckTypeIndex1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectTruckTypeIndex1FieldPath)));
			selectTruckTypeIndex1.click();
			//next button
			WebElement nextButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(nextButtonPath)));
			nextButton.click();
			
			//stop Details Page
			
			//location id 1
			WebElement stop1LocationId=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stop1LocationInputPath)));
			stop1LocationId.click();
			//search locationid
			WebElement stop1LocationInputSearch=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stop1LocationInputSearchPath)));
			stop1LocationInputSearch.sendKeys("WNDC");
			Thread.sleep(2000);
			WebElement stop1LocationSelectIndex=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stop1LocationSelectIndexPath)));
			stop1LocationSelectIndex.click();
			
			//location id 2
			WebElement stop2LocationId=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stop2LocationInputPath)));
			stop2LocationId.click();
			//search locationid
			WebElement stop2LocationInputSearch=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stop2LocationInputSearchPath)));
			stop2LocationInputSearch.sendKeys("1234");
			Thread.sleep(2000);
			WebElement stop2LocationSelectIndex=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stop2LocationSelectIndexPath)));
			stop2LocationSelectIndex.click();
			
			
			//add extra stop button
			WebElement addExtrastopButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addExtraStopButtonPath)));
			addExtrastopButton.click();
			//locatio id 3
			//search locationid 3
			WebElement stop3LocationId=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stop3LocationInputPath)));
			stop3LocationId.click();
			//search locationid
			WebElement stop3LocationInputSearch=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stop3LocationInputSearchPath)));
			stop3LocationInputSearch.sendKeys("WNDC");
			Thread.sleep(2000);
			WebElement stop3LocationSelectIndex=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stop3LocationSelectIndexPath)));
			stop3LocationSelectIndex.click();
			//recompute button
			WebElement recomputeButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(recomputeButtonPath)));
			recomputeButton.click();
			//submit button
			WebElement submitButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButtonPath)));
			submitButton.click();
			
	}
	public void allocateTruck() throws InterruptedException, IOException {
		ReadData readData=new ReadData();
		readData.DataReadTest();
		Thread.sleep(1000);
		String deviceId=readData.deviceId;
		String tripId=readData.tripId;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
		driver.findElement(By.xpath(tripIdField)).sendKeys(tripId);
		Thread.sleep(2000);
		WebElement confirmCreation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirmTripCreationPath)));
		confirmCreation.click();
		WebElement allocateButton=driver.findElement(By.xpath(allocateButtonPath));
		allocateButton.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(allocateButtonPath)));
		Thread.sleep(3000);
		WebElement truckLink=driver.findElement(By.xpath(allocatePopUpTruck));
		truckLink.click();
		Thread.sleep(3000);
		WebElement searchInputBar=driver.findElement(By.xpath(truckSearchFieldPath));
		Thread.sleep(1000);
		searchInputBar.sendKeys(deviceId);
		Thread.sleep(2000);
		WebElement truckSelct=driver.findElement(By.xpath(truckSelectAvailble));
		truckSelct.click();
		WebElement allocateButtonPopUp=driver.findElement(By.xpath(truckAllocateButtonPath));
		allocateButtonPopUp.click();
	}
}	
