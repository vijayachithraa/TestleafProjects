package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.ProjectMethods2;

public class EditContactWD extends ProjectMethods2 {

	@Test
	public void createLead() throws InterruptedException {
		
		login();
		click(locateElement("linktext", "Contacts"));
		click(locateElement("linktext", "Find Contacts"));
		type(locateElement("xpath","(//input[@name='firstName'])[3]"),"vijaya");
		click(locateElement("xpath", "//button[text()='Find Contacts']"));
		Thread.sleep(4000);

		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		// verify Title
		verifyTitle("View Contact");
		// Click Edit
		click(locateElement("xpath", "//a[text()='Edit']"));

		// Change First Name

		String firstName = "Karthi";
		type(locateElement("id", "viewContact_fullName_sp"), firstName);

		// click update

		click(locateElement("xpath", "//input[@value='Update']"));

		// confirm the changed name appears

		verifyPartialText((locateElement("id", "viewLead_companyName_sp")), firstName);
		// close the browser

		close();

	}

}
