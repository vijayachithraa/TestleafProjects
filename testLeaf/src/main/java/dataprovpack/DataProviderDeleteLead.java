package dataprovpack;

import org.testng.annotations.DataProvider;

public class DataProviderDeleteLead {
	
	@DataProvider(name="deleteData")
	public  Object[] getData(){
		
Object [] data= new Object[1];
		
		data[0]="91";
		
		
		return data;
		
	}
	
	
	

}