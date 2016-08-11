package testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.Common;
import pages.ContactbuilderPage;
import pages.LoginPage;
import pages.SelectAppPage;

public class ContactBuilderTestCase extends Common{
	
	ResourceBundle rb1=ResourceBundle.getBundle("UsernamePassword");
	
	@Test
	public void contactBuildermet(){
		
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername(rb1.getString("s1qa3_username"));
		login.enterPassword(rb1.getString("s1qa3_password"));
		login.clikSignin();
	
	SelectAppPage sap=new SelectAppPage(driver);
	sap.audienceBuilder();
	
	ContactbuilderPage cbp=new ContactbuilderPage(driver);
	cbp.dataSource();

	}

}
