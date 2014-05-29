package lqas.patterns.tests.about;

import org.testng.Assert;
import lqas.patterns.pages.AboutPage;
import lqas.patterns.testbase.TestBase;

import org.testng.annotations.Test;

public class AboutPageTests extends TestBase{
	
	@Test
	public void thirdTest() throws InterruptedException{
		AboutPage about = loginPage.loginToHomePage("111", "blabla@yahoo.com").openAboutPage();
		Assert.assertTrue(about.isAboutPageViewOk());
	}

}
