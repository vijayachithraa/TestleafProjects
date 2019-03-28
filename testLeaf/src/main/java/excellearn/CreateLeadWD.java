package excellearn;

import org.testng.annotations.Test;

public class CreateLead extends ProjectMethods{ 

	
	@Test(groups="smoke", dataProvider="fetchData", dataProviderClass=dataprovpack.LearnDataProvider.class)
	
	public void createLead(String cName,String fName,String lName,String sdropdown, int mdropdown,String fNameLocal,String lNameLocal,String title,String deptName,String revenue,String idropdown,String odropdown ) throws InterruptedException {

		click(locateElement("linktext","Create Lead"));

		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		
		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), sdropdown);
		selectDropDownUsingIndex(locateElement("id","createLeadForm_marketingCampaignId"),mdropdown);
		
		type(locateElement("id", "createLeadForm_firstNameLocal"), fNameLocal);
		type(locateElement("id", "createLeadForm_lastNameLocal"), lNameLocal);
		type(locateElement("id", "createLeadForm_personalTitle"), title);
		type(locateElement("id", "createLeadForm_departmentName"), deptName);
		type(locateElement("id", "createLeadForm_annualRevenue"), revenue);
		
		selectDropDownUsingText(locateElement("id", "createLeadForm_industryEnumId"), idropdown);
		selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"),odropdown);
		
		
		
		/*
		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), "Automobile");

		type(locateElement("id", "createLeadForm_firstNameLocal"), "Vijaya");
		type(locateElement("id", "createLeadForm_lastNameLocal"), "Chithra");
		type(locateElement("id", "createLeadForm_personalTitle"), "Mrs");
		type(locateElement("id", "createLeadForm_departmentName"), "IT");
		type(locateElement("id", "createLeadForm_annualRevenue"), "500000");

		selectDropDownUsingText(locateElement("id", "createLeadForm_industryEnumId"), "Computer Hardware");
		selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), "Sole Proprietorship");

		type(locateElement("id", "createLeadForm_numberEmployees"), "50");
		type(locateElement("id", "createLeadForm_sicCode"), "5123");
		type(locateElement("id", "createLeadForm_tickerSymbol"), "Symbol");
		type(locateElement("id", "createLeadForm_description"), "Automation Test");
		type(locateElement("id", "createLeadForm_importantNote"), "Class Notes");
		type(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), "91");
		type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), "044");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9962677796");
		type(locateElement("id", "createLeadForm_primaryPhoneExtension"), "12");
		type(locateElement("id", "createLeadForm_primaryPhoneAskForName"), "Chithra");
		type(locateElement("id", "createLeadForm_primaryEmail"), "vijayachithraa@gmail.com");
		type(locateElement("id", "createLeadForm_primaryWebUrl"), "www.gmail.com");
		type(locateElement("id", "createLeadForm_generalToName"), "Chithra");
		type(locateElement("id", "createLeadForm_generalAttnName"), "VijayaChithra");
		type(locateElement("id", "createLeadForm_generalAddress1"), "Thiruvanmiyur");
		type(locateElement("id", "createLeadForm_generalAddress2"), "RTO");
		type(locateElement("id", "createLeadForm_generalCity"), "CHENNAI");

		selectDropDownUsingText(locateElement("id", "createLeadForm_generalCountryGeoId"), "India");

		Thread.sleep(5000);

		selectDropDownUsingText(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), "TAMILNADU");
		type(locateElement("id", "createLeadForm_generalPostalCode"), "600041");
		type(locateElement("id", "createLeadForm_generalPostalCodeExt"), "600041");
*/
		Thread.sleep(3000);
		click(locateElement("xpath","//input[@class='smallSubmit']"));
		

	}

}
