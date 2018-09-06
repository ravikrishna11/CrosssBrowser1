package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements Constants {
	public WebDriver driver;
	@BeforeMethod
	@Parameters("mBrowser")
	public void init(String mBrowser) {
		if(mBrowser.equalsIgnoreCase("chrome")) {
		   System.setProperty(CHROME_KEY, CHROME_PATH);
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get(TEST_URL);
		}
		else if(mBrowser.equalsIgnoreCase("firefox")) {
			   System.setProperty(GEKCO_KEY, GEKCO_PATH);
			   driver=new FirefoxDriver();
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   driver.get(TEST_URL);
			}
		
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
