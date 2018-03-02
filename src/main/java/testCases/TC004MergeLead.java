package testCases;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004MergeLead extends LeafTapsWrappers {
	@BeforeClass
	public void initialize() {
		testCaseName = "TC003MergeLead";
		testDescription = "Login Positive";
		category = "Smoke";
		authors= "Sethu";
		browserName = "chrome";
		dataSheetName ="TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String username, String passwd, String fLead, String tLead)
		{
		new LoginPage(driver,test)
		.enterUserName(username)
		.enterPassword(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromFindLead()
		.enterFLead(fLead)
		.clickFlead()
		.selectFlead()
		.clickToFindLead()
		.enterTLead(tLead)
		.clickTlead()
		.selectTlead()
		.clickMerge();
			
				}
}

