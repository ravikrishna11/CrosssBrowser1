package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePO;
import pom.IntagramPO;

public class Test2 extends BaseTest{
	@Test
	public void intagramTest() {
		try {
			GooglePO googlePO=new GooglePO(driver);
			googlePO.Googlesearch("instagram");
			IntagramPO intagramPO=new IntagramPO(driver);
			Reporter.log("Total no of Links:"+intagramPO.allLinksSize(),true);
			String eTitle="instagram - Google Search";
			intagramPO.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			Reporter.log("Exception generated",true);
			Assert.fail();
		}
	
}
}