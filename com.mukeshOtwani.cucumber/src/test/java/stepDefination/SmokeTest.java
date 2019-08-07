package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	@Given("^Open Chrome and start application$")
	public void Open_Chrome_and_start_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	    
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")	
	public void I_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("pass")).sendKeys(pass);

	}

	@Then("^user should able to login sccessfully$")
	public void user_should_able_to_login_sccessfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Then("^the application should be closed$")
	public void the_application_should_be_closed() throws Throwable {
	  driver.quit();
	}

}
