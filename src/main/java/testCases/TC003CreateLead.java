package testCases;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003CreateLead extends LeafTapsWrappers {
	@BeforeClass
	public void initialize() {
		testCaseName = "TC003CreateLead";
		testDescription = "Login Positive";
		category = "Smoke";
		authors= "Sethu";
		browserName = "chrome";
		dataSheetName ="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String username, String passwd, String companyName, String firstName, String lastName) {
		new LoginPage(driver,test)
		.enterUserName(username)
		.enterPassword(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmit();
				
			}
}

