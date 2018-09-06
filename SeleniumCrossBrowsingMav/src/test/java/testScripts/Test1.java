package testScripts;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FacebookPO;
import pom.GooglePO;

public class Test1 extends BaseTest {
	@Test
	public void facebookTest() throws InterruptedException {
		try {
			GooglePO gle=new GooglePO(driver);
			gle.Googlesearch("facebook");
			FacebookPO facebookPO=new FacebookPO(driver);
			Reporter.log("Total no of Links:"+facebookPO.allLinksSize(),true);
			String eTitle="facebook - Google Search";
			facebookPO.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			Reporter.log("Exception generated",true);
			Assert.fail();
		}
		
	}

}
