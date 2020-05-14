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


public class TestPageHome {		
	
	WebDriver driver;	
	PageHome objHomePage;	
	ImageValidator imageValidator = new ImageValidator();
	Configurations conf = new Configurations();

	/*
	 * Initiate Web Driver before each an every Test
	 * */
	@Before
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", conf.getPropValues("driver_path") );
		 
	}
	
	/*
	 * Common step for all tests cases in @TS001_HOME_PAGE
	 * Navigate to Home Page
	 * */
	@Given("^Browser opened home$")
	public void navigate_to_home() {
		driver = new ChromeDriver(); 
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		objHomePage = PageFactory.initElements(driver, PageHome.class);		
		driver.get(PageHome.PAGE_URL);	
		
	}
	
	
	/*
	 * @TC001_HOME_CONTENTS
  	 * Verify Text Format, Images, Contents and Spellings are correct
	 * */
	
	@Then("^Verify Text Format, Images, Contents and Spellings are correct$")
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
		Assert.assertEquals(PageHome.ELEM_PARA1.getText(), PageHome.PARA1);
		Assert.assertEquals(PageHome.ELEM_PARA2.getText(), PageHome.PARA2);
		Assert.assertEquals(PageHome.ELEM_PARA3.getText(), PageHome.PARA3);
		Assert.assertEquals(PageHome.ELEM_PARA4.getText(), PageHome.PARA4);
		Assert.assertEquals(PageHome.ELEM_TEAMEX1.getText(), PageHome.TEAMEX1);
		Assert.assertEquals(PageHome.ELEM_TEAMEX2.getText(), PageHome.TEAMEX2);

		
		/*  Verify Text Formats  */
		Assert.assertEquals(PageHome.ELEM_H3.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageHome.ELEM_P.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageHome.ELEM_P.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageHome.ELEM_H5.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageHome.ELEM_H5.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageHome.ELEM_H5.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageHome.ELEM_H5.getCssValue("text-transform"), "uppercase");
		Assert.assertEquals(PageHome.ELEM_H4.getCssValue("font-size"), "13px");
		Assert.assertEquals(PageHome.ELEM_H4.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageHome.ELEM_H4.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageHome.ELEM_FOOTER_CONTENT.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageHome.ELEM_FOOTER_CONTENT.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageHome.ELEM_FOOTER_CONTENT.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageHome.ELEM_FOOTER_CONTENT.getCssValue("color"), "rgba(255, 255, 255, 1)");
			  
	}

	
	/*
	 * @TC002_HOME_LINKS
  	 * Verify HTML Links and Buttons on the site are linked to correct pages
	 * */
	@Then("^Verify HTML Links and Buttons on the site are linked to correct pages$")
	public void test_verify_html_links_redirect_correct_page()throws Exception{
	
		
		objHomePage.clickHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), PageHome.H3);
		driver.navigate().back();
		
		objHomePage.clickAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageAbout.CLASSSLATEGRY);
		driver.navigate().back();
		
		objHomePage.clickServices();	
		objHomePage.clickOurServices();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objHomePage.clickServices();
		objHomePage.clickStrategicTestManagement();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Strategic Test Management");
		driver.navigate().back();
		
		objHomePage.clickServices();
		objHomePage.clickTestAutomationPerformance();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Functional Test Automation and Performance");
		driver.navigate().back();
		
		objHomePage.clickServices();
		objHomePage.clickAcceptanceModelOffice();;
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Acceptance and Model Office Testing");
		driver.navigate().back();
		
		objHomePage.clickServices();
		objHomePage.clickIntegraionFunctionalTesting();;;
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Integration and Functional Testing");
		driver.navigate().back();
		
		objHomePage.clickServices();
		objHomePage.clickNonFunctionalTesting();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Non Functional Testing");
		driver.navigate().back();		

		objHomePage.clickServices();
		objHomePage.clickVerticals();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Verticals");
		driver.navigate().back();		
		

		objHomePage.clickTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageTestimonials.SLATEGRAY);
		driver.navigate().back();		

		objHomePage.clickCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");		
		driver.navigate().back();
		
		objHomePage.clickContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageContact.SLATEGRAY);
		driver.navigate().back();
		
		objHomePage.clickNews();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "News");
		driver.navigate().back();
	
		//Verify bottom links redirect to correct page
		objHomePage.clickBottomHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), PageHome.H3);
		driver.navigate().back();
					
		objHomePage.clickBottomAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(),  PageAbout.CLASSSLATEGRY);
		driver.navigate().back();
		
		objHomePage.clickBottomService();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objHomePage.clickBottomCasestudies();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Case Studies");
		driver.navigate().back();
		
		objHomePage.clickBottomTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageTestimonials.SLATEGRAY);
		driver.navigate().back();
		
		objHomePage.clickBottomCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");		
		driver.navigate().back();
		
		objHomePage.clickBottomContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageContact.SLATEGRAY);
		driver.navigate().back();
		
		objHomePage.clickBottomprivacy();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Privacy Policy");
		driver.navigate().back();
		
		//LinkedIn
		objHomePage.clickLinkedIn();
		objHomePage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest");
		driver.navigate().back();
		
		//Bottom map
		objHomePage.clickMapIe();
		objHomePage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		driver.navigate().back();
		
		objHomePage.clickMapUk();
		objHomePage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		driver.navigate().back();
		
	}

	/*
	 * @TC003_HOME_PARTNERS_CREDITATIONS
  	 * Verify PARTNERS & CREDITATIONS links are working
	 * */
	@Then("^Verify PARTNERS & CREDITATIONS links are working$")
	public void test_partner_and_creditation_links_redirect_correct_page()throws Exception{

		objHomePage.clickMicroFocus();		
		objHomePage.focusToCurrentTab();		
		Assert.assertEquals(driver.getTitle(), CommonElements.MICROFOCUS_TITLE);	
		driver.close();
		
		objHomePage.focusToCurrentTab();
		objHomePage.clickSoftTest();
		objHomePage.focusToCurrentTab();
		Assert.assertEquals(driver.getTitle(), CommonElements.SOFTTEST_TITLE);
		driver.close();
		
		objHomePage.focusToCurrentTab();
		objHomePage.clickSmartBear();
		objHomePage.focusToCurrentTab();
		Assert.assertEquals(driver.getTitle(), CommonElements.SMARTBEAR_TITLE);			
		
	}

	/*
	 * @TC004_HOME_EMAIL_LINK
  	 * Verify Email client with email populated in To field
	 * */
	@Then("^Verify Email client with email populated in To field$")
	public void test_verify_email_client_open(){	
		objHomePage.clickEmail();
		objHomePage.focusToCurrentTab();
		
		if(driver.getTitle().equals("Software Testing Services - Exactest")){
			Assert.assertFalse(driver.getTitle().equals(PageHome.PAGE_TITLE), "Not navigate to email clients browser");
		}else{
			System.out.println("Email client opened");
		}
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


