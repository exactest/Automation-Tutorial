package ie.exactest.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHome extends  CommonElements {
	WebDriver driver; 	
	public static final String PAGE_URL = "http://www.exactest.ie/";
	public static final String  PARA1 = "Exactest is an independent software testing consultancy. With our Head Office based in Dublin, we provide managed test services, test consultancy, and resourcing services throughout Ireland and the UK. Exactest specialise in all aspects of software testing and business process testing with unrivalled experience in many verticals across public and private sectors.";
	public static final String  PARA2 = "In a digital age, companies need to be in a position where they can make informed decisions around risks to the quality of their IT applications and infrastructure. All of our consultants undergo rigorous interview with only the very best in the field of quality joining our team. We achieve excellence through dedication and determination to succeed; our passion for detail drives our success.";
	public static final String  PARA3 = "For further information on the services we provide click here.";
	public static final String  PARA4 = "From multi million euro programmes to smaller projects contact us today and let our quality experience deliver for you.";
	public static final String  TEAMEX1 = "We provide guidance and management in the implementation of industry standard Test Centres of excellence from building on existing test functions to the establishment of new test teams.";
	public static final String  TEAMEX2 = "At Exactest, we know how to build successful test teams and what skills are required to achieve excellence.";
	
	public static final String H3 = "SOFTWARE TESTING - SERVICES";

		
	public static @FindBy(xpath = "//*[@id='main_content']/div[1]/div[3]/p[1]") WebElement ELEM_PARA1;
	public static @FindBy(xpath = "//*[@id='main_content']/div[1]/div[3]/p[2]") WebElement ELEM_PARA2;
	public static @FindBy(xpath = "//*[@id='main_content']/div[1]/div[3]/p[3]") WebElement ELEM_PARA3;
	public static @FindBy(xpath = "//*[@id='main_content']/div[1]/div[3]/p[4]") WebElement ELEM_PARA4;
	public static @FindBy(xpath = "//*[@id='main_content']/div[4]/div[2]/p[1]") WebElement ELEM_TEAMEX1;
	public static @FindBy(xpath = "//*[@id='main_content']/div[4]/div[2]/p[2]") WebElement ELEM_TEAMEX2;
	
	public static @FindBy(tagName = "p") WebElement ELEM_P;
	public static @FindBy(tagName = "h3") WebElement ELEM_H3;
	public static @FindBy(tagName = "h4") WebElement ELEM_H4;
	public static @FindBy(tagName = "h5") WebElement ELEM_H5;
	
	public static @FindBy(id = "footer_content") WebElement ELEM_FOOTER_CONTENT;
	
	
	@FindBy(className = "slategray") WebElement titletext;
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

	@FindBy(xpath = ".//*[@id='main_content']/div[1]/div[3]/a/img") WebElement BtnLearnMore;
	@FindBy(xpath = ".//*[@id='main_content']/div[3]/a") WebElement ReadTestimonials;
	@FindBy(xpath = ".//*[@id='main_content']/div[1]/div[3]/p[3]/a") WebElement ClickHere;
	@FindBy(xpath = ".//*[@id='main_content']/div[1]/div[3]/p[4]/a") WebElement ContactUs;
	
	/*Email xpath*/
	@FindBy(xpath = ".//*[@id='header_content']/div[2]/a") WebElement infoExatext;
	
	public PageHome(WebDriver driver){
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
		
		public void clickLearnMore(){clickElements(BtnLearnMore);
		}
		public void clickReadTestimonials(){clickElements(ReadTestimonials);
		}	
		public void clickClickHere(){clickElements(ClickHere);
		}
		public void clickReadContactUs(){clickElements(ContactUs);
		}
		
		//Click email
		public void clickEmail(){clickElements(infoExatext);
		}
		
		
		public void focusToCurrentTab() {
			for(String winHandle:driver.getWindowHandles()){
			    driver.switchTo().window(winHandle); 
			}
}
	
}
