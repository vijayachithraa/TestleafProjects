package dataprovpack;

import org.testng.annotations.DataProvider;

public class DataProviderDeleteLead {
	
	@DataProvider(name="deleteData")
	public  Object[] editData(){
		
		Object [] data= new Object[2];
		
		data[0]="d";
		data[1]="a";
		
		return data;
		
	}
	
	
	

}