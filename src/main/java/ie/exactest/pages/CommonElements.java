package ie.exactest.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;





public class CommonElements {
	PageAbout objAbout;
	
	public static final String PAGE_URL_IE = "www.exactest.ie";
	public static final String PAGE_TITLE_IE = "Software Testing Services - Exactest";
	
	public static final String PAGE_URL_UK = "www.exactest.co.uk";
	public static final String PAGE_TITLE_UK = "Software Testing Services - Exactest";
	
	
	public static final String PAGE_URL = "http://www.exactest.ie/testimonials.html";
	public static final String PAGE_TITLE = "Software Testing Services - Exactest";

	public static final String ISEB_TITLE = "";
	public static final String MICROFOCUS_TITLE = "App Dev, Test, and Delivery Market Space | Micro Focus";
	public static final String SOFTTEST_TITLE = "Soft Test Ireland | The Irish Software Testing Special Interest Group";
	public static final String SMARTBEAR_TITLE = "SmartBear Software Partners Program";
	
	public static final String LINKEDIN_TITLE_R = "Exactest: Overview | LinkedIn";
	public static final String LINKEDIN_TITLE_U = "Exactest | LinkedIn";	
		

	public void clickElements(WebElement element){
		
		element.click();
		
	}
	public boolean verifyElementIsPresent(WebElement element){
		try{
			element.getTagName();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public void  getElementByCss(WebElement element) {	
	}
	

	
}
