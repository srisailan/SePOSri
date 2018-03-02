package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {
	
	public CreateLeadPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public CreateLeadPage enterCompanyName(String  data) {
		enterById("createLeadForm_companyName", data); //entering company name
		return this;
	}
	public CreateLeadPage enterFirstName(String  data) {
		enterById("createLeadForm_firstName", data); //entering first name
		return this;
	}
	public CreateLeadPage enterLastName(String  data) {
		enterById("createLeadForm_lastName", data); //entering last name
		return this;
	}
	
	public ViewLead clickSubmit() {
		clickByClassName("smallSubmit"); //click submit button
		return new ViewLead();
	}

}
