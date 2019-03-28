package dataprovpack;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	
	@DataProvider(name="fetchData")
	public static Object[][] getData(){
		
		Object [][] data= new Object[2][12];
		
		data[0][0]="vijaya";
		data[0][1]="chitra";
		data[0][2]="HCL Tech";
		data[0][3]="Cold Call";
		data[0][4]=2;
		data[0][5]="datatest";
		data[0][6]="dataproviders";
		data[0][7]="Selenium";
		data[0][8]="IT";
		data[0][9]="50000";
		data[0][10]="Finance";
		data[0][11]="Partnership";
		
		data[1][0]="danvanth";
		data[1][1]="C";
		data[1][2]="Maveric";
		data[1][3]="Website";
		data[1][4]=6;
		data[1][5]="karthi";
		data[1][6]="praveen";
		data[1][7]="java";
		data[1][8]="csc";
		data[1][9]="25000";
		data[1][10]="Aerospace";
		data[1][11]="Corporation";
		
		return data;
		
	}
	
	
	

}
