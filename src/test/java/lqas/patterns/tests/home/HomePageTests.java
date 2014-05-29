package lqas.patterns.tests.home;

import org.testng.Assert;
import org.testng.annotations.Test;

import lqas.patterns.pages.HomePage;
import lqas.patterns.testbase.TestBase;

public class HomePageTests extends TestBase{
	
	@Test
	public void secondTest() throws InterruptedException{
		HomePage home = loginPage.loginToHomePage("111", "blabla@yahoo.com");
		Assert.assertTrue(home.checkTheButtonIsPresentOnTopMenu());
	}

}
