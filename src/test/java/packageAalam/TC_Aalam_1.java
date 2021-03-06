 package packageAalam;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class TC_Aalam_1 {		
	    private WebDriver driver;	
	    @BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "D:\\SaiWorkSpace\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();  
			
		}
	   
	    @Test(priority = 0)			
		public void test0() {	
			driver.get("https://aalamsoft.com/");  
			String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Aalam Info Solutions | Aalam")); 		
		}	
			
	    @Test(priority = 1)				
		public void test1() {	
			driver.get("https://aalamsoft.com/");  
			String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Aalam Info Solutions | Aalam")); 		
		}	
	    
	    @Test(priority = 2)				
		public void test2() {	
			driver.get("https://aalamsoft.com/");  
			String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Aalam Info Solutions | Aalam")); 		
		}	
			
	    @Test(priority = 3)				
	 		public void test3() {	
	 			driver.get("https://aalamsoft.com/");  
	 			String title = driver.getTitle();				 
	 			AssertJUnit.assertTrue(title.contains("Aalam Info Solutions | Aalam")); 		
	 		}	
	 			
	    @Test(priority = 4)				
 		public void test4() {	
 			driver.get("https://aalamsoft.com/");  
 			String title = driver.getTitle();				 
 			AssertJUnit.assertTrue(title.contains("Aalam Info Solutions | Aalam")); 		
 		}	
	    
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}