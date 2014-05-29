package lqas.patterns.webelements;

public class TextField extends WebControlElement{
	
	String textFieldWebElement;

	public TextField(String textFieldWebElement) {
		super();
		this.textFieldWebElement = textFieldWebElement;
	}

	public String getTextFieldWebElement() {
		return textFieldWebElement;
	}

	public void setTextFieldWebElement(String textFieldWebElement) {
		this.textFieldWebElement = textFieldWebElement;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void type(String text) {
		setTextFieldWebElement(text);
	}

	@Override
	public boolean isPresentOnPage() {
		if (getTextFieldWebElement().isEmpty()){
			return false;
		}
		else return true;
	}

}
