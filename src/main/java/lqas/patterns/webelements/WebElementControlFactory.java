package lqas.patterns.webelements;

public class WebElementControlFactory {
	
	public static WebControlElement getWebElementControlOnPage(String elementType)
	  {
	    if (elementType.equals("button") )
	      return new Button(elementType);
	    else if (elementType.equals("textfield") )
	      return new TextField(elementType);
	    return null;
	  }

}
