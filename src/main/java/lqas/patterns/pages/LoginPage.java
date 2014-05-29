package lqas.patterns.pages;

import lqas.patterns.automationdriver.AutomationDriver;
import lqas.patterns.webelements.WebControlElement;
import lqas.patterns.webelements.WebElementControlFactory;

public class LoginPage extends Page {

	public LoginPage(AutomationDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebControlElement loginTextField = WebElementControlFactory.getWebElementControlOnPage("textfield");
	WebControlElement passTextField = WebElementControlFactory.getWebElementControlOnPage("textfield");
	WebControlElement signInButton = WebElementControlFactory.getWebElementControlOnPage("button");

	public HomePage loginToHomePage(String password, String email) throws InterruptedException{
		loginTextField.type(email);
		passTextField.type(password);
		signInButton.click();
		waitForNextPageToLoad();
		return new HomePage(driver);
	}
}
