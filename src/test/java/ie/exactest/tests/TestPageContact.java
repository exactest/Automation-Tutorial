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
import ie.exactest.pages.PageContact;
import ie.exactest.pages.PageAbout;
import ie.exactest.config.Configurations;
import ie.exactest.pages.CommonElements;
import ie.exactest.pages.PageHome;
import ie.exactest.pages.PageTestimonials;
import ie.exactest.services.ImageValidator;
import ie.exactest.services.ReadExcell;

public class TestPageContact extends CommonElements{


	WebDriver driver;	
	PageContact objContactPage;
	ImageValidator imageValidator = new ImageValidator();
	ReadExcell excell = new ReadExcell("src/test/resources/TestData/ConatctData.xlsx");
	Configurations conf = new Configurations();
	/*
	 * Initiate Web Driver before each an every Test
	 * */
	@Before
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver",  conf.getPropValues("driver_path"));
			 
	}
	
	/*
	 * Common step for all tests cases in @TS001_CONTACTS_PAGE
	 * Navigate to Contacts Page
	 * */
	@Given("^Browser opened Contact$")
	public void navigate_to_contact() {
		driver = new ChromeDriver(); 
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		objContactPage = PageFactory.initElements(driver, PageContact.class);	
		driver.get(PageContact.PAGE_URL);	
		
	}
	
	
	/*
	 * @TC001_CONTACTS_CONTENTS
  	 * Verify Text Format, Images, Contents and Spellings are correct
	 * */
	
	@Then("^Verify Text Format, Images, Contents and Spellings are correct on Contact page$")
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
		Assert.assertEquals(PageContact.ELEM_PARA1.getText(), PageContact.PARA1);

		
		/*verify_text_format_font_weight_etc*/
		Assert.assertEquals(PageContact.ELEM_H1.getCssValue("font-size"), "22px");
		Assert.assertEquals(PageContact.ELEM_H1.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageContact.ELEM_H1.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageContact.ELEM_P.getCssValue("font-size"), "14px");
		Assert.assertEquals(PageContact.ELEM_P.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageContact.ELEM_H5.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageContact.ELEM_H5.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageContact.ELEM_H5.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageContact.ELEM_H5.getCssValue("text-transform"), "uppercase");
		
		Assert.assertEquals(PageContact.ELEM_H4.getCssValue("font-size"), "13px");
		Assert.assertEquals(PageContact.ELEM_H4.getCssValue("font-weight"), "700");
		Assert.assertEquals(PageContact.ELEM_H4.getCssValue("font-family"), "arial, verdana");
		
		Assert.assertEquals(PageContact.ELEM_FOOTER_CONTENT.getCssValue("font-size"), "12px");
		Assert.assertEquals(PageContact.ELEM_FOOTER_CONTENT.getCssValue("font-weight"), "400");
		Assert.assertEquals(PageContact.ELEM_FOOTER_CONTENT.getCssValue("font-family"), "arial, verdana");
		Assert.assertEquals(PageContact.ELEM_FOOTER_CONTENT.getCssValue("color"), "rgba(255, 255, 255, 1)");
			  
	}

	
	/*
	 * @TC002_HOME_LINKS
  	 * Verify HTML Links and Buttons on the site are linked to correct pages
	 * */
	@Then("^Verify HTML Links and Buttons on the are correct on Contact page  are linked to correct pages$")
	public void test_verify_html_links_redirect_correct_page()throws Exception{
	
		
		objContactPage.clickHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), PageHome.H3);
		driver.navigate().back();
		
		objContactPage.clickAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageAbout.CLASSSLATEGRY);
		driver.navigate().back();

		
		objContactPage.clickServices();	
		objContactPage.clickOurServices();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objContactPage.clickServices();
		objContactPage.clickStrategicTestManagement();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Strategic Test Management");
		driver.navigate().back();
		
		objContactPage.clickServices();
		objContactPage.clickTestAutomationPerformance();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Functional Test Automation and Performance");
		driver.navigate().back();
		
		objContactPage.clickServices();
		objContactPage.clickAcceptanceModelOffice();;
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Acceptance and Model Office Testing");
		driver.navigate().back();
		
		objContactPage.clickServices();
		objContactPage.clickIntegraionFunctionalTesting();;;
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Integration and Functional Testing");
		driver.navigate().back();
		
		objContactPage.clickServices();
		objContactPage.clickNonFunctionalTesting();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Non Functional Testing");
		driver.navigate().back();		

		objContactPage.clickServices();
		objContactPage.clickVerticals();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Verticals");
		driver.navigate().back();		
		
		objContactPage.clickTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageTestimonials.SLATEGRAY);
		driver.navigate().back();		

		objContactPage.clickCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");		
		driver.navigate().back();
		
		objContactPage.clickContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageContact.SLATEGRAY);
		driver.navigate().back();
		
		objContactPage.clickNews();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "News");
		driver.navigate().back();
	
		//Verify bottom links redirect to correct page
		objContactPage.clickBottomHome();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), PageHome.H3);
		driver.navigate().back();
					
		objContactPage.clickBottomAbout();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(),  PageAbout.CLASSSLATEGRY);
		driver.navigate().back();

		
		objContactPage.clickBottomService();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Services");
		driver.navigate().back();
		
		objContactPage.clickBottomCasestudies();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Case Studies");
		driver.navigate().back();
		
		objContactPage.clickBottomTestimonials();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageTestimonials.SLATEGRAY);
		driver.navigate().back();
		
		objContactPage.clickBottomCareers();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest is hiring, apply today");
		driver.navigate().back();
		
		objContactPage.clickBottomContact();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), PageContact.SLATEGRAY);
		Assert.assertEquals(PageContact.ELEM_TITLE.getText(), PageContact.PAGE_TITLE);

		
		objContactPage.clickBottomprivacy();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Privacy Policy");
		driver.navigate().back();
		
		//LinkedIn
		objContactPage.clickLinkedIn();
		objContactPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Exactest");
		driver.navigate().back();
		
		//Bottom map
		objContactPage.clickMapIe();
		objContactPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");
		
		
		objContactPage.clickMapUk();
		objContactPage.focusToCurrentTab();
		Assert.assertEquals(driver.findElement(By.className("slategray")).getText(), "Contact");

		
		
	}

	/*
	 * @TC003_HOME_PARTNERS_CREDITATIONS
  	 * Verify PARTNERS & CREDITATIONS links are working
	 * */
	@Then("^Verify PARTNERS & CREDITATIONS links of Contact page are working$")
	public void test_partner_and_creditation_links_redirect_correct_page()throws Exception{

		objContactPage.clickMicroFocus();		
		objContactPage.focusToCurrentTab();		
		Assert.assertEquals(driver.getTitle(), CommonElements.MICROFOCUS_TITLE);	
		driver.close();
		
		objContactPage.focusToCurrentTab();
		objContactPage.clickSoftTest();
		objContactPage.focusToCurrentTab();
		Assert.assertEquals(driver.getTitle(), CommonElements.SOFTTEST_TITLE);
		driver.close();
		
		objContactPage.focusToCurrentTab();
		objContactPage.clickSmartBear();
		objContactPage.focusToCurrentTab();
		Assert.assertEquals(driver.getTitle(), CommonElements.SMARTBEAR_TITLE);						
	}
	
	@Then("^Enter data for inquiry$")
	public void test_to_contact_excel()throws InterruptedException{
		driver.get("http://www.exactest.ie/contact.html");
		
		for (int i = 0; i < excell.getRowCount(0); i++) {
			System.out.println(excell.getRowCount(0));
			driver.findElement(By.xpath(".//*[@id='main_content']/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys(excell.getData(0, i, 0));
			driver.findElement(By.xpath(".//*[@id='main_content']/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys(excell.getData(0, i, 1));
			driver.findElement(By.xpath(".//*[@id='main_content']/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys(excell.getData(0, i, 2));
			driver.findElement(By.xpath(".//*[@id='main_content']/div[1]/form/table/tbody/tr[4]/td[2]/textarea")).sendKeys(excell.getData(0, i, 3));
			driver.findElement(By.xpath(".//*[@id='main_content']/div[1]/form/table/tbody/tr[5]/td[2]/input")).click();;
			
			Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='main_content']/div[1]/p")).getText().equals("Your enquiry has been sent successfully, we will be in touch shortly."), "Data Not uploaded");		

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
