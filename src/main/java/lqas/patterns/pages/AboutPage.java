package lqas.patterns.pages;

import lqas.patterns.automationdriver.AutomationDriver;
import lqas.patterns.webelements.WebControlElement;
import lqas.patterns.webelements.WebElementControlFactory;

public class AboutPage extends HomePage {

	public AboutPage(AutomationDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	WebControlElement sendFeedbackTextField = WebElementControlFactory.getWebElementControlOnPage("textfield");
	WebControlElement sendFeedbackOkButton = WebElementControlFactory.getWebElementControlOnPage("button");

	public boolean isAboutPageViewOk(){
		return (sendFeedbackOkButton.isPresentOnPage() && sendFeedbackTextField.isPresentOnPage());
	}
	
}
