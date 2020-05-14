package ie.exactest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PageAbout extends CommonElements {
	public static final String PAGE_URL = "http://www.exactest.ie/about.html";
	public static final String PAGE_TITLE = "Software Testing Services - Exactest";
	
	//Text and contents expected results	
	public static final String  PARA_1 = "Everyone recognises that the world is ever evolving through the on-going digital revolution. Software solutions are changing every aspect of business from Finance, Travel, Enterprise and Industry to the most personal aspects of our lives such as Entertainment, Travel, Leisure and Retail.";
	public static final String  PARA_2 = "Exactest believe that the critical importance of software testing to worldwide economies and home life is just being realised. Producers of IT Applications must ensure responsibility for reliability through to maintainability and adaptability. Testing is a long recognised IT discipline and is now seen by many organisations as a pivotal component of delivery.";
	public static final String  PARA_JC = "James has delivered senior test management capability up to Programme Test Management and Test Director level on multi million euro programmes. He has expertise in large and complex test solutions in both on and offshore test delivery models to senior stakeholders and programme boards. This profile, coupled with a broad range of experience, results in Exactest's respected foundations for a positive approach to software test delivery.";
	public static final String  PARA_MM1 = "An expert software testing professional with in excess of 14 years' experience working with leading organisations across a range of programmes. Taking a focused, professional approach to each assignment, Matthew has consistently delivered results exceeding client expectations.";
	public static final String  PARA_MM2 = "Matthew has completed a number of successful Test Management assignments for a range of blue chip companies. Of particular note is his management experience of User and Business Acceptance test phases. Equally his experience spans low level test execution of Web Services and Portal applications through to end to end testing.";
	public static final String  PARA_KB1 = "Ken Brennock is an experienced and accomplished Test and Quality manager with over 25 years ICT experience. Ken's experience includes; setting up and managing teams and processes, implementing best practice test processes to meet business objectives and goals including the implemention of ISO, CMM, RUP and Agile methodologies.";
	public static final String  PARA_KB2 = "Ken's background was originally in manufacturing, but moved very early into software development. He has worked in a wide range of organisations including banking, telecommunications, insurance, utilities and public sector.";
	public static final String  PARA_CK1 = "Claire holds a Bachelor of Business Studies degree and is a member of the Chartered Institute of Personnel and Development (CIPD). Claire's HR experience spans a broad range of blue chip companies both in Dublin and in the UK such as Siemens, GlaxoSmithKline and Citi Bank.";
	public static final String  PARA_CK2 = "Claire has worked on a number of HR software application implementations in a Business Acceptance Test capacity and is now the Exactest main point of contact for Software Test Resourcing, Recruitment and Payroll.";
	
	public static final String  CLASSSLATEGRY = "About";
	
	
	WebDriver driver; 		
	
	
	public static @FindBy(xpath = ".//*[@id='main_content']/p[1]") WebElement ELEM_PARA1;
	public static @FindBy(xpath = ".//*[@id='main_content']/p[2]") WebElement ELEM_PARA2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[1]/p") WebElement ELEM_PARA_JC;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[2]/p[1]") WebElement ELEM_PARA_MM1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[2]/p[2]") WebElement ELEM_PARA_MM2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[3]/p[1]") WebElement ELEM_PARA_KB1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[3]/p[2]") WebElement ELEM_PARA_KB2;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[4]/p[1]") WebElement ELEM_PARA_CK1;
	public static @FindBy(xpath = ".//*[@id='main_content']/div[2]/div[4]/p[2]") WebElement ELEM_PARA_CK2;
	
	public static @FindBy(tagName = "p") WebElement ELEM_P;
	public static @FindBy(tagName = "h1") WebElement ELEM_H1;
	public static @FindBy(tagName = "h2") WebElement ELEM_H2;
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
	
	
	public PageAbout(WebDriver driver){
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
	

	
	/*Methods to acces element ui elements*/
	/*public String getAboutHeading(){
		getElementByCss(about_heading);
		return about_heading.getCssValue("font-weight");
	}
	
	public String getAboutPara1(){getElementByCss(about_para1);
		return about_para1.getCssValue("font-weight");
}*/
	
	
	


	public void focusToCurrentTab() {
		for(String winHandle:driver.getWindowHandles()){
		    driver.switchTo().window(winHandle); 
		}
		
	
		
	}
	
}

	
	
	

	
	

	
