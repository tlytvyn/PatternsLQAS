package lqas.patterns.automationdriver;

public class AutomationDriverFactory {
	
	private static AutomationDriver driver;
	
	private AutomationDriverFactory(){};
	
	public static AutomationDriver getInstance(String browserName){
		if (driver == null){
			driver = new AutomationDriver("firefox");
		}
		else if (browserName.equals("chrome")){
			driver = new AutomationDriver("chrome");
		}
		else if (browserName.equals("firefox")){
			driver = new AutomationDriver("firefox");
		}
		else if (browserName.equals("android")){
			driver = new AutomationDriver("android");
		}
		
		return driver;
	}
	
	public static void killInstance(){
		driver = null;
	}

}
