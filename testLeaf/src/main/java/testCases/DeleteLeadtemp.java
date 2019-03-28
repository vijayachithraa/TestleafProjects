package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import wdMethods.ProjectMethods;

public class DeleteLeadtemp extends ProjectMethods {

	@Test
	public void createLead() throws InterruptedException {
		login();

	click(locateElement("Leads"));
		click(locateElement("Find Leads"));
		

		click(locateElement("xpath", "//*[@class='x-tab-strip-inner']/span[contains(text(),'Email')]"));
		type(locateElement("name", "emailAddress"), "d");
		
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(5000);
		
		//Capture name of First Resulting lead


		
		
		WebElement ele1=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		
		String str1=getText(ele1);
		
		//ele1.click();
		click(ele1);
		System.out.println("First name of the Lead is"+ "" + str1);
		
		
		
		//Click Duplicate Lead

		
		click(locateElement("xpath", "//a[@class='subMenuButton'] [contains(text(),'Duplicate Lead')]"));
		
		// Verify the title as 'Duplicate Lead'
		
		System.out.println("Title verification result "+ verifyTitle("Duplicate Lead"));

		
		
		//Click create Lead
		
		click(locateElement("xpath", "//input[@class = 'smallSubmit' ]"));
		
		//confirm duplicated name is same as captured name
		
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), str1);
		
		//close browser
		closeBrowser();
	
		
	}
}


