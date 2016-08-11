package testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class LoginTestCase extends Common{
	ResourceBundle rb1=ResourceBundle.getBundle("UsernamePassword");

	@Test
	public void loginMet() {
		LoginPage login=new LoginPage(driver);
		login.enterUsername(rb1.getString("s1qa3_username"));
		login.enterPassword(rb1.getString("s1qa3_password"));
		login.clikSignin();
		
	
		
	}
	
	

}
