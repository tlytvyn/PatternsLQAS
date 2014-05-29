package lqas.patterns.pages;

import lqas.patterns.automationdriver.AutomationDriver;

public abstract class Page {
	
	protected AutomationDriver driver;

	public Page(AutomationDriver driver) {
		super();
		this.driver = driver;
	}

	public AutomationDriver getDriver() {
		return driver;
	}
	
	public static void waitForNextPageToLoad() throws InterruptedException{
		Thread.sleep(3000);
	}
}
