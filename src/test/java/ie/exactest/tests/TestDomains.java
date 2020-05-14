package ie.exactest.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ie.exactest.pages.CommonElements;
import ie.exactest.pages.PageAbout;


public class TestDomains {
	public WebDriver driver;
	@Given("^Browser opened and navigate ie \"([^\"]*)\"$")
	public void navigate_to_exactest_ie(String url)throws Exception {
		driver = new ChromeDriver(); 
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);		
		driver.get(url);
		
	}
	
	@Then("^Verify site by site ie \"([^\"]*)\"$")
	public void verify_title_ie(String title)throws Exception{
		Assert.assertEquals(driver.getTitle(), title);			
	}
	
	
	
	
	
	@Given("^Browser opened and navigate uk \"([^\"]*)\"$")
	public void navigate_to_exactest_uk(String url)throws Exception {
		driver = new ChromeDriver(); 
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);		
		driver.get(url);
	}
	
	
	@Then("^Verify site by site uk \"([^\"]*)\"$")
	public void verify_title_uk(String title)throws Exception{
		Assert.assertEquals(driver.getTitle(), title);			
	}
	
	
	@After
	public void tearDown() {
		if(driver != null){
		driver.quit();
		}
	}
}
