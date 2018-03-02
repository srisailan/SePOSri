package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeads extends LeafTapsWrappers {
	
	public FindLeads (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public FindLeads enterFLead(String data) {
	enterByXpath("//input[@name='id']", data);//entering From Lead ID
	return this;
	}
	
	public FindLeads clickFlead() {
		clickByXpath("(//button[@class='x-btn-text'])[1]");//click Find lead button
		return this;
		}
	
	public MergeLeads selectFlead() {
	clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");//click From Lead search result
	switchToParentWindow();
	return new MergeLeads (driver,test);
   }
	
	/*public MergeLeads switchtoParent() {
		switchToParentWindow();//Switching to Merge Lead page
		return new MergeLeads(driver, test);
	}*/
	
	public FindLeads enterTLead(String data) {
		enterByXpath("//input[@name='id']", data);//entering From Lead ID
		return this;
		}
		
		public FindLeads clickTlead() {
			clickByXpath("(//button[@class='x-btn-text'])[1]");//click Find lead button
			return this;
			}
		
		public MergeLeads selectTlead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");//click From Lead search result
		return new MergeLeads(driver,test);
	   }
}
