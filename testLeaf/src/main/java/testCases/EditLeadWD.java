package testCases;


import org.testng.annotations.Test;


public class EditLeadWD extends ProjectMethods {

	@Test(groups="smoke", dataProvider="editData", dataProviderClass=dataprovpack.DataProviderEditLead.class)
	public void editLead(String FName,String newCompanyName) throws InterruptedException {

click(locateElement("linktext","Leads"));
		
		click(locateElement("linktext","Find Leads"));
		
		type(locateElement("xpath","(//input[@name='firstName'])[3]"),FName);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(9000);

		
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));

		//verify title of page
		
		verifyTitle("View Lead");
		
		//Click Edit

		click(locateElement("xpath","//a[text()='Edit']"));
		
		//Change the company name

		
		type(locateElement("id","updateLeadForm_companyName"),newCompanyName);
		
		//Click Update


		click(locateElement("xpath","//input[@value='Update']"));
		
		//Confirm the changed name appears

		verifyPartialText((locateElement("id","viewLead_companyName_sp")),newCompanyName);
		
		//close browser
		closeBrowser();
	
		
	}
}
