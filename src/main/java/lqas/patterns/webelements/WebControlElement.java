package lqas.patterns.webelements;

public abstract class WebControlElement {

	public abstract String getText();
	public abstract void click();
	public abstract void type(String text);
	public abstract boolean isPresentOnPage();

}
