package objects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateNewTrip {
	WebDriver driver;
	public CreateNewTrip(WebDriver driver) {
		this.driver=driver;
	}
	//By addingButton=By.xpath("(//button)[2]");
	//By searchButton=By.xpath("(//input[@name=\"btnK\"])[1]");
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	public void createTrip(String TripId) {
		try {
			//add Button 
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader__overlay")));
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[1]/div[1]/div[1]/div/button")));
	        button.click();
			//TripId
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[2]/input")).sendKeys(TripId);
			//logistics group
			WebElement logisticsGroup=driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div/div"));
			logisticsGroup.click(); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			//select1 from the group
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]/div/div/div")).click();
			//select truck
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[6]/div/div[2]/app-search-dropdown/div/div/div[1]/div")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			//select index 1
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div/div/div[6]/div/div[2]/app-search-dropdown/div/div/div[2]/div/div[2]/span")).click();
			//next button
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/button")).click();
			
			//stop Details Page
			
			//location id 1
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div")).click();
			//search locationid
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[1]/input")).sendKeys("WNDC");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]")).click();
			
			//location id 2
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div")).click();
			//search locationid 2
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[1]/input")).sendKeys("1234");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]")).click();
			
			//add extra stop button
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/div[1]")).click();
			
			//locatio id 3
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[1]/div")).click();
			//search locationid 3
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[1]/input")).sendKeys("WNDC");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/app-search-dropdown/div/div/div[2]/div[2]/div[1]")).click();
			
			//recompute button
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/div[2]/button[2]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			System.out.print("Something Went Wrong");
			//submit button
			driver.findElement(By.xpath("/html/body/app-root/app-home/section/div/app-home-workbench/div/div/app-home-workbench-mytrip/div/div[3]/app-home-workbench-add-trip/div/div/div[2]/div[2]/div[2]/button[1]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			
				    	
		}catch(Exception e) {
			System.out.println("Exception Caught: "+e.getMessage());
		}
		
		
	}

}
