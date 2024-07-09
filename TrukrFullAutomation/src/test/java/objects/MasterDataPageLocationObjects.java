package objects;

import java.time.Duration;
import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Latitude;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.BaseTest;

public class MasterDataPageLocationObjects extends BaseTest{
	public String masterDataXpath="/html/body/app-root/app-home/app-sidebar/nav[1]/div/div[2]";
	public String locationMenuPath="/html/body/app-root/app-home/app-sidebar/nav[2]/div/div[1]";
	
	//Location Buttons
	public String locationAddButtonPath="//button[contains(., 'Add')]";
	public String locationDeleteButton="//button[contains(., 'Delete')]";
	public String locationModifyButton="//button[contains(., 'Modify')]";
	//Common
	public String idInputField="//*[@id=\"locationId\"]/div/div/div[2]/div/div/div[2]/span/input";
	public String checkBox="//*[@id=\"data_table\"]/div[1]/div/div[1]/div";
	
	
	//Location Details
	public String locationIdInputPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[1]/div/input";
	public String locationNamePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/div/input";
	public String locationTypePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[3]/div/input";
	public String locationOwnerCodePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[4]/div/input";
	public String logisticsGroupSelectPopUpPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[5]/div/div/app-search-dropdown/div/div/div[1]";
	public String locationOwnerTypePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[6]/div/input";
	public String loadingTimePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[8]/div/input";
	public String unloadingTimePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[9]/div/input";
	public String arrivalTimePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[10]/div/input";
	public String shipTimePath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[10]/div/input";
	
	
	//RefrencePortion
	public String referencePortionPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[2]/div";
	public String referenceValueInput="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/input";
	//Addressportion
	public String addressAreaPortion="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[3]/div";
	public String addressTextArea="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[3]/div[2]/div/div/div/div/textarea";
	public String buildingInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[1]/div/input";
	public String streetInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[2]/div/input";
	public String cityInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[3]/div/input";
	public String stateInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[4]/div/input";
	public String countryInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[5]/div/input";
	public String postalCodeInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[6]/div/input";
	public String localityInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[7]/div/input";
	public String landmarkInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[8]/div/input";
	public String latitudeInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[9]/div/input";
	public String logitudeInputFieldPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[10]/div/input";
	public String doneButtonPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[11]/button[2]";
	public String cancelButton="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[3]/div/div[1]/div[3]/div[2]/div/div/div/div/div/div[11]/button[1]";
	public String contactAreaPortion="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[4]/div";
	public String contactNameInput="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[1]/div/input";
	public String contactEmailInput="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[2]/div/input";
	public String contactNumberInput="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[4]/div[2]/div/div/div[3]/div/div/input[2]";
	public String submitButoon="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[2]/button";
	public String cancelButtonPopUp="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[1]/img[2]";
	//Common
	String overlayPath = "//div[contains(@class, 'loader__overlay')]";
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public void navigateToAddLocationPopUp() {
	 	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
	 	WebElement masterDataPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(masterDataXpath)));
        masterDataPage.click();

	}
	public void clickAddButton() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement addUser=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationAddButtonPath)));
        addUser.click();
	}
