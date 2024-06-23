package testScenarios;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.BaseTest;

import apipost.EndPointPost;
import readData.ReadData;
public class EndpointPostTest extends BaseTest {
	@Test
	public void endPointApiPush() throws IOException, InterruptedException {
		ReadData readData=new ReadData();
		readData.DataReadTest();
		Thread.sleep(1000);
		String tripId=readData.tripId;
		String deviceId=readData.deviceId;
		EndPointPost endPointPost=new EndPointPost();
		String accesToken=endPointPost.loginUserApi();
		Thread.sleep(3000);
		System.out.println(accesToken);
		System.out.println(deviceId);
		System.out.println(tripId);
		endPointPost.sendPostRequest(accesToken,tripId,deviceId);
		driver.navigate().refresh();
	}
	


}
