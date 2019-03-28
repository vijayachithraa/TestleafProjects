package testCases;

import org.testng.annotations.Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods2;

public class CreateContactWD extends ProjectMethods2 {

	@Test
	public void createContact() throws InterruptedException {
		
		login();
		click(locateElement("linktext", "Contacts"));
		click(locateElement("linktext", "Create Contact"));
		String firstName ="vijaya";
		type(locateElement("id", "firstNameField"),firstName );
		String lastName ="Chithra";
		type(locateElement("id", "lastNameField"),lastName);
		String finalName=firstName+" "+lastName;

		type(locateElement("id", "createContactForm_firstNameLocal"), "Vijaya");
		type(locateElement("id", "createContactForm_lastNameLocal"), "Chithra");

		type(locateElement("id", "createContactForm_personalTitle"), "Mrs");
		type(locateElement("id", "createContactForm_generalProfTitle"), "IT");
		type(locateElement("id", "createContactForm_departmentName"), "Testing");
		selectDropDownUsingText(locateElement("id", "createContactForm_preferredCurrencyUomId"), "INR - Indian Rupee");

		type(locateElement("id", "createContactForm_description"), "Automation Test");
		type(locateElement("id", "createContactForm_importantNote"), "Important Note");

		// Contact Information

		type(locateElement("id", "createContactForm_primaryPhoneCountryCode"), "91");
		type(locateElement("id", "createContactForm_primaryPhoneAreaCode"), "044");
		type(locateElement("id", "createContactForm_primaryPhoneNumber"), "9962677796");
		type(locateElement("id", "createContactForm_primaryPhoneExtension"), "12");
		type(locateElement("id", "createContactForm_primaryPhoneAskForName"), "Chithra");
		type(locateElement("id", "createContactForm_primaryEmail"), "vijayachithraa@gmail.com");

		// Primary Address
		WebElement ele =locateElement("id","generalToNameField");
		String newname=ele.getAttribute("value");
		System.out.println("new name to be verified is "+newname);
		
		verifyExactAttribute(ele,"value",finalName);
		
		
		type(locateElement("id", "createContactForm_generalAttnName"), "VijayaChithra");
		type(locateElement("id", "createContactForm_generalAddress1"), "Thiruvanmiyur");
		type(locateElement("id", "createContactForm_generalAddress2"), "RTO");
		type(locateElement("id", "createContactForm_generalCity"), "CHENNAI");

		selectDropDownUsingText(locateElement("id", "createContactForm_generalCountryGeoId"), "India");

		Thread.sleep(8000);

		selectDropDownUsingText(locateElement("id", "createContactForm_generalStateProvinceGeoId"), "TAMILNADU");
		type(locateElement("id", "createContactForm_generalPostalCode"), "600041");
		type(locateElement("id", "createContactForm_generalPostalCodeExt"), "600041");

		click(locateElement("class", "smallSubmit"));

		

	}

}
