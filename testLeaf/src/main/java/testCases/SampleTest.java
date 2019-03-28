package testCases;

	
	import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	 
	public class SampleTest {
	 
		public static void main(String [] args) throws InterruptedException{
	                  //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
			
	//LAUNCHING CHROME BROWSER
	
	                  System.setProperty("webdriver.chrome.driver", "C:/d drive/dropbox/selenium/Selenium/drivers/chromedriver.exe");
	                  WebDriver driver = new ChromeDriver();
	                  driver.get("http://demo.guru99.com/test/newtours/register.php");
//	                  driver.manage().window().maximize();
	                  System.out.println("Launching chrome browser for guru99site");
	                  
	  //IMPLICIT WAIT
	                  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	                
	                  
	                
	  //SELECT DROPDOWN
	                  Select drpCountry = new Select(driver.findElement(By.name("country")));
	                  drpCountry.selectByVisibleText("INDIA");
	                  drpCountry.selectByValue("4");
	                  drpCountry.selectByIndex(1);
	                  
	   //MULTIPLE SELECTION IN THE DROPDOWN
	                  
	                  drpCountry.selectByVisibleText("INDIA");
	                  drpCountry.selectByValue("4");
	                  
	                  
	   //GETOPTIONS AND SIZE - TO FIND THE COUNT
	                   
	               Select dd = new Select(driver.findElement(By.id("yy_date_8")));
	               List <WebElement> elementCount = dd.getOptions();
	               int optionCount = elementCount.size();
	               System.out.println(optionCount);
	               dd.selectByIndex(optionCount - 1);
	                  
	  //TO PRINT  ALL THE VALUES IN DROPDOWN USING FOR LOOP
	               
	      
	               for(int i =0; i<optionCount ; i++){
	               String sValue = elementCount.get(i).getText();
	               System.out.println(sValue);
	               }
	               
	 //PRINT ALL VALUES USING FOR EACH LOOP
	               
	               for(WebElement eachoption : elementCount){
	            	   System.out.println(eachoption.getText());
	               }
 //ALERTS
	               
//SIMPLE ALERT
	               driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
	               driver.findElement(By.xpath("//*[@id='content']/button")).click();
	               Thread.sleep(3000);     
	        driver.switchTo().alert().accept(); 
	          
//CANCEL ALERT
	          
	          driver.switchTo().alert().dismiss();
	          
//ENTER TEXT FOR ALERT AND SENDKEYS
	          
	          Alert alert = driver.switchTo().alert();
	          String print= alert.getText();
	          System.out.println(print);
	          alert.sendKeys("sample text");
	          
//AUTHENTICATE ALERT
	          
	          
//	          alert.authenticateUsing(Credentials credentials)
	          
//FRAMES - TO FIND THE SIZE OF THE FRAMES
	          
	          driver.findElements(By.tagName("iframe")).size();
	          
//SWITCH TO FRAMES BY INDEX
	          
	          driver.switchTo().frame(0);
	          
//SWITCH TO FRAMES BY NAME
	          
	          driver.switchTo().frame("iframe1");
//SWITCH TO FRAMES BY ID
	          driver.switchTo().frame("id of the element");
	                    
	                   
//SWITCH TO FRAME BY WEBELEMENT
	          
	         String WebElement = null;
			driver.switchTo().frame(WebElement);
			
//SWITCH TO DEFAULT-- GOBACK
			
			 driver.switchTo().parentFrame();
			  driver.switchTo().defaultContent();
			  
//HOW TO FIND INDEX OF IFRAME /SIZE
			  
			  int size = driver.findElements(By.tagName("iframe")).size();

			    for(int i=0; i<=size; i++){
				driver.switchTo().frame(i);
				int total=driver.findElements(By.xpath("html/body/a/img")).size();
				System.out.println(total);
			    driver.switchTo().defaultContent();}
			
		
//NESTED FRAMES
			    
			    int size1 = driver.findElements(By.tagName("iframe")).size();
			    System.out.println("Total Frames --" + size1);
		               
				// prints the total number of frames 
				driver.switchTo().frame(0); // Switching the Outer Frame    		
			    System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

				//Printing the text in outer frame
				size1 = driver.findElements(By.tagName("iframe")).size();
			    // prints the total number of frames inside outer frame           
		                                                                                                          
			    System.out.println("Total Frames --" + size1);
			    driver.switchTo().frame(0); // Switching to innerframe
			    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
				
				//Printing the text in inner frame
				driver.switchTo().defaultContent();
			
	
//ALERT & FRAMES EXAMPLE
		
		
		
		driver.switchTo().frame("id");
		driver.findElement(By.xpath("")).click();
		Alert alert1= driver.switchTo().alert();
		String str= alert1.getText();
		System.out.println(str);
		
		String str1="danvanth-chithra";
		alert1.sendKeys(str1);
		System.out.println(str1);
		
		WebElement str2 = driver.findElement(By.xpath(""));
		System.out.println(str2);
		
//		if(str2.contains(str1)){
//			System.out.println("text match");
//			else{
//				System.out.println("text doesnt match");
//			}
//		}
		
		
// WINDOWS HANDLING FOR CURRENT WINDOW
		
		
		String MainWindow= driver.getWindowHandle();
		System.out.println(MainWindow);
		
//WINDOWS HANDLING FOR ALL NEW OPENED WINDOWS
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		for(String obj :handles){
			driver.switchTo().window(obj);
			
			
		}
		
		
		
		
		
	
	          
	          
	          
	          

	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	               
	       
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	               
	                  
	                  
	                  
	                  
	                  
	                  
	                
//	                  driver.get("http://jsbin.com/osebed/2");
//	                  driver.close();
	           }
	}


