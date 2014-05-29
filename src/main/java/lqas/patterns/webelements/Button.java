package lqas.patterns.webelements;

public class Button extends WebControlElement{
	
	String buttonWebElement;

	public Button(String buttonWebElement) {
		super();
		this.buttonWebElement = buttonWebElement; 
	}

	public String getButtonWebElement() {
		return buttonWebElement;
	}

	public void setButtonWebElement(String buttonWebElement) {
		this.buttonWebElement = buttonWebElement;
	}

	@Override
	public String getText() {
		return "button Text";
	}

	@Override
	public void click() {
		System.out.println(getButtonWebElement() + " is clicked");
	}

	@Override
	public void type(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPresentOnPage() {
		if (getButtonWebElement().isEmpty()){
			return false;
		}
		else return true;
	}
	
	
	

}
