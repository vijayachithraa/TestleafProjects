package excellearn;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelGetDataCreateLead {
	
	public String[][] readExcel()throws Exception{
	
	//public static void main(String[] args) throws Exception {
		
	String data[][] = null;
	File file1=new File("./excelfolder/createleadExcelData.xlsx");
	
	
	XSSFWorkbook workbook = new XSSFWorkbook(file1);
	XSSFSheet sheet= workbook.getSheetAt(0);
	
	int rowcount=sheet.getLastRowNum();
	for(int i=1;i<=rowcount;i++){
		XSSFRow row= sheet.getRow(i);
		int columncount=sheet.getRow(i).getLastCellNum();
		data=new String[rowcount][columncount];	
	for(int j=0;j<columncount;j++){		
		XSSFCell cell=row.getCell(j);
		String str=cell.getStringCellValue();
		data[i-1][j]=str;
		
	}
		
	}
	
	return data;
 
	}
	
	
	@DataProvider(name="ExcelGetDataCreateLead")
	public  Object[] getData(){
		
		ExcelGetDataCreateLead obj=new ExcelGetDataCreateLead();
		String[][] data1=obj.readExcel();
		
		
		return data1;
		
	}
	

}
