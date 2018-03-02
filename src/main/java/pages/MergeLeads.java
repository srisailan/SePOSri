package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeads extends LeafTapsWrappers {
	
	public MergeLeads (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public FindLeads clickFromFindLead() {
		clickByXpath("//input[@id='ComboBox_partyIdFrom']/following::img[1]");//click From Lead search icon
		switchToLastWindow();//switching to From lead screen
		return new FindLeads(driver,test);
	    }
	
	/*public FindLeads switchtoLast() {
		switchToLastWindow();//switching to From lead screen
		return new FindLeads(driver,test);
	}*/
	
	public FindLeads clickToFindLead() {
		clickByXpath("//input[@id='ComboBox_partyIdTo']/following::img[1]");//click From Lead search icon
		return new FindLeads(driver,test);
	}
		
	public ViewLead clickMerge() {	
		clickByLink("Merge");//click Merge Link button
		driver.switchTo().alert().accept();
		return new ViewLead();
	}

  }
