package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002Login extends LeafTapsWrappers{
	
	@BeforeClass
	public void initialize() {
		testCaseName = "TC002Login";
		testDescription = "Login Positive";
		category = "Smoke";
		authors= "Sethu";
		browserName = "chrome";
		dataSheetName ="TC002";
	}
	
	@Test(dataProvider="fetchData")
	public void doLogin(String username, String passwd, String text) {
		new LoginPage(driver,test)
		.enterUserName(username)
		.enterPassword(passwd)
		.clickLoginForFailure()
		.verifyErrorMessage(text);		
	}

}
