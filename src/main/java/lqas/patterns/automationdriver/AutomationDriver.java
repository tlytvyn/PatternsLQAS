package lqas.patterns.automationdriver;

public class AutomationDriver {

	private String driverType;

	public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public AutomationDriver(String driverType) {
		super();
		this.driverType = driverType;
	}

	public void openUrl(String websiteUrl) {
		System.out.println("opening " + websiteUrl);
	}
	
}
