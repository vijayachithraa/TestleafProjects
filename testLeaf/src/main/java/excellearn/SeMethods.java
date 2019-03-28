package excellearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import wdMethods.WdMethods;

public class SeMethods1 implements WdMethods {

	int i = 1;
	RemoteWebDriver driver = null;
	WebElement ele = null;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser " + browser + " Launched successfully");
		}

		catch (WebDriverException e) {

			System.out.println("Driver does not exist");
			throw new RuntimeException();

		}


	}

	public void startApp(String browser) {
		try{

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			System.out.println("Browser Driver defined successfully");
			}
			catch (WebDriverException e) {

				System.out.println("Driver does not exist ");
				throw new RuntimeException();

			}

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
			case "linktext":
				ele = driver.findElementByLinkText(locValue);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} 

		return ele;
	}

	public WebElement locateElement(String locValue) {
		
		//ele=driver.findElementByLinkText(locValue);

		return ele;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Given Value :"+data+" Is Entered Successfully");
		} catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException();
		}
		finally{
			takeSnap();
		}

	}

	public void click(WebElement ele) {
		try{
			ele.click();
			System.out.println("Element is Clicked Successfully");
		}
		finally{
			takeSnap();
		}	


	}

	public String getText(WebElement ele) {

		String str=null;
		try{
			str=ele.getText();
		}

		finally{
			takeSnap();
		}
		return str;

	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropdownText;
		try{
			 dropdownText=new Select(ele);
			dropdownText.selectByVisibleText(value);
		}
		catch(NotFoundException e){
			System.err.println("Element dropdown not found");
			throw new RuntimeException();
		}
		finally{
			takeSnap();
		}


	}
	

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdownIndex;
		try{
			dropdownIndex =new Select(ele);		
			dropdownIndex.selectByIndex(index);
		}
		catch(NotFoundException e){
			System.err.println("Element dropdown not found");
			throw new RuntimeException();
		}
		finally{

			takeSnap();}

	}

	public boolean verifyTitle(String expectedTitle) {
		boolean result = false;
		try {
			String title=driver.getTitle();
			System.out.println("Title is ..."+title);

			if(title.contains(expectedTitle)){
				result =true;
				System.out.println("Title verified successfully");
			}
			else{
				result= false;
				System.out.println("Title not verified");
			}
		} catch (WebDriverException e) {

			System.err.println("Driver does not exist");
			throw new RuntimeException();
		}
		finally{
			takeSnap();
		}
		return result;

	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String exactText;
		try {
			exactText=ele.getText();
			if((exactText).equals(expectedText)){
				System.out.println("verification successful");
			}
			else{
				System.out.println("verification not successful");
			}
		} catch (NoSuchElementException e) {
			System.err.println ("element not found ");
			throw new RuntimeException();

		}
		finally{
			takeSnap();
		}


	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String partialText;
		try{
			partialText= ele.getText();
			if(partialText.contains(expectedText)){
				System.out.println("verification of partial text successful");
			}
			else{
				System.out.println("verification of partial text not successful");
			}

		}catch (NoSuchElementException e) {
			System.err.println ("element not found ");
			throw new RuntimeException();	
		}
		finally{
			takeSnap();
		}


	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
String attributeText;
		
		try{
			attributeText =ele.getAttribute(attribute);
			if(attributeText.equals(value)){
				System.out.println("exact attribute verified");
			}
			else{
				System.out.println("exact attribute not verified");
			}
		}
		catch (NoSuchElementException e) {
			System.err.println ("element not found ");
			throw new RuntimeException();

		}

		finally{
			takeSnap();
		}


	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String partialAttributeText;
		try{
			partialAttributeText=ele.getAttribute(attribute);
			if(partialAttributeText.contains(value)){
				System.out.println("partial attribute verified");
			}
			else{
				System.out.println("partial attribute not verified");
			}
		}
		catch (NoSuchElementException e) {
			System.err.println ("element not found ");
			throw new RuntimeException();
		}
		finally{
			takeSnap();
		}


	}

	public void verifySelected(WebElement ele) {
		boolean result=ele.isSelected();
		try{
			if(result){
				System.out.println("webelement is Selected");
			}
			else{
				System.out.println("webelement is not selected");
			}
		}
		catch (NoSuchElementException e) {
			System.err.println ("element not found ");
			throw new RuntimeException();	
		}
		finally{
			takeSnap();
		}


	}

	public void verifyDisplayed(WebElement ele) {
		boolean result=ele.isDisplayed();
		try{
			if(result){
				System.out.println("webelement is displyed");
			}
			else{
				System.out.println("webelement is not displayed");
			}
		}
		catch(NoSuchElementException e) {
			System.err.println ("element not found ");
			throw new RuntimeException();	
		}
		finally{
			takeSnap();
		}


	}

	public void switchToWindow(int index) {
		try{
			Set<String> allWindows= driver.getWindowHandles();
			List<String> allHandles=new ArrayList<String>();

			allHandles.addAll(allWindows);
			driver.switchTo().window(allHandles.get(index));
			System.out.println("Switched to window "+index);
		}
		catch(NoSuchWindowException e){
			System.err.println("No such window found ");
			throw new RuntimeException();
		}
		catch(Exception e){
			System.err.println("Exception thrown in windows ");
			throw new RuntimeException();
		}
		finally{
			takeSnap();
		}


	}

	public void switchToFrame(WebElement ele) {
		try{
			driver.switchTo().frame(ele);
			System.out.println("Switched to new frame");}
		catch(NoSuchElementException e){
			System.err.println("No such element found");
			throw new RuntimeException();
		}
		catch(NotFoundException e){
			System.err.println("Not found Exception ");
			throw new RuntimeException();
		}
		finally{
			takeSnap();
		}


	}

	public void acceptAlert() {
		Alert alert;
		try{

			alert =driver.switchTo().alert();
			alert.accept();
		}
		catch(NoAlertPresentException e){
			System.out.println("No such alert present");
			throw new RuntimeException();
		}
		catch(NotFoundException e){
			System.err.println("Alert not found");
			throw new RuntimeException();
		}



	}

	public void dismissAlert() {
		Alert alert; 
		try{
			alert =driver.switchTo().alert();
			alert.dismiss();
		}
		catch(NoAlertPresentException e){
			System.out.println("No such alert present");
			throw new RuntimeException();
		}
		catch(NotFoundException e){
			System.err.println("Alert not found");
			throw new RuntimeException();
		}


	}

	public String getAlertText() {
		Alert alert;
		String alertText= null;
		try{
			alert =driver.switchTo().alert();
			alertText=alert.getText();
			System.out.println("Text present inalert is "+alertText);
		}
		catch(NoAlertPresentException e){
			System.out.println("No such alert present");
			throw new RuntimeException();
		}
		return alertText;

	}

	public void takeSnap() {
		/*try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./snaps/snap" + i + ".jpeg");

			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();

		}

		catch (WebDriverException e) {

			System.err.println("Driver does not exist");
			throw new RuntimeException();
		}
		i++;
*/
	}

	public void closeBrowser() {
		try{
			driver.close();
			System.out.println("Browser closed successfully");
		}
		catch(WebDriverException e){
			System.err.println("Driver not found");
			throw new RuntimeException();
		}


	}

	public void closeAllBrowsers() {
		try{
			driver.quit();
			System.out.println("All browsers closed successfully");
		}
		catch(WebDriverException e){
			System.err.println("Driver not found");
			throw new RuntimeException();
		}


	}

}
