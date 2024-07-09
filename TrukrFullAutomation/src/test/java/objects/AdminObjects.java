package objects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.framework.BaseTest;

public class AdminObjects extends BaseTest {
    // Main Objects
    public String adminPageLinkPath = "/html/body/app-root/app-home/app-sidebar/nav[1]/div/div[6]";
    public String groupPageInsideAdminLinkPath = "/html/body/app-root/app-home/app-sidebar/nav[2]/div/div[1]";
    public String groupCodePageInsideAdminPath = "/html/body/app-root/app-home/app-sidebar/nav[2]/div/div[2]";
    public String uiConfigurationInsideAdminPath = "/html/body/app-root/app-home/app-sidebar/nav[2]/div/div[3]";
    public String userPageInsideAdminPath="/html/body/app-root/app-home/app-sidebar/nav[2]/div/div[4]";
    
    
    //Common Element
    public String checkIndex="//*[@id=\"data_table\"]/div[1]/div[1]/div[1]/div";
    
    // Group Page Objects
    public String addGroupButtonPath = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[1]/div[1]/div[1]/button";
    public String deleteButtonPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[1]/div[1]/div[2]/button";
    public String popUpGroupNameInputTextFieldPath = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[3]/app-home-master-add-group/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[1]/div/input";
    public String popUpGroupDescriptionInputTextFieldPath = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[3]/app-home-master-add-group/div/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/div/input";
    public String popUpGroupPermisiionSelectPath = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[3]/app-home-master-add-group/div/div[2]/div/div[1]/div[2]/div[1]/img";
    public String popUpGroupPermissionSelectInputFieldPath = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[3]/app-home-master-add-group/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div/div/app-search-dropdown/div/div/div[1]/div/div";
    public String popUpGroupPermiStringSelecetInputFieldSearchPath = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[3]/app-home-master-add-group/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div/div/app-search-dropdown/div/div/div[2]/div[1]/input";
    public String popUpGroupSubmitButtonPath = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[3]/app-home-master-add-group/div/div[2]/div/div[2]/button";
    public String popUpSelectIndex1Path = "/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-groups/div/div[3]/app-home-master-add-group/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div/div/app-search-dropdown/div/div/div[2]/div[2]/div/div/div";
    public String popUpGroupNameSearchFieldPath="//*[@id=\"groupId\"]/div/div/div[3]/div/div/div[2]/span/input";
    public String index1GroupPath="//*[@id=\"groupId\"]/div/cdk-virtual-scroll-viewport/div[1]/div[1]/div[1]/div";
    
    //Group code page Objects
    public String addGroupCodeButtonPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-group-codes/div/div[1]/div[1]/div[1]/button";
    public String deleteGroupCodeButtonPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-group-codes/div/div[1]/div[1]/div[2]/button";
    public String popUpGroupCodeNameInputTextFieldPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-group-codes/div/div[3]/app-home-master-add-group-code/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/input";
    public String popUpGroupCodeGroupCodeInputTextFieldPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-group-codes/div/div[3]/app-home-master-add-group-code/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/input";
    public String popUpGroupCodeDescriptionInputTextFieldPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-group-codes/div/div[3]/app-home-master-add-group-code/div/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div/input";
    public String popUpGroupCodeSubmitButtonPath ="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-master-group-codes/div/div[3]/app-home-master-add-group-code/div/div[2]/div/div[2]/button";
    public String popUpGroupCodeNameSearchFieldPath="//*[@id=\"id\"]/div/div/div[3]/div/div/div[2]/span/input";
    public String index1GroupCodePath="//*[@id=\"id\"]/div/cdk-virtual-scroll-viewport/div[1]/div[1]/div[1]/div";
    
    //Changing
    
