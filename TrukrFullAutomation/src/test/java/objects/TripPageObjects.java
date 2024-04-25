package objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TripPageObjects {
	WebDriver driver;
	
	public TripPageObjects(WebDriver driver) {

		this.driver=driver;
	}
	
	public String addButtonPath="//button[contains(.,'Add')]";
	
	public void confirmTitlePage() {
		WebElement addButton=driver.findElement(By.xpath(addButtonPath));
        String buttonText = addButton.getText();
        String expectedButtonText="Add";
        Assert.assertEquals(buttonText, expectedButtonText);
	}

	
}
