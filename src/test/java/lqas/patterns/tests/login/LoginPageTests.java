package lqas.patterns.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import lqas.patterns.testbase.TestBase;

public class LoginPageTests extends TestBase{
	
	@Test
	public void firstTest(){
		//example of elements usage without separate method
		Assert.assertTrue(loginPage.loginTextField.isPresentOnPage());
	}

}
