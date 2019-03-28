package excellearn;

import org.apache.xml.dtm.ref.ExtendedType;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreatehtmlReports {
	
	@Test
	public void Report()
	{
		ExtentReports report = new ExtentReports("./reports/report.html");
		ExtentTest test = report.startTest("createLead", "create a lead");
		test.assignAuthor("Chitra");
		test.assignCategory("Smoke Test ");
		test.log(LogStatus.PASS, "Launch Browser"," Browser Launched successfully");
		report.endTest(test);
		report.flush();
		
		
	}

}
