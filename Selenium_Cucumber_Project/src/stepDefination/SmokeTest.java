package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","../Selenium_Cucumber_Project/Driver/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://test.salesforce.com/");
        
	   
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_username_and_password(String uname, String pass) throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
	  
	}

	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("Login")).click();
	    
	}


}
