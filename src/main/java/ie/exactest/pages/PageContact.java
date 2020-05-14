package ie.exactest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageContact extends CommonElements{
	
	public static final String PAGE_URL = "http://www.exactest.ie/contact.html";
	public static final String PAGE_TITLE = "Contact";
	
	//Text and contents expected results	
	public static final String  PARA1 = "Exactest understand how to deliver a test model to enable the success of your delivery. We are keen to engage, take the time to understand your requirements, devise a tailored test delivery model, execute the test strategy to enable the successful delivery of your programme in line with schedule and budget. Contact us today to find out more.";
	public static final String  SLATEGRAY =  "Contact";

	
	WebDriver driver; 	
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/p") WebElement ELEM_PARA1;
	public static @FindBy(tagName = "p") WebElement ELEM_P;
	public static @FindBy(tagName = "h1") WebElement ELEM_H1;
	public static @FindBy(tagName = "h4") WebElement ELEM_H4;
	public static @FindBy(tagName = "h5") WebElement ELEM_H5;
	public static @FindBy(className = "slategray") WebElement ELEM_TITLE;	
	public static @FindBy(id = "footer_content") WebElement ELEM_FOOTER_CONTENT;
	
	

	//Identify links which open on new tab
	@FindBy(xpath = ".//*[@id='pre_footer_content']/ul/li[1]/img") WebElement iseb_link;
	@FindBy(xpath = ".//*[@id='pre_footer_content']/ul/li[2]/a/img") WebElement microfocus_link;
	@FindBy(xpath = ".//*[@id='pre_footer_content']/ul/li[3]/a/img") WebElement softtest_link;
	@FindBy(xpath = ".//*[@id='pre_footer_content']/ul/li[4]/a/img") WebElement smartbear_link;
	
	//Identify links on menu
	@FindBy(xpath = ".//*[@id='example']/li[1]/a") WebElement home_link ;
	@FindBy(xpath = ".//*[@id='example']/li[2]/a") WebElement about_link;
	@FindBy(xpath = ".//*[@id='example']/li[3]/a") WebElement service_link ;
	@FindBy(xpath = ".//*[@id='example']/li[4]/a") WebElement tetimonials_link ;
	@FindBy(xpath = ".//*[@id='example']/li[5]/a") WebElement careers_link ;
	@FindBy(xpath = ".//*[@id='example']/li[6]/a") WebElement contact_link ;
	@FindBy(xpath = ".//*[@id='example']/li[7]/a") WebElement news_link ;	
	@FindBy(xpath = ".//*[@id='example']/li[3]/ul/li[1]/a") WebElement ourservices_link ;
	@FindBy(xpath = ".//*[@id='example']/li[3]/ul/li[2]/a") WebElement stattest_mgmnt_link ;
	@FindBy(xpath = ".//*[@id='example']/li[3]/ul/li[3]/a") WebElement testauoto_and_persormance_link ;
	@FindBy(xpath = ".//*[@id='example']/li[3]/ul/li[4]/a") WebElement acc_mdel_office_link ;
	@FindBy(xpath = ".//*[@id='example']/li[3]/ul/li[5]/a") WebElement integ_funct_link ;
	@FindBy(xpath = ".//*[@id='example']/li[3]/ul/li[6]/a") WebElement non_funct_link ;
	@FindBy(xpath = ".//*[@id='example']/li[3]/ul/li[7]/a") WebElement verticals_link ;
	
	//Identify links on bottom
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[1]/a") WebElement bottom_home_link ;
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[2]/a") WebElement bottom_about_link ;
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[3]/a") WebElement bottom_service_link ;
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[4]/a") WebElement bottom_case_studies_link;
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[5]/a") WebElement bottom_testimonials_link ;
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[6]/a") WebElement bottom_careers_link ;
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[7]/a") WebElement bottom_contact_link ;
	@FindBy(xpath = ".//*[@id='footer_content']/ul/li[8]/a") WebElement bottom_privacypolicy_link;
	@FindBy(xpath = ".//*[@id='pre_footer_content']/div[3]/p/a") WebElement linkedin_button;
	
	@FindBy(xpath = ".//*[@id='pre_footer_content']/div[2]/address[1]/p[4]/a[1]") WebElement map_ie;
	@FindBy(xpath = ".//*[@id='pre_footer_content']/div[2]/address[2]/p[4]/a[1]") WebElement map_uk;
	
	/*Page contents xpaths*/
	@FindBy (xpath = ".//*[@id='main_content']/h1") WebElement about_heading;
	@FindBy (xpath = ".//*[@id='main_content']/p[1]") WebElement about_para1;
	
	
	public PageContact(WebDriver driver){
		this.driver = driver;
	}	
	//Accreditation links actions
		public void clickMicroFocus(){clickElements(microfocus_link);
		}
		public void clickIseb(){clickElements(iseb_link);
		}
		public void clickSoftTest(){clickElements(softtest_link);
		}
		public void clickSmartBear(){clickElements(smartbear_link);
		}
			

		//Actions of menu links	
		public void clickHome(){clickElements(home_link);		
		}
		public void clickAbout(){clickElements(about_link);	
		}
		public void clickServices(){clickElements(service_link);		
		}
		public void clickTestimonials(){clickElements(tetimonials_link);		
		}
		public void clickCareers(){clickElements(careers_link);		
		}
		public void clickContact(){clickElements(contact_link);		
		}
		public void clickNews(){clickElements(news_link);		
		}
			
		public void clickOurServices(){clickElements(ourservices_link);
		}	
		public void clickStrategicTestManagement(){clickElements(stattest_mgmnt_link);
		}
		public void clickTestAutomationPerformance(){clickElements(testauoto_and_persormance_link);
		}
		public void clickAcceptanceModelOffice(){clickElements(acc_mdel_office_link);
		}
		public void clickIntegraionFunctionalTesting(){clickElements(integ_funct_link);
		}
		public void clickNonFunctionalTesting(){clickElements(non_funct_link);
		}
		public void clickVerticals(){clickElements(verticals_link);
		}
		
			
		//Actions of bottom links
		public void clickBottomHome(){clickElements(bottom_home_link);		
		}
		public void clickBottomAbout(){clickElements(bottom_about_link);		
		}
		public void clickBottomService(){clickElements(bottom_service_link);		
		}
		public void clickBottomCasestudies(){clickElements(bottom_case_studies_link);		
		}
		public void clickBottomTestimonials(){clickElements(bottom_testimonials_link);	
		}
		public void clickBottomCareers(){clickElements(bottom_careers_link);	
		}
		public void clickBottomContact(){clickElements(bottom_contact_link);	
		}
		public void clickBottomprivacy(){clickElements(bottom_privacypolicy_link);
		}
		
		//LinkedIN
		public void clickLinkedIn(){clickElements(linkedin_button);
		}
		
		//Map
		
		public void clickMapIe(){clickElements(map_ie);
		}
		public void clickMapUk(){clickElements(map_uk);
		}	
		
		
		
		public void focusToCurrentTab() {
			for(String winHandle:driver.getWindowHandles()){
			    driver.switchTo().window(winHandle); 
			}
}}
