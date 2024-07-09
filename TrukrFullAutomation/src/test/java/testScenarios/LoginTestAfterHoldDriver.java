package testScenarios;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Login.LoginPage;
import com.framework.BrowserBaseTest;

import datadriven.XLUtility;

public class LoginTestAfterHoldDriver extends BrowserBaseTest{
	@Test(dataProvider="LoginData")
	public void loginAfterHoldDriver(
	String user,
	String pwd,
	String resultExpected,
	String expectedMessage) {
		LoginPage loginPage=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		loginPage.sendUsername(user);
		System.out.println(user);
		loginPage.sendPassword(pwd);
		System.out.println(pwd);
		loginPage.enterLoginButton();
		String exp_Message="Something went wrong. Please contact your administrator";
		if(resultExpected.equals("NotLogin"))
		{	 
			if(expectedMessage.equals(exp_Message)){
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message")));
				 wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(By.className("error-message"), "")));
				 String textGot=element.getText();
				System.out.println("Extracted text: " + textGot);
				if(exp_Message.equals(textGot)) {
					Assert.assertTrue(true);
				}else {
					Assert.assertTrue(false);
				}
					
			}
		}

	}
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{

		String path=".\\datafiles\\deleteDriverData.xlsx";
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
				
		}
		
		return loginData;
	}
}
