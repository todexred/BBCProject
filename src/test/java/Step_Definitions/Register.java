package Step_Definitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Helper.testBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.RegisterPage;
import pages.SigninPage;

public class Register extends testBase {
	
	@Before
	public void setup() throws IOException{
		initialize();
			}
	
	
	@Given("^I am on the BBC homepage$")
	public void i_am_on_the_BBC_homepage() throws Throwable {
			driver.get(CONFIG.getProperty("testSiteName"));
			}

	@Given("^i click sign in$")
	public void i_click_sign_in() throws Throwable {	
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		homepage.mysignin_in();
	}

	@Given("^I click Register now$")
	public void i_click_Register_now() throws Throwable {
		SigninPage signinpage= PageFactory.initElements(driver, SigninPage.class);
		signinpage.click_register_now();
	}

	@Given("^i type the day \"([^\"]*)\" in the field provided$")
	public void i_type_the_day_in_the_field_provided(String day) throws Throwable {
		 RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
		    registerpage.type_day(day);
	  	}

	@Then("^i type the Month \"([^\"]*)\" in the field provided$")
	public void i_type_the_Month_in_the_field_provided(String month) throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.type_month(month);
	  	}

	@Then("^I type the year \"([^\"]*)\" in the field provided$")
	public void i_type_the_year_in_the_field_provided(String year) throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.type_year(year);
		   	}

	@Then("^I click Next$")
	public void i_click_Next() throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
		registerpage.click_next_button();
	    	    
	}

	@Then("^I type email \"([^\"]*)\" in the email field$")
	public void i_type_email_in_the_email_field(String email) throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.type_email(email);
	 
	}

	@Then("^I type password \"([^\"]*)\" in  the password field$")
	public void i_type_password_in_the_password_field(String password) throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.type_password(password);
	   
	}

	@Then("^I insert postcode \"([^\"]*)\" in the postcode field$")
	public void i_insert_postcode_in_the_postcode_field(String postcode) throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.type_postcode(postcode);
	  	}
	
	@Then("^I click on the gender drop downlist$")
	public void i_click_on_Female_from_the_gender_drop_downlist() throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.click_gender_input_female();

	    	}
	
	@Then("^from the gender drop downlist i select Female$")
	public void from_the_gender_drop_downlist_i_select_Female() throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.click_name_Female();
	   
	}
	

	@Then("^I select No email personalisation$")
	public void i_select_No_email_personalisation() throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.click_mypersonalised_email();
	    	}


	@Then("^I click Register$")
	public void i_click_Register() throws Throwable {
		RegisterPage registerpage= PageFactory.initElements(driver, RegisterPage.class);
	    registerpage.click_submit_button();
	 
	}

	@Then("^I verify that i am registered successfully$")
	public void i_verify_that_i_am_registered_successfully() throws Throwable {
	   
	}

	@After
	public void teardown(){
		driver.close();
	}

}
