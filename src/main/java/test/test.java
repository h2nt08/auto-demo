package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class test {
 public WebDriver driver;
	
 @BeforeMethod
 public void beforeTest(){
	 
 }
 @AfterMethod
 public void afterTest(){
	 
 }

 @Test
 public void test01(){
	 String s = System.getProperty("browser");
	 if (s.equalsIgnoreCase("ff")){ 
		 driver = new FirefoxDriver();
	 } else {

		 System.setProperty("webdriver.ie.driver", "C:\\workspace\\auto-demo\\IEDriverServer.exe");
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		 caps.setCapability("ignoreZoomSetting", true);
		 driver = new InternetExplorerDriver(caps);
	 }
	 driver.get("www.google.com.vn");
 }
}
