package library;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	 public WebDriver driver;
	    public WebDriverWait wait;
	    public BasePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			wait=new WebDriverWait(driver, 20);
		}
		public void checkTitle(String title) {
	    	try {
				wait.until(ExpectedConditions.titleContains(title));
				Reporter.log("Title is matching",true);
			} catch (TimeoutException e) {
				Reporter.log("Title is not matching",true);
				
			}
	    }
	    public void checkWebelement(WebElement element) {
	    	try {
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("webelement is present",true);
			} catch (TimeoutException e) {
				Reporter.log("Webelement is not present",true);
			}
	    }

}