//	public void addNewLocation() {
//		 	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
//		 	WebElement masterDataPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(masterDataXpath)));
//	        masterDataPage.click();
//	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
//	        WebElement addUser=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationAddButtonPath)));
//	        addUser.click();
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationIdInputPath))).sendKeys("98765");
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationNamePath))).sendKeys("Malappuram");
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationTypePath))).sendKeys("Express");
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerCodePath))).sendKeys("TESCO");
//	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupSelectPopUpPath))).click();
//	    	
//	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupSelectPopUpPath))).click();
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerTypePath))).sendKeys("TESCO");
//            WebElement dropdownElement = driver.findElement(By.cssSelector(".settings-dropdown-select"));
//            Select dropdown = new Select(dropdownElement);
//            dropdown.selectByVisibleText("Asia/Kolkata");
//            WebElement selectedOption = dropdown.getFirstSelectedOption();
//            System.out.println("Selected option: " + selectedOption.getText());
//
//            languageSelectPath();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(referencePortionPath))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(referenceValueInput))).sendKeys("Test");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addressAreaPortion))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addressTextArea))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactAreaPortion))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactName))).sendKeys("Nisham");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactEmail))).sendKeys("Nisham@smartlink.com");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactNumber))).sendKeys("9876543210");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButoon))).click();
//	        
//	}
	public void locationIdSend(String locationId) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationIdInputPath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationIdInputPath))).sendKeys(locationId);
	}
	public void locationNameSend(String locationName) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationNamePath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationNamePath))).sendKeys(locationName);
	}
	public void locationTypeSend(String locationType) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationTypePath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationTypePath))).sendKeys(locationType);
	}
	public void locationOwnerCodeSend(String locationCode) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerCodePath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerCodePath))).sendKeys(locationCode);
	}
	public void logisticsGroupSelect(String logisticsGroup) {
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupSelectPopUpPath))).click();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(@class, 'm-l-10 text-capitalize')])")));
    	System.out.println("Finding elements...");
    	List<WebElement> optionsLogistics = driver.findElements(By.xpath("(//div[contains(@class, 'm-l-10 text-capitalize')])"));
    	System.out.println("Found " + optionsLogistics.size() + " elements.");
    	for (WebElement option : optionsLogistics) {
    	    String elementText = option.getText().trim();
    	    if (elementText.equals(logisticsGroup)) {
    	        try {
    	            wait.until(ExpectedConditions.elementToBeClickable(option)).click();
    	            System.out.println("Clicked on element with text: " + elementText);
    	        } catch (StaleElementReferenceException e) {
    	            System.out.println("Element is no longer valid: " + e.getMessage());
    	        }
    	    }
    	}
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupSelectPopUpPath))).click();
	}
	public void locationOwnerTypeSend(String locationOwnerCode) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerTypePath))).clear();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationOwnerTypePath))).sendKeys(locationOwnerCode);
	}
	public void locationTimeZoneSend(String timeZone) {
		try {
	        WebElement dropdownElement = driver.findElement(By.cssSelector(".settings-dropdown-select"));
	        Select dropdown = new Select(dropdownElement);
	        dropdown.selectByVisibleText(timeZone);
		}catch(Exception e) {
			System.out.println("No issue");
		}

	}
	public void loadingTimeSend(String loadingTime) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loadingTimePath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loadingTimePath))).sendKeys(loadingTime);
	}
	public void unLoadingTimeSend(String unloadingTime) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(unloadingTimePath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(unloadingTimePath))).sendKeys(unloadingTime);
	}
	public void arrivalTimeSend(String arrivalTime) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(arrivalTimePath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(arrivalTimePath))).sendKeys(arrivalTime);
	}
	public void shipTimeSend(String shipTime) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shipTimePath))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shipTimePath))).sendKeys(shipTime);
	}
	public void languageSelectPath(String language) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement dropdownMenu = driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-location/div/div[3]/app-home-master-add-location/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[12]/div/div[2]/app-search-dropdown/div/div/div[1]"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", dropdownMenu);
        dropdownMenu.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[contains(@class, 'd-flex text-capitalize ng-star-inserted') ])")));
		System.out.println("Finding elements...");
		List<WebElement> optionsLogistics = driver.findElements(By.xpath("(//span[contains(@class, 'd-flex text-capitalize ng-star-inserted') ])"));
		System.out.println("Found " + optionsLogistics.size() + " elements.");
		    	for (WebElement option : optionsLogistics) {
		    	    String elementText = option.getText().trim();
		    	    if (elementText.equals(language)) {
		    	        try {
		    	            wait.until(ExpectedConditions.elementToBeClickable(option)).click();
		    	            System.out.println("Clicked on element with text: " + elementText);
		    	        } catch (StaleElementReferenceException e) {
		    	            System.out.println("Element is no longer valid: " + e.getMessage());
		    	        }
		    	    }
		    	}
	}
	public void clickReferencePortionPath() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(referencePortionPath))).click();
	}
	public void sendReferenceValueInput(String referenceValue) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(referenceValueInput))).sendKeys(referenceValue);
	}
	public void clickAddresePath() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addressAreaPortion))).click();
	}
	public void clickAddressTextField() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addressTextArea))).click();
	}
	public void buldingNameSend(String buildingName) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buildingInputFieldPath))).sendKeys(buildingName);
	}
	public void streetNameSend(String streetName) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(streetInputFieldPath))).sendKeys(streetName);
	}
	public void cityNameSend(String cityName) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cityInputFieldPath))).sendKeys(cityName);
	}
	public void stateNameSend(String stateName) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stateInputFieldPath))).sendKeys(stateName);
	}
	public void countryNameSend(String countryName) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(countryInputFieldPath))).sendKeys(countryName);
	}
	public void postalCodeSend(String postalCode) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(postalCodeInputFieldPath))).sendKeys(postalCode);
	}
	public void localitySend(String locality) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(localityInputFieldPath))).sendKeys(locality);
	}
	public void landmarkSend(String landmark) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(landmarkInputFieldPath))).sendKeys(landmark);
	}
	public void latitudeSend(String latitude) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(latitudeInputFieldPath))).sendKeys(latitude);
	}
	public void longitudeSend(String longitude) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logitudeInputFieldPath))).sendKeys(longitude);
	}
	public void clickDoneButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(doneButtonPath))).click();
	}
	public void clickContactButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactAreaPortion))).click();
	}
	public void sendName(String contactName) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactNameInput))).sendKeys(contactName);
	}
	public void sendEmail(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactEmailInput))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactEmailInput))).sendKeys(email);
	}
	public void sendPhone(String phoneNo) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactNumberInput))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(contactNumberInput))).sendKeys(phoneNo);
	}

	public void clickSubmitButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButoon))).click();
	}
	public void cancelButtonAddress() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cancelButton))).click();
	}
	public void cancelButtonPopUp() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cancelButtonPopUp))).click();
	}
	
	//Delete
	public void sendDataToInputSearch(String inputSearch) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(idInputField))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(idInputField))).sendKeys(inputSearch);
		
	}
	public void checkTheDataIsValidOrNot(String Id) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'tbody-row') and .//span[contains(@class, 'text-accent-clickable') and text()='"+Id+"']]")));
		System.out.println(element.getText());
		}
	public void clickOnCheckBox(String Id) {
		WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class, 'tbody-row') and .//span[contains(@class, 'text-accent-clickable') and text()='"+Id+"']])[1]/div[1]")));
		checkbox = wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		checkbox.click();
	}
	public void clickDeleteButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationDeleteButton))).click();
	}
	public void acceptAlert() {
		Alert alert=driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		alert.accept();
	}
	public void clearInputSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(idInputField))).clear();
	}
	
	//ModifyButton
	public void clickModifyButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationModifyButton))).click();
	}
}
