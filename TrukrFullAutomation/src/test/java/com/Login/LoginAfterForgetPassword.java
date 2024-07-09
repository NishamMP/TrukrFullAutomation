package com.Login;

import org.testng.annotations.Test;

public class LoginAfterForgetPassword {
	
	@Test
	public void loginAfterForgetPassword(){
		
		LoginTest loginTest=new LoginTest();
		loginTest.loginTest("Nisham7356","Nisham@123","Valid");
		
	}

}
