package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class FacebookPO extends BasePage {
	
	public FacebookPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a")
	  private List<WebElement> allLinks;
	  public int allLinksSize() {
		  return allLinks.size();
	  }
	  @FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	  private WebElement fbSrchResink;
	  public WebElement fbSrchResLink(){
		 return fbSrchResink;
	  }

}
