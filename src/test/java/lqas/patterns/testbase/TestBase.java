package lqas.patterns.testbase;

import lqas.patterns.automationdriver.AutomationDriver;
import lqas.patterns.automationdriver.AutomationDriverFactory;
import lqas.patterns.pages.LoginPage;
import lqas.patterns.pages.Page;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	protected AutomationDriver driver;
	protected String websiteUrl = "http://www.testers.lviv.ua";
	protected LoginPage loginPage;
	
	@BeforeMethod(alwaysRun = true)
	public void init() throws InterruptedException{	
		System.out.println("srarting new driver instance");
		driver = AutomationDriverFactory.getInstance("chrome");
		driver.openUrl(websiteUrl);		
		Page.waitForNextPageToLoad();
		loginPage = new LoginPage(driver);
	}
	
	@AfterMethod (alwaysRun = true)
	public void close(){
		AutomationDriverFactory.killInstance();
	}
}
