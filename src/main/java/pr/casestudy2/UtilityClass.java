package pr.casestudy2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilityClass {
	 static WebDriver driver;
	   public static WebDriver openBrowser(String browsername) 
	   {
		   if(browsername.equalsIgnoreCase("Chrome"))
		   {
			   System.setProperty("webdriver.chrome.driver", "C:\\RAHUL3054\\chromedriver.exe");
			   driver=new ChromeDriver();
		   }
		   else if(browsername.equalsIgnoreCase("Ie"))
		   {
			   System.setProperty("webdriver.ie.driver", "C:\\RAHUL3054\\IEDriverServer.exe");
			   driver=new InternetExplorerDriver();
		   }
		return driver;
		   
	   }

}
