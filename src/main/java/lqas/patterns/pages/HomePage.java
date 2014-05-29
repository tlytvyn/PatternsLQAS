package lqas.patterns.pages;

import lqas.patterns.automationdriver.AutomationDriver;
import lqas.patterns.webelements.WebControlElement;
import lqas.patterns.webelements.WebElementControlFactory;

public class HomePage extends Page{

	public HomePage(AutomationDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebControlElement aboutPageButton = WebElementControlFactory.getWebElementControlOnPage("button");
	WebControlElement topMenuButton = WebElementControlFactory.getWebElementControlOnPage("button");
	
	public AboutPage openAboutPage() throws InterruptedException{
		aboutPageButton.click();
		waitForNextPageToLoad();
		return new AboutPage(driver);
	}
	
	public boolean checkTheButtonIsPresentOnTopMenu(){
		return topMenuButton.isPresentOnPage();
	}
}