    //User page objects
    public String addUserButtonPath="//button[contains(., 'Add')]";
    public String deleteUserButtonPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[1]/div[1]/div[2]/div/button";
    public String modifyUserButtonPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[1]/div[1]/div[3]/div/button";
    public String resetPasswordButtonPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[1]/div[1]/div[4]/div/button";
    public String statusButton="//button[contains(., 'Status')]";
    public String loginIdPopUpPath="(//app-home-admin-add-user//div//input[1])[1]";
    public String userNamePopUpPath="(//app-home-admin-add-user//div//input[1])[2]";
    public String userNameModifyPopUpPath="(//app-home-admin-add-user//div//input[1])[1]";
    public String userEmailPopUpPath="(//app-home-admin-add-user//div//input[1])[3]";
    public String userPasswordPopUpPath="(//app-home-admin-add-user//div//input[1])[4]";
    public String userPassModofifiedPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[2]/div/div[1]/div/div/div/div/div[5]/div/input";
    public String userTypePopUpPath="//app-home-admin-add-user/div/div[2]/div/div[1]/div/div/div/div/div[6]/div/div/app-search-dropdown/div/div/div[1]/div";
    public String userTypeIndexes="/html/body/div/div/div/div";
    public String logisticsGroupSelectPopUpPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[2]/div/div[1]/div/div/div/div/div[11]/div/div/app-search-dropdown/div/div";
    public String logisticsGroupInputFieldPopUpPath="/html/body/div/div/div[1]/input";
    public String logisticsGroupIndexPopUpPath="/html/body/div/div/div[2]/div[1]";
    public String groupSelectPopUpPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[2]/div/div[1]/div/div/div/div/div[12]/div/div/app-search-dropdown/div/div/div[1]/div";
    public String submitButtonUserPopUpPath="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[2]/div/div[2]/button";
    public String groupSearchInputPath="/html/body/div/div/div[1]/input";
    public String groupIndex1Path="/html/body/div/div/div[2]/div[1]";
    public String userNameInputFieldSearchPath="//*[@id=\"userId\"]/div/div/div[2]/div/div/div[2]/span/input";
    public String userNameIndex1Select="//*[@id=\"data_table\"]/div[1]/div[1]/div[1]/div";
    public String userHoldIndex="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[1]/div[1]/div[5]/div/div/div[1]/div/div";
    public String userActivateIndex="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[1]/div[1]/div[5]/div/div/div[2]/div/div";
    public String selectCountry="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[2]/div/div[1]/div/div/div/div/div[7]/div/div/app-search-dropdown/div/div/div[1]";
    public String selectCountrCode="//div[contains(@class, 'dropdown__items--container')]//div[contains(@class, 'filter-list-item') and contains(., 'AE - United Arab Emirates')]"; 
    public String countrycodeField="/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[2]/div/div[1]/div/div/div/div/div[9]/div/div/input[1]";
    public String userId="Nisham7356";
    public String userPassword="Pass@123";
    public String userNewPassword="Testing@123";
    public String userName="Nisham";
    public String userEmail="mysmart@smartlinkstech.com";
    public String userNameModified="Nisham123";
    String overlayPath = "//div[contains(@class, 'loader__overlay')]";
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    private JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    
    //User Datas
	public static String userLoginIdRead;
	public static String nameOfUserRead;
	public static String userEmailRead;
	public static String userPasswordRead;
	public static String userTypeRead;
	public static String logisticsGroupRead;
	public static String groupsRead;
    public void addGroup() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
        Thread.sleep(10000);
        driver.findElement(By.xpath(adminPageLinkPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(groupPageInsideAdminLinkPath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(addGroupButtonPath)).click();
        WebElement groupName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(popUpGroupNameInputTextFieldPath)));
        groupName.sendKeys("123456");
        WebElement descriptionField = driver.findElement(By.xpath(popUpGroupDescriptionInputTextFieldPath));
        descriptionField.sendKeys("456789");
        driver.findElement(By.xpath(popUpGroupPermisiionSelectPath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(popUpGroupPermissionSelectInputFieldPath)).click();
        driver.findElement(By.xpath(popUpGroupPermiStringSelecetInputFieldSearchPath)).sendKeys("*");
        Thread.sleep(1000);
        driver.findElement(By.xpath(popUpSelectIndex1Path)).click();
        driver.findElement(By.xpath(popUpGroupSubmitButtonPath)).click();

    }
    public void deleteGroup() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath(adminPageLinkPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(groupPageInsideAdminLinkPath)).click();
        Thread.sleep(3000);
    	WebElement groupNameSeachField=driver.findElement(By.xpath(popUpGroupNameSearchFieldPath));
    	groupNameSeachField.sendKeys("123456");
    	Thread.sleep(2000);
    	WebElement groupIndex1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(index1GroupPath)));
    	groupIndex1.click();
    	WebElement deleteButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(deleteButtonPath)));
    	deleteButton.click();
    	Alert alert=driver.switchTo().alert();
		alert.accept();
    }
    public void addGroupCode() throws Exception {  	
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
        Thread.sleep(10000);
        driver.findElement(By.xpath(adminPageLinkPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(groupCodePageInsideAdminPath)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(addGroupCodeButtonPath)).click();
        WebElement groupCodeName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(popUpGroupCodeNameInputTextFieldPath)));
        groupCodeName.sendKeys("Nisham11-Test");
        WebElement groupCodeCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(popUpGroupCodeGroupCodeInputTextFieldPath)));
        groupCodeCode.sendKeys("Nisham11");
        WebElement groupCodedescriptionField = driver.findElement(By.xpath(popUpGroupCodeDescriptionInputTextFieldPath));
        groupCodedescriptionField.sendKeys("Nisham11");
        driver.findElement(By.xpath(popUpGroupCodeSubmitButtonPath)).click();
    }
    public void deleteGroupCode() throws InterruptedException {
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
        Thread.sleep(10000);
        driver.findElement(By.xpath(adminPageLinkPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(groupCodePageInsideAdminPath)).click();
        Thread.sleep(3000);
    	WebElement groupCodeNameSeachField=driver.findElement(By.xpath(popUpGroupCodeNameSearchFieldPath));
    	groupCodeNameSeachField.sendKeys("Nisham11");
    	Thread.sleep(2000);
    	WebElement groupCodeIndex1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(index1GroupCodePath)));
    	groupCodeIndex1.click();
    	WebElement deleteButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(deleteGroupCodeButtonPath)));
    	deleteButton.click();
    	Alert alert=driver.switchTo().alert();
		alert.accept();
    }
    
    
    
    
    
    
    
    
    
    
    public void checkCounryCodeChangingOrNot(){
        WebElement adminPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(adminPageLinkPath)));
        adminPage.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement addUser=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addUserButtonPath)));
        addUser.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectCountry))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectCountrCode))).click();
        WebElement inputField = driver.findElement(By.cssSelector("input.small-field"));
        String inputText = inputField.getAttribute("value");
        System.out.println("Text from input field: " + inputText);
        Assert.assertEquals(inputText,"971");
        driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[1]/img[2]")).click();
    }
    public void checkUtcTimeChangingOrNot(){
//        WebElement adminPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(adminPageLinkPath)));
//        adminPage.click();
//        WebElement userPageInsideAdmin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userPageInsideAdminPath)));
//        userPageInsideAdmin.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement addUser=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addUserButtonPath)));
        addUser.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectCountry))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectCountrCode))).click();   	
        WebElement divElement = driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[2]/div/div[1]/div/div/div/div/div[8]/div/div/app-search-dropdown/div/div/div[1]/div"));
        String divText = divElement.getText();
        driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-admin/div/div/app-home-admin-users/div/div[3]/app-home-admin-add-user/div/div[1]/img[2]")).click();
        Assert.assertEquals(divText, "UTC+04:00");
        
    }
    
    public void navigateToAddUserPage() {
        WebElement adminPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(adminPageLinkPath)));
        adminPage.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
    }
    
    public void clickAddUserButton() {
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
        WebElement addUser=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addUserButtonPath)));
        addUser.click();
    }
    public void sendLoginId() {
        WebElement loginIdInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginIdPopUpPath)));
        loginIdInput.sendKeys(userId);
    }
    public void sendUserName() {
        WebElement userNameInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNamePopUpPath)));
        userNameInput.sendKeys(userName);
    }
    public void sendEmail() {
        WebElement userEmailInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userEmailPopUpPath)));
        userEmailInput.sendKeys(userEmail);
    }
    public void sendPassword() {
        WebElement userPasswordInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userPasswordPopUpPath)));
        userPasswordInput.sendKeys(userPassword);
    }
    public void selectUserType() throws InterruptedException {
        WebElement userType=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userTypePopUpPath)));
        userType.click();
        List<WebElement> options=driver.findElements(By.xpath(userTypeIndexes));
        for(WebElement option:options) {
        	String elementText = option.getText().trim();
            if(elementText.equals("Non Admin")) {
            	wait.until(ExpectedConditions.elementToBeClickable(option));
            	option.click();
            	forNonAdmin();
            }
        }
    }
    public void selectCountry() {
    	
    }
    public void selectTimeZone() {
    	
    }
    public void sendPhoneNumber() {
    	
    }
    public void selectLanguage() {
    	
    }
    public void selectPasswordPolicy() {
    	
    }
    public void addNewUser() throws InterruptedException{
//        WebElement adminPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(adminPageLinkPath)));
//        adminPage.click();
//        WebElement userPageInsideAdmin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userPageInsideAdminPath)));
//        userPageInsideAdmin.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement addUser=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addUserButtonPath)));
        addUser.click();
        WebElement loginIdInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginIdPopUpPath)));
        loginIdInput.sendKeys(userId);
        WebElement userNameInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNamePopUpPath)));
        userNameInput.sendKeys(userName);
        WebElement userEmailInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userEmailPopUpPath)));
        userEmailInput.sendKeys(userEmail);
        WebElement userPasswordInput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userPasswordPopUpPath)));
        userPasswordInput.sendKeys(userPassword);
        WebElement userType=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userTypePopUpPath)));
        userType.click();
        List<WebElement> options=driver.findElements(By.xpath(userTypeIndexes));
        for(WebElement option:options) {
        	String elementText = option.getText().trim();
            if(elementText.equals("Non Admin")) {
            	wait.until(ExpectedConditions.elementToBeClickable(option));
            	option.click();
            	forNonAdmin();
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButtonUserPopUpPath))).click();
        
    }
    public void deleteUser() {
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(adminPageLinkPath))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement userNameSearchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameInputFieldSearchPath)));
        userNameSearchField.sendKeys(userId);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameIndex1Select))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(deleteUserButtonPath))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        userNameSearchField.clear();
        userNameSearchField.sendKeys(userId);
    }
    public void modifyUserData() throws InterruptedException{
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement UserNameSeachField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameInputFieldSearchPath)));
        UserNameSeachField.clear();
        UserNameSeachField.sendKeys(userId);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameIndex1Select))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(modifyUserButtonPath))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNamePopUpPath))).clear();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameModifyPopUpPath))).sendKeys(userNameModified);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButtonUserPopUpPath))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        
    }
    public void resetPassword() throws InterruptedException {
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement UserNameSeachField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameInputFieldSearchPath)));
        UserNameSeachField.clear();
        UserNameSeachField.sendKeys(userId);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameIndex1Select))).click();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(resetPasswordButtonPath))).click();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userPassModofifiedPath))).clear();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userPassModofifiedPath))).sendKeys(userNewPassword);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButtonUserPopUpPath))).click();
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
    }
    public void putUserOnHold() throws InterruptedException {
   	 WebElement adminPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(adminPageLinkPath)));
     adminPage.click();
        WebElement UserNameSeachField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameInputFieldSearchPath)));
        UserNameSeachField.clear();
        UserNameSeachField.sendKeys(userId);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameIndex1Select))).click();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(statusButton))).click();
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userHoldIndex)));
        WebElement hold=driver.findElement(By.xpath(userHoldIndex));
        if(hold.isEnabled()) {
        	hold.click();
        	Thread.sleep(1000);
        	Alert alert=driver.switchTo().alert();
    		alert.accept();
        }else {
        	System.out.println("User is already In Hold");
        }
        UserNameSeachField.clear();
    }
    public void putUserActivate() throws InterruptedException {
    	 WebElement adminPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(adminPageLinkPath)));
         adminPage.click();
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
        WebElement UserNameSeachField=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameInputFieldSearchPath)));
        UserNameSeachField.clear();
        UserNameSeachField.sendKeys(userId);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userNameIndex1Select))).click();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(statusButton))).click();
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userActivateIndex)));
        WebElement Active=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(userActivateIndex)));
        if(Active.isEnabled()) {
        	Active.click();
        	Thread.sleep(5000);
        	Alert alert=driver.switchTo().alert();
    		alert.accept();
        }else {
        	System.out.println("User is already In Active");
        }
        UserNameSeachField.clear();
    }
    private void forNonAdmin() throws InterruptedException{
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupSelectPopUpPath))).click();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(@class, 'm-l-10 text-capitalize')])")));
    	System.out.println("Finding elements...");
    	List<WebElement> optionsLogistics = driver.findElements(By.xpath("(//div[contains(@class, 'm-l-10 text-capitalize')])"));
    	System.out.println("Found " + optionsLogistics.size() + " elements.");
    	for (WebElement option : optionsLogistics) {
    	    String elementText = option.getText().trim();
    	    if (elementText.equals("Okh")) {
    	        try {
    	            wait.until(ExpectedConditions.elementToBeClickable(option)).click();
    	            System.out.println("Clicked on element with text: " + elementText);
    	        } catch (StaleElementReferenceException e) {
    	            System.out.println("Element is no longer valid: " + e.getMessage());
    	        }
    	    }
    	}
    	try {
    		pickGroupIndex1();
    	}catch(Exception e) {
    		pickGroupIndex1();
    	}
    }
    private void pickGroupIndex1() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(groupSelectPopUpPath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(groupSearchInputPath))).sendKeys("123456");
        Thread.sleep(5000);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(groupIndex1Path)));
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
     element.click();
    }   
}


