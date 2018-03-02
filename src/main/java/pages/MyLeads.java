package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeads extends LeafTapsWrappers{
	public MyLeads (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public CreateLeadPage clickCreateLead() {
		clickByLink("Create Lead");
		return new CreateLeadPage(driver,test);
			}
	public MergeLeads clickMergeLeads() {
		clickByLink("Merge Leads");
		return new MergeLeads(driver,test);
			}
}
