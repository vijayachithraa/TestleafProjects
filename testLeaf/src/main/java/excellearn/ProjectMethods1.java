package excellearn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods1 extends SeMethods1{

	@Parameters({"browser","URL","uName","pwd"})
	@BeforeMethod(groups="common")
	public void login(String browser,String URL, String uName,String pwd)
	{
		try {
			startApp(browser, URL);		
			
			type(locateElement("id","username"),uName);		
			type(locateElement("id", "password"), pwd);
			click(locateElement("class", "decorativeSubmit"));
			click(locateElement("linktext","CRM/SFA"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@AfterMethod
	public void close()
	{
		closeBrowser();
	}

}
