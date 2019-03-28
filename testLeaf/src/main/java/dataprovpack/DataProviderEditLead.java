package dataprovpack;

import org.testng.annotations.DataProvider;

public class DataProviderEditLead {
	
	@DataProvider(name="editData")
	public  static Object[][] getData(){
		
		Object [][] data= new Object[1][2];
		
		data[0][0]="a";
		data[0][1]="HCL";
		
		return data;
		
	}
}

	
	
	

