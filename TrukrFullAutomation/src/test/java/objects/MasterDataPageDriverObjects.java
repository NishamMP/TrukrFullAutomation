package objects;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.BaseTest;

public class MasterDataPageDriverObjects extends BaseTest{
		public String masterDataXpath="/html/body/app-root/app-home/app-sidebar/nav[1]/div/div[2]";
		public String driverMenuPath="/html/body/app-root/app-home/app-sidebar/nav[2]/div/div[2]";
		public String locationAddButtonPath="//button[contains(., 'New')]";
		public String inputImagePath="//input[@type='file']";
		public String cropButtonPath="//button[contains(., 'Crop')]";
		public String driverImagePath="C:/Users/DELL/OneDrive/Desktop/messiImage.jpeg";
		public String nameTextInputField="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/input";
		public String passwordInputField="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[2]/input";
		public String emailInputTextField="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[4]/div[2]/input";
		public String phoneNumberInputTextField="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[6]/div[2]/div/input[2]";
		public String licenseNoField="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[7]/div[2]/input";
		public String logisticsGroupSelectPopUpPath="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[9]/div[2]/div/app-search-dropdown/div/div/div[1]";
		public String calendarPickImage="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[10]/div[2]/div/img";
		public String selectMonth="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[10]/div[2]/div/img";
		public String submitButton="//button[contains(.,'Submit')]";
		public String overlayPath = "//div[contains(@class, 'loader__overlay')]";
		public String cancelButton="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[1]/img[2]";
		public String phoneNoSearchField="//*[@id=\"driverid\"]/div/div/div[4]/div/div/div[2]/span/input";
		public String driverDeleteButton="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[1]/div[1]/div[2]/button";
		public String driverModifyButton="";
		public String driverStatus="//button[contains(., 'Status')]";
		public String holdButton="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[1]/div[1]/div[3]/div/div[1]/div/div";
		public String activateButton="/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[1]/div[1]/div[3]/div/div[2]/div/div";
		public String clearButton="//*[@id=\"driverid\"]/div/div/div[4]/div/div/div[2]/span[2]/img";
		public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		public void addDriver() {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
		 	WebElement masterDataPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(masterDataXpath)));
	        masterDataPage.click();
	        WebElement addDriverDataPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(driverMenuPath)));
	        addDriverDataPage.click();
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
	        WebElement addDriver=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationAddButtonPath)));
	        addDriver.click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(inputImagePath))).sendKeys(driverImagePath);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cropButtonPath))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(nameTextInputField))).sendKeys("Nisham");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(passwordInputField))).sendKeys("Nisham*@123");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(emailInputTextField))).sendKeys("nisham@smaert.cpm");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(phoneNumberInputTextField))).sendKeys("7356123456");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(licenseNoField))).sendKeys("DLD123JKL789456");
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
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupSelectPopUpPath))).click();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(calendarPickImage))).click();
	        WebElement monthSelectElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Select month']")));
            Select monthSelect = new Select(monthSelectElement);
            for (WebElement option : monthSelect.getOptions()) {
                monthSelect.selectByVisibleText(option.getText());
                WebElement selectedOption = monthSelect.getFirstSelectedOption();
                if (selectedOption.getText().equals("Dec")) {
                    selectedOption.click();
                    break;
                }
            }
	        WebElement yearSelectElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Select year']")));
	        Select yearSelect = new Select(yearSelectElement);
	        for (int i = 0; i < yearSelect.getOptions().size(); i++) {
	            yearSelect.selectByIndex(i);
	            WebElement selectedOption = yearSelect.getFirstSelectedOption();
	            if(selectedOption.getText().equals("1968")) {
	            	break;
	            }
	        }
	        String targetDate = "15";
	        WebElement calendar = driver.findElement(By.cssSelector("ngb-datepicker-month[role='grid']"));
	        List<WebElement> dateCells = calendar.findElements(By.cssSelector("div[role='gridcell']"));
	        for (WebElement cell : dateCells) {
	            String day = cell.findElement(By.cssSelector("div[ngbdatepickerdayview]")).getText();
	            if (day.equals(targetDate)) {
	                cell.click();
	                break;
	            }
	        }
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButton))).click();
		}
		public void clickOnMasterDataPage() {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(overlayPath)));
		 	WebElement masterDataPage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(masterDataXpath)));
	        masterDataPage.click();
		}
		public void clickOnDriverMenuPath() {
		    int retries = 3;  // Number of retry attempts
		    while (retries > 0) {
		        try {
		            WebElement addDriverDataPage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(driverMenuPath)));
		            addDriverDataPage.click();
		            break;
		        } catch (StaleElementReferenceException e) {
		            retries--;
		            System.out.println("StaleElementReferenceException encountered. Retries left: " + retries);
		            try {
		                Thread.sleep(500); // Wait for 500 milliseconds
		            } catch (InterruptedException ie) {
		                Thread.currentThread().interrupt();
		                throw new RuntimeException("Interrupted while handling stale element reference", ie);
		            }
		            
		            if (retries == 0) {
		                throw e;
		            }
		        }
		    }
		}
		public void clickOnaddNewDriverButton() {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
	        WebElement addDriver=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locationAddButtonPath)));
	        addDriver.click();
		}
		public void sendProfileImage(String profilePath) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/img")));
		        WebElement inputImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(inputImagePath)));
		        inputImage.sendKeys(profilePath);
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-spinner"))); // Example for a loading spinner
		        WebElement cropButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cropButtonPath)));
		        wait.until(ExpectedConditions.elementToBeClickable(cropButton)).click();
		}

		public void sendDriverName(String userName) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
            WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(nameTextInputField)));
            nameInput.clear();

            nameInput.sendKeys(userName);		}
		public void sendPassword(String password) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(passwordInputField))).sendKeys(password);

		}
		public void sendEmailAddress(String email) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(emailInputTextField))).sendKeys(email);
		}
		public void selectCountry(String country) {
		    By dropdownLocator = By.cssSelector(".settings-dropdown-select");
		    retryingFindAndClick(dropdownLocator, 3);
		    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
		    Select select = new Select(dropdown);
		    select.selectByValue(country);
		}

		public void sendPhoneNo(String phoneNo) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(phoneNumberInputTextField))).sendKeys(phoneNo);
		}
		public void sendLicenseNo(String dlsno) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(licenseNoField))).sendKeys(dlsno);
		}
		public void selectLanguage(String languageOption) {
		    WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-home/section/div/app-master/div/div/app-home-master-drivers/div/div[3]/app-home-master-add-driver/div/div[2]/div/div[1]/div/div[2]/div/div/div[8]/div[2]/div/select")));
		    dropdownElement.click();
		    Select dropdown = new Select(dropdownElement);
		    List<WebElement> options = dropdown.getOptions();
		    System.out.println("Available options:");
		    try {
		        dropdown.selectByVisibleText(languageOption);
		    } catch (NoSuchElementException e) {
		        System.out.println("Option with text '" + languageOption + "' not found. Trying by value.");
		        try {
		            dropdown.selectByValue(languageOption);
		        } catch (NoSuchElementException ex) {
		            System.out.println("Option with value '" + languageOption + "' not found.");
		            throw ex;
		        }
		    }
		}

		public void selectLogisticsGroup(String GroupName) {
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(logisticsGroupSelectPopUpPath))).click();
	    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(@class, 'm-l-10 text-capitalize')])")));
	    	System.out.println("Finding elements...");
	    	List<WebElement> optionsLogistics = driver.findElements(By.xpath("(//div[contains(@class, 'm-l-10 text-capitalize')])"));
	    	System.out.println("Found " + optionsLogistics.size() + " elements.");
	    	for (WebElement option : optionsLogistics) {
	    	    String elementText = option.getText().trim();
	    	    if (elementText.equals(GroupName)) {
	    	        try {
	    	            wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	    	            System.out.println("Clicked on element with text: " + elementText);
	    	        } catch (StaleElementReferenceException e) {
	    	            System.out.println("Element is no longer valid: " + e.getMessage());
	    	        }
	    	    }
	    	}
		}
		public void selectDateOfBirth(String date) {
			
			String delimiter = date.contains("-") ? "-" : "/";
	        
	        // Split the date string into day, month, and year based on the delimiter
	        String[] dateParts = date.split(delimiter);
	        
	        // Extract day, month, and year
	        String day = dateParts[0];
	        String month = dateParts[1];
	        String yearTarget = dateParts[2];
	        
	        // Map numeric month values to their corresponding names
	        HashMap<String, String> monthMap = new HashMap<>();
	        monthMap.put("01", "JAN");
	        monthMap.put("02", "FEB");
	        monthMap.put("03", "MAR");
	        monthMap.put("04", "APR");
	        monthMap.put("05", "MAY");
	        monthMap.put("06", "JUN");
	        monthMap.put("07", "JUL");
	        monthMap.put("08", "AUG");
	        monthMap.put("09", "SEP");
	        monthMap.put("10", "OCT");
	        monthMap.put("11", "NOV");
	        monthMap.put("12", "DEC");
	        
	        // Ensure the month is in a two-digit format (e.g., "01" instead of "1")
	        String monthKey = month.length() == 1 ? "0" + month : month;
	        
	        // Get the month name from the map
	        String monthName = monthMap.get(monthKey);
	        
	        // If the month name is null, the input might be invalid
	        if (monthName == null) {
	            System.out.println("Invalid month format: " + month);
	            return;
	        }
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(calendarPickImage))).click();
	        WebElement monthSelectElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Select month']")));
            Select monthSelect = new Select(monthSelectElement);
            for (WebElement option : monthSelect.getOptions()) {
                monthSelect.selectByVisibleText(option.getText());
                WebElement selectedOption = monthSelect.getFirstSelectedOption();
                if (selectedOption.getText().equals("Dec")) {
                    selectedOption.click();
                    break;
                }
            }
	        WebElement yearSelectElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Select year']")));
	        Select yearSelect = new Select(yearSelectElement);
	        for (int i = 0; i < yearSelect.getOptions().size(); i++) {
	            yearSelect.selectByIndex(i);
	            WebElement selectedOption = yearSelect.getFirstSelectedOption();
	            if(selectedOption.getText().equals(yearTarget)) {
	            	break;
	            }
	        }
	        String targetDate = day;
	        WebElement calendar = driver.findElement(By.cssSelector("ngb-datepicker-month[role='grid']"));
	        List<WebElement> dateCells = calendar.findElements(By.cssSelector("div[role='gridcell']"));
	        for (WebElement cell : dateCells) {
	            String dayT = cell.findElement(By.cssSelector("div[ngbdatepickerdayview]")).getText();
	            if (dayT.equals(targetDate)) {
	                cell.click();
	                break;
	            }
	        }
			
		}
		private void retryingFindAndClick(By by, int attempts) {
		    int tries = 0;
		    while (tries < attempts) {
		        try {
		            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
		            element.click();
		            return;
		        } catch (StaleElementReferenceException e) {
		            tries++;
		            System.out.println("StaleElementReferenceException: Retrying... " + tries);
		        }
		    }
		    throw new StaleElementReferenceException("Element not stable after " + attempts + " attempts: " + by);
		}
		
	public void clickSubmitButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(submitButton))).click();
	}
	public void cancelButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cancelButton))).click();
	}
	public void sendPhoneNoSearchField(String phoneNo) {
	    WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(phoneNoSearchField)));
	    searchField.clear();
	    searchField.sendKeys(phoneNo);

	    // Optionally, add a wait to ensure that the data related to the phone number is updated in the UI
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(@class, 'tbody-row') and .//span[contains(@class, '') and text()='" + phoneNo + "']]"), phoneNo));
	}

	public void checkTheDataIsValidOrNot(String phoneNo) {
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class, 'tbody-row') and .//span[contains(@class, '') and text()='" + phoneNo + "']])[1]")));
	    System.out.println(element.getText());

	    // Ensure the element's text matches the phone number to avoid issues with timing
	    wait.until(ExpectedConditions.textToBePresentInElement(element, phoneNo));
	}

	public void clickOnCheckBox(String phoneNo) {
	    // Locate the row containing the phone number
	    WebElement row = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class, 'tbody-row') and .//span[contains(@class, '') and text()='" + phoneNo + "']])[1]")));
	    // Locate the checkbox within the row
	    WebElement checkbox = row.findElement(By.xpath("(//div[contains(@class, 'tbody-row') and .//span[contains(@class, '') and text()='"+phoneNo+"']])[1]/div[1]"));
	    
	    // Ensure the checkbox is clickable
	    checkbox = wait.until(ExpectedConditions.elementToBeClickable(checkbox));
	    checkbox.click();
	}

	public void clickDeleteButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(driverDeleteButton))).click();
	}
	public void acceptAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void clearInputSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(phoneNoSearchField))).clear();
	}
	public void clickClearButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(clearButton))).click();
	}
	
	public void clickModifyButton(String phoneNo) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@class, 'tbody-row') and .//span[contains(@class, '') and text()='"+phoneNo+"']])[1]/div[2]//span"))).click();
	}
	public void clickStatusButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(driverStatus))).click();
	}
	public void clickHold() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(holdButton))).click();
	}
	public void clickActivate() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(activateButton))).click();
	}
}
