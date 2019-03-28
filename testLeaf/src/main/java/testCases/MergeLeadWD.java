package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MergeLeadWD extends ProjectMethods {

	@Test(groups="sanity",dependsOnGroups="smoke", dataProvider="mergeData", dataProviderClass=dataprovpack.DataProviderMergeLead.class)
	public void MergeLead(String fromleadid,String toleadid) throws InterruptedException {
		

		try {
			click(locateElement("linktext","Leads"));
			click(locateElement("linktext","Merge Leads"));
			 //From Lead
			click(locateElement("xpath","//a/img[@src='/images/fieldlookup.gif']"));
			switchToWindow(1);
			Thread.sleep(2000);
			type(locateElement("xpath", "//div/input[@name='id']"), fromleadid);
			click(locateElement("xpath", "//button[@type='button']"));		
			Thread.sleep(9000);		
			WebElement firstnameEle=locateElement("xpath","//a[@class='linktext'][1]");
			//String firstname = firstnameEle.getText();
			click(firstnameEle);
			
			
			switchToWindow(0); 
			
			//To Lead

			click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
			switchToWindow(1);
			Thread.sleep(2000);
			type(locateElement("xpath", "(//div[@class='x-form-element']/input)[1]"), toleadid);
			
			click(locateElement("xpath", "//button[@type='button']"));		
			Thread.sleep(3000);
			click(locateElement("xpath", "//a[@class='linktext']"));
			switchToWindow(0);
			
			click(locateElement("xpath", "//a[@class='buttonDangerous']"));		
			acceptAlert();		
			click(locateElement("linktext","Find Leads"));
			Thread.sleep(3000);
			
			
			//To verify error message
			
			String resultText=getText(locateElement("xpath","(//div[@class='x-paging-info'])[1]"));		
			System.out.println("Result Text is "+resultText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	
		
		
		
		
		
		
		
	
				
					
					
	
		
		
		
		
		
	}

}



