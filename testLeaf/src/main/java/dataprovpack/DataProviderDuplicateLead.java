package dataprovpack;

import org.testng.annotations.DataProvider;

public class DataProviderDuplicateLead {
	
	@DataProvider(name="duplicateData")
	public  Object[] getData(){
		
		Object [] data= new Object[2];
		
		data[0]="G";
		data[1]="a";
		
		return data;
		
	}
	
	
	

}

