package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteLeadWD extends ProjectMethods {

	@Test(groups = "sanity",dependsOnGroups="smoke", dataProvider = "deleteData", dataProviderClass = dataprovpack.DataProviderDeleteLead.class)
	public void deleteLead(String pName) throws InterruptedException {

		click(locateElement("linktext", "Leads"));

		click(locateElement("linktext", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Phone']"));

		type(locateElement("xpath", "//input[@name='phoneCountryCode']"), pName);

		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(8000);

		// Capture lead ID of First Resulting lead

		WebElement firstLeadIdElement = locateElement("xpath",
				"(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String firstleadid = getText(firstLeadIdElement);
		click(firstLeadIdElement);

		click(locateElement("xpath", "//a[text()='Delete']"));

		click(locateElement("linktext","Find Leads"));

		type(locateElement("xpath", "//input[@name='id']"), firstleadid);
		click(locateElement("xpath", "//button[text()='Find Leads']"));

		WebElement errorMessElement = locateElement("xpath", "//div[@class='x-paging-info']");
		System.out.println("Error message displayed is " + getText(errorMessElement));
		verifyExactText(errorMessElement, "No records to display");

		close();

	}

}
