package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class RegisterPage {
	WebDriver drive;




	
	@FindBy(how=How.ID, using="day-input")
	public static WebElement myday_input;
	
	@FindBy(how=How.ID, using="month-input")
	public static WebElement mymonth_input;
	
	@FindBy(how=How.ID, using="year-input")
	public static WebElement myyear_input;
	
	@FindBy(how=How.ID, using="submit-button")
	public static WebElement reg_next_button;
	
	@FindBy(how=How.ID, using="email-input")
	public static WebElement myemail;
		
	@FindBy(how=How.ID, using="password-input")
	public static WebElement mypassword;
	
	@FindBy(how=How.ID, using="postcode-input")
	public static WebElement mypostcode;
	
	@FindBy(how=How.ID, using="click_gender_input_Female")
	public static WebElement mygender_input_female;
	
	@FindBy(how=How.ID, using="click_name_Female")
	public static WebElement female;
	
	@FindBy(how=How.CSS, using="div.button__text")
	public static WebElement mypersonalised_email;
	
	@FindBy(how=How.ID, using="submit-button")
	public static WebElement reg_submit_button;
	
	
	
	public void type_day(String day){
		myday_input.sendKeys(day);		
	}
	
	public void type_month(String month){
		mymonth_input.sendKeys(month);		
	}
	
	public void type_year(String year){
		myyear_input.sendKeys(year);		
	}
	
	public void click_next_button(){
		reg_next_button.click();	
	}
	
	public void type_email(String email){
		myemail.sendKeys(email);		
	}
	
	public void type_password(String password){
		mypassword.sendKeys(password);		
	}
	
	public void type_postcode(String postcode){
		mypostcode.sendKeys(postcode);		
	}
	
	public void click_gender_input_female(){
		mygender_input_female.click();		
	}
	
	public void click_name_Female(){
		female.click();		
	}
	

	public void click_mypersonalised_email(){
		mypersonalised_email.click();		
	}
	
	public void click_submit_button(){
		reg_submit_button.click();		
	}



	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
