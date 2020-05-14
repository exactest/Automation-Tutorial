package ie.exactest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTestimonials extends CommonElements {
	
	public static final String PARA11  = "We deliver a personal tailored service. Here are some of our customers and what they have to say:";
	public static final String METLIFE1 = "We hired Exactest to provide test management services on a complex data migration involving 5 countries, 29 products and millions of client records.";
	public static final String METLIFE2 = "It was a challenging project and they brought structure, method and commitment to the testing. Built excellent relationships across the project team and with stakeholders across multiple organisations ultimately leading to a very successful delivery.\"";
	public static final String VODAF1  = "Exactest provided User Acceptance Testing capability to a final and critical stage of our new Vodafone TV service launch in Ireland.";
	public static final String VODAF2 = "I have since used Exactest to provide services for another BAU initiative and look forward to our continued relationship with Exactest.\"";
	public static final String SIRO1  = "At SIRO we brought in Exactest to act as our 'Testing conscience' as all of our brand-new IT solutions were outsourced. The Exactest team brought a professionalism and diligence to create the SIRO Test Strategy and to align our suppliers different test strategies with ours. They oversaw the vendors Test events, critiqued and improved the vendors Test approaches and ultimately ran a very successful Business User Acceptance test for SIRO.";
	public static final String SIRO2 = "They have my gratitude and respect for the effective and efficient manner in which they delivered to very challenging timelines.\"";
	public static final String MAYNOOTH1 = "Maynooth University engaged Exactest to complete a Software Quality Review, Test Strategy definition and provide short-term test support for a major IT Transformation. We found Exactest consultants to be extremely knowledgeable in the software testing domain and they bought a professional and customer focused approach to the delivery of the work.";
	public static final String MAYNOOTH2  = "I would have no hesitation in recommending Exactest for software testing services.\"";
	public static final String AXA1  = "I had a particularly challenging role to fill to enable the delivery of a strategic initiative. I contacted Exactest and they immediately understood the type of resource I required. The resourcing services supplied by Exactest clearly demonstrated their testing industry experience.";
	public static final String AXA2 = "I have since used Exactest for consultancy in another testing initiative and would have no hesitation in using their services in the future.\"";
	public static final String IRISHLIFE1 = "ILIM engaged Exactest in March 2016 with the remit to review our current test process and, taking into account industry trends and peer organisation models, identify recommendations for redesign and improvement. James was able to use his broad test experience and personable manner to very quickly understand the existing landscape and problem areas, and identify recommendations. His knowledge and skill meant he was able to develop a good level of insight with minimal draw on internal resources. This was a valuable and worthwhile exercise at a very fair price.";
	public static final String IRISHLIFE2 = "Exactest were a pleasure to work with, highly professional yet very flexible and accommodating in terms delivering to the our needs rather than their own playbook.\"";
	
	public static final String SLATEGRAY = "Testimonials";
	
	WebDriver driver; 
	
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[1]/p[1]") WebElement ELEM_METALIFE_PARA1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[1]/p[2]") WebElement ELEM_METALIFE_PARA2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[2]/p[1]") WebElement ELEM_VODAFONE_PARA1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[2]/p[2]") WebElement ELEM_VODAFONE_PARA2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[3]/p[1]") WebElement ELEM_SIRO_PARA1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[3]/p[2]") WebElement ELEM_SIRO_PARA2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[4]/p[1]") WebElement ELEM_MAYNOOTH_PARA1;	
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[4]/p[2]") WebElement ELEM_MAYNOOTH_PARA2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[5]/p[1]") WebElement ELEM_AXALIFE_PARA1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[5]/p[2]") WebElement ELEM_AXALIFE_PARA2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[6]/p[1]") WebElement ELEM_IRISHLIFE_PARA1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[6]/p[2]") WebElement ELEM_IRISHLIFE_PARA2;
	

	
	

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
	public static @FindBy (tagName = "h1") WebElement ELEM_H1;
	public static @FindBy (tagName = "h4") WebElement ELEM_H4;
	public static @FindBy (tagName = "h5") WebElement ELEM_H5;
	public static @FindBy (tagName = "p") WebElement ELEM_P;
	public static @FindBy(id = "footer_content") WebElement ELEM_FOOTER_CONTENT;
	public static @FindBy(className = "slategray") WebElement ELEM_TITLE;

	
	
	public PageTestimonials(WebDriver driver){
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
	
	
		}
}
