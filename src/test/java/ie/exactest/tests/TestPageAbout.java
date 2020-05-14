package ie.exactest.tests;

import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ie.exactest.services.ImageValidator;
import ie.exactest.config.Configurations;
import ie.exactest.pages.CommonElements;
import ie.exactest.pages.PageAbout;
import ie.exactest.pages.PageTestimonials;
import ie.exactest.pages.PageContact;
import ie.exactest.pages.PageHome;


public class TestPageAbout {		
	
	WebDriver driver;	
	PageAbout objAboutPage;	
	ImageValidator imageValidator = new ImageValidator();
	Configurations conf = new Configurations();
	/*
	 * Initiate Web Driver before each an every Test
	 * */
	@Before
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", conf.getPropValues("driver_path"));
		 
	}
	
	/*
	 * Common step for all tests cases in @TS001_HOME_PAGE
	 * Navigate to Home Page
	 * */
	@Given("^Browser opened about$")
	public void navigate_to_about() {
		driver = new ChromeDriver(); 
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		objAboutPage = PageFactory.initElements(driver, PageAbout.class);		
		driver.get(PageAbout.PAGE_URL);	
		
	}
	
	
	/*
	 * @TC001_HOME_CONTENTS
  	 * Verify Text Format, Images, Contents and Spellings are correct
	 * */
	
	@Then("^Verify Text Format, Images, Contents and Spellings are correct on about page$")
	public void test_verify_image_textformat_text_spelling_content(){	
		
		/* Find all <img> tags and verify them */
		boolean verifyImg=false;		
		
		try {

			List<WebElement> imagesList = driver.findElements(By.tagName("img"));
			System.out.println("Total noumber of images : " + imagesList.size());

			for (WebElement imgElement : imagesList) {
				if (imgElement != null) {
					verifyImg=imageValidator.verifyimageActive(imgElement);
				}
				
				Assert.assertEquals(verifyImg, true,"Image Not Found : "+imgElement.getAttribute("src"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		/*  Verify Contents  */
		Assert.assertEquals(PageAbout.ELEM_PARA1.getText(), PageAbout.PARA_1);
		Assert.assertEquals(PageAbout.ELEM_PARA2.getText(), PageAbout.PARA_2);
		Assert.assertEquals(PageAbout.ELEM_PARA_JC.getText(), PageAbout.PARA_JC);
		Assert.assertEquals(PageAbout.ELEM_PARA_MM1.getText(), PageAbout.PARA_MM1);
		Assert.assertEquals(PageAbout.ELEM_PARA_MM2.getText(), PageAbout.PARA_MM2);
		Assert.assertEquals(PageAbout.ELEM_PARA_KB1.getText(), PageAbout.PARA_KB1);
		Assert.assertEquals(PageAbout.ELEM_PARA_KB2.getText(), PageAbout.PARA_KB2);
		Assert.assertEquals(PageAbout.ELEM_PARA_CK1.getText(), PageAbout.PARA_CK1);
		Assert.assertEquals(PageAbout.ELEM_PARA_CK2.getText(), PageAbout.PARA_CK2);	
		
		/*verify_text_format_font_weight_etc*/
		Assert.assertEquals(PageAbout.ELEM_H1.getCssValue("font-size"), "22px");
		Assert.assertEquals(PageAbout.ELEM_H1.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageAbout.ELEM_H1.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageAbout.ELEM_P.getCssValue("font-size"), "14px");
		Assert.assertEquals(PageAbout.ELEM_P.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageAbout.ELEM_H2.getCssValue("font-size"), "16px");
		Assert.assertEquals(PageAbout.ELEM_H2.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageAbout.ELEM_H2.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageAbout.ELEM_H5.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageAbout.ELEM_H5.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageAbout.ELEM_H5.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageAbout.ELEM_H5.getCssValue("text-transform"), "uppercase");
		
		Assert.assertEquals(PageAbout.ELEM_H4.getCssValue("font-size"), "13px");
		Assert.assertEquals(PageAbout.ELEM_H4.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageAbout.ELEM_H4.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageAbout.ELEM_FOOTER_CONTENT.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageAbout.ELEM_FOOTER_CONTENT.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageAbout.ELEM_FOOTER_CONTENT.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageAbout.ELEM_FOOTER_CONTENT.getCssValue("color"), "rgba(255, 255, 255, 1)");
			  
	}

	
	/*
	 * @TC002_HOME_LINKS
  	 * Verify HTML Links and Buttons on the site are linked to correct pages
	 * */
	@Then("^Verify HTML Links and Buttons on the about page are linked to correct pages$")
	public void test_verify_html_links_redirect_correct_page()throws Exception{
	
		
		objAboutPage.clickHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), PageHome.H3);
		driver.navigate().back();
		
		objAboutPage.clickAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageAbout.CLASSSLATEGRY);

		
		objAboutPage.clickServices();	
		objAboutPage.clickOurServices();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objAboutPage.clickServices();
		objAboutPage.clickStrategicTestManagement();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Strategic Test Management");
		driver.navigate().back();
		
		objAboutPage.clickServices();
		objAboutPage.clickTestAutomationPerformance();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Functional Test Automation and Performance");
		driver.navigate().back();
		
		objAboutPage.clickServices();
		objAboutPage.clickAcceptanceModelOffice();;
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Acceptance and Model Office Testing");
		driver.navigate().back();
		
		objAboutPage.clickServices();
		objAboutPage.clickIntegraionFunctionalTesting();;;
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Integration and Functional Testing");
		driver.navigate().back();
		
		objAboutPage.clickServices();
		objAboutPage.clickNonFunctionalTesting();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Non Functional Testing");
		driver.navigate().back();		

		objAboutPage.clickServices();
		objAboutPage.clickVerticals();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Verticals");
		driver.navigate().back();		
		
		objAboutPage.clickTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageTestimonials.SLATEGRAY);
		driver.navigate().back();		

		objAboutPage.clickCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");
		
		driver.navigate().back();
		
		objAboutPage.clickContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageContact.SLATEGRAY);
		driver.navigate().back();
		
		objAboutPage.clickNews();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "News");
		driver.navigate().back();
	
		//Verify bottom links redirect to correct page
		objAboutPage.clickBottomHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "SOFTWARE TESTING - SERVICES");
		driver.navigate().back();
					
		objAboutPage.clickBottomAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "About");
		
		objAboutPage.clickBottomService();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objAboutPage.clickBottomCasestudies();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Case Studies");
		driver.navigate().back();
		
		objAboutPage.clickBottomTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Testimonials");
		driver.navigate().back();
		
		objAboutPage.clickBottomCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");
		driver.navigate().back();
		
		objAboutPage.clickBottomContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		driver.navigate().back();
		
		objAboutPage.clickBottomprivacy();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Privacy Policy");
		driver.navigate().back();
		
		//LinkedIn
		objAboutPage.clickLinkedIn();
		objAboutPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest");
		driver.navigate().back();
		
		//Bottom map
		objAboutPage.clickMapIe();
		objAboutPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		driver.navigate().back();
		
		objAboutPage.clickMapUk();
		objAboutPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		driver.navigate().back();
		
		
	}

	/*
	 * @TC003_HOME_PARTNERS_CREDITATIONS
  	 * Verify PARTNERS & CREDITATIONS links are working
	 * */
	@Then("^Verify PARTNERS & CREDITATIONS links on the about page are working$")
	public void test_partner_and_creditation_links_redirect_correct_page()throws Exception{

		objAboutPage.clickMicroFocus();		
		objAboutPage.focusToCurrentTab();		
		Assert.assertEquals(driver.getTitle(), CommonElements.MICROFOCUS_TITLE);	
		driver.close();
		
		objAboutPage.focusToCurrentTab();
		objAboutPage.clickSoftTest();
		objAboutPage.focusToCurrentTab();
		Assert.assertEquals(driver.getTitle(), CommonElements.SOFTTEST_TITLE);
		driver.close();
		
		objAboutPage.focusToCurrentTab();
		objAboutPage.clickSmartBear();
		objAboutPage.focusToCurrentTab();
		Assert.assertEquals(driver.getTitle(), CommonElements.SMARTBEAR_TITLE);				
		
	}

	
	
	/*
	 * Close the Web Driver after Each Test
	 * */

	@After
	public void tearDown() {
		if(driver != null){
		driver.quit();
		}
	}

}


