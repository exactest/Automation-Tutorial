package ie.exactest.tests;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ie.exactest.pages.PageAbout;
import ie.exactest.config.Configurations;
import ie.exactest.pages.CommonElements;
import ie.exactest.pages.PageContact;
import ie.exactest.pages.PageHome;
import ie.exactest.pages.PageTestimonials;
import ie.exactest.services.ImageValidator;

public class TestPageTestimonials {
	WebDriver driver;
	ImageValidator imageValidator = new ImageValidator();
	PageTestimonials objTestimonialPage;
	Configurations conf = new Configurations();

	/*
	 * Initiate Web Driver before each an every Test
	 * */
	
	@Before
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", conf.getPropValues("driver_path"));
		 
	}
	
	/*
	 * Common step for all tests cases in @TS001_TESTImonial_PAGE
	 * Navigate to Testimonials Page
	 * */
	@Given("^Browser opened Testimonials$")
	public void navigate_to_testimonials() {
		driver = new ChromeDriver(); 
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		objTestimonialPage = PageFactory.initElements(driver, PageTestimonials.class);		
		driver.get(PageTestimonials.PAGE_URL);	
		
	}
	
	/*
	 * @TC001_TESTIMONIALS_CONTENTS
  	 * Verify Text Format, Images, Contents and Spellings are correct
	 * */
	
	@Then("^Verify Text Format, Images, Contents, Spellings of Testimonials are correct$")
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
	
		Assert.assertEquals(PageTestimonials.ELEM_METALIFE_PARA1.getText(), PageTestimonials.METLIFE1);
		Assert.assertEquals(PageTestimonials.ELEM_METALIFE_PARA2.getText(), PageTestimonials.METLIFE2);		
		Assert.assertEquals(PageTestimonials.ELEM_VODAFONE_PARA1.getText(), PageTestimonials.VODAF1);
		Assert.assertEquals(PageTestimonials.ELEM_VODAFONE_PARA2.getText(), PageTestimonials.VODAF2);		
		Assert.assertEquals(PageTestimonials.ELEM_SIRO_PARA1.getText(), PageTestimonials.SIRO1);
		Assert.assertEquals(PageTestimonials.ELEM_SIRO_PARA2.getText(), PageTestimonials.SIRO2);
		Assert.assertEquals(PageTestimonials.ELEM_MAYNOOTH_PARA1.getText(), PageTestimonials.MAYNOOTH1);
		Assert.assertEquals(PageTestimonials.ELEM_MAYNOOTH_PARA2.getText(), PageTestimonials.MAYNOOTH2);
		Assert.assertEquals(PageTestimonials.ELEM_AXALIFE_PARA1.getText(), PageTestimonials.AXA1);
		Assert.assertEquals(PageTestimonials.ELEM_AXALIFE_PARA2.getText(), PageTestimonials.AXA2);
		Assert.assertEquals(PageTestimonials.ELEM_IRISHLIFE_PARA1.getText(), PageTestimonials.IRISHLIFE1);
		Assert.assertEquals(PageTestimonials.ELEM_IRISHLIFE_PARA2.getText(), PageTestimonials.IRISHLIFE2);
		
		/*verify_text_format_font_weight_etc*/
		Assert.assertEquals(PageTestimonials.ELEM_H1.getCssValue("font-size"), "22px");
		Assert.assertEquals(PageTestimonials.ELEM_H1.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageTestimonials.ELEM_H1.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageTestimonials.ELEM_P.getCssValue("font-size"), "14px");
		Assert.assertEquals(PageTestimonials.ELEM_P.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageTestimonials.ELEM_H5.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageTestimonials.ELEM_H5.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageTestimonials.ELEM_H5.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageTestimonials.ELEM_H5.getCssValue("text-transform"), "uppercase");
		
		Assert.assertEquals(PageTestimonials.ELEM_H4.getCssValue("font-size"), "13px");
		Assert.assertEquals(PageTestimonials.ELEM_H4.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageTestimonials.ELEM_H4.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageTestimonials.ELEM_FOOTER_CONTENT.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageTestimonials.ELEM_FOOTER_CONTENT.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageTestimonials.ELEM_FOOTER_CONTENT.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageTestimonials.ELEM_FOOTER_CONTENT.getCssValue("color"), "rgba(255, 255, 255, 1)");
			  
	}
	
	/*
	 * @TC002_TESTIMONIALS_LINKS
  	 * Verify HTML Links and Buttons on the site are linked to correct pages
	 * */
	@Then("^Verify HTML Links and Buttons on the Testimonials site are linked to correct pages$")
	public void test_verify_html_links_redirect_correct_page()throws Exception{
	
		
		objTestimonialPage.clickHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), PageHome.H3);
		driver.navigate().back();
		
		objTestimonialPage.clickAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageAbout.CLASSSLATEGRY);
		driver.navigate().back();
		
		objTestimonialPage.clickServices();	
		objTestimonialPage.clickOurServices();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objTestimonialPage.clickServices();
		objTestimonialPage.clickStrategicTestManagement();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Strategic Test Management");
		driver.navigate().back();
		
		objTestimonialPage.clickServices();
		objTestimonialPage.clickTestAutomationPerformance();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Functional Test Automation and Performance");
		driver.navigate().back();
		
		objTestimonialPage.clickServices();
		objTestimonialPage.clickAcceptanceModelOffice();;
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Acceptance and Model Office Testing");
		driver.navigate().back();
		
		objTestimonialPage.clickServices();
		objTestimonialPage.clickIntegraionFunctionalTesting();;;
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Integration and Functional Testing");
		driver.navigate().back();
		
		objTestimonialPage.clickServices();
		objTestimonialPage.clickNonFunctionalTesting();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Non Functional Testing");
		driver.navigate().back();		

		objTestimonialPage.clickServices();
		objTestimonialPage.clickVerticals();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Verticals");
		driver.navigate().back();		
		
		objTestimonialPage.clickTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageTestimonials.SLATEGRAY);
	
		
		objTestimonialPage.clickCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");		
		driver.navigate().back();
		
		objTestimonialPage.clickContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageContact.SLATEGRAY);
		driver.navigate().back();
		
		objTestimonialPage.clickNews();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "News");
		driver.navigate().back();
	
		//Verify bottom links redirect to correct page
		objTestimonialPage.clickBottomHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), PageHome.H3);;
		driver.navigate().back();
					
		objTestimonialPage.clickBottomAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(),  PageAbout.CLASSSLATEGRY);
		driver.navigate().back();
		
		objTestimonialPage.clickBottomService();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objTestimonialPage.clickBottomCasestudies();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Case Studies");
		driver.navigate().back();
		
		objTestimonialPage.clickBottomTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageTestimonials.SLATEGRAY);
		
		
		objTestimonialPage.clickBottomCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");
		driver.navigate().back();
		
		objTestimonialPage.clickBottomContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageContact.SLATEGRAY);
		driver.navigate().back();
		
		objTestimonialPage.clickBottomprivacy();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Privacy Policy");
		driver.navigate().back();
		
		//LinkedIn
		objTestimonialPage.clickLinkedIn();
		objTestimonialPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest");
		driver.navigate().back();
		
		//Bottom map
		objTestimonialPage.clickMapIe();
		objTestimonialPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		driver.navigate().back();
		
		objTestimonialPage.clickMapUk();
		objTestimonialPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		driver.navigate().back();		
		
	}
	/*
	 * @TC003_HOME_PARTNERS_CREDITATIONS
  	 * Verify PARTNERS & CREDITATIONS links are working
	 * */
	@Then("^Verify PARTNERS & CREDITATIONS links of Testimonials page are working$")
	public void test_partner_and_creditation_links_redirect_correct_page()throws Exception{

		objTestimonialPage.clickMicroFocus();		
		objTestimonialPage.focusToCurrentTab();		
		Assert.assertEquals(driver.getTitle(), CommonElements.MICROFOCUS_TITLE);	
		driver.close();
		
		objTestimonialPage.focusToCurrentTab();
		objTestimonialPage.clickSoftTest();
		objTestimonialPage.focusToCurrentTab();
		Assert.assertEquals(driver.getTitle(), CommonElements.SOFTTEST_TITLE);
		driver.close();
		
		objTestimonialPage.focusToCurrentTab();
		objTestimonialPage.clickSmartBear();
		objTestimonialPage.focusToCurrentTab();
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
