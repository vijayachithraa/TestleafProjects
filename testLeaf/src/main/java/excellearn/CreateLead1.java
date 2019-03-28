package excellearn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead1 extends ProjectMethods1{ 


	@Test(dataProvider="excelCreateLead")

	public void createLead(String cName,String fName,String lName,String sdropdown, int mdropdown,String fNameLocal,String lNameLocal,String title,String deptName,String revenue,String idropdown,String odropdown ) throws InterruptedException {

		click(locateElement("linktext","Create Lead"));

		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);

		Thread.sleep(3000);
		click(locateElement("xpath","//input[@class='smallSubmit']"));

	}

}
