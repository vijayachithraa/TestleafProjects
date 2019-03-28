package dataprovpack;

import org.testng.annotations.DataProvider;

public class DataProviderMergeLead {
	
	@DataProvider(name="mergeData")
	public  Object[] getData(){
		
Object [][] data= new Object[2][2];
		
		data[0][0]="10301";
		data[0][1]="10304";
		
		data[1][0]="10305";
		data[1][1]="10307";
		
		return data;
		
	}
	
	
	

}