package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPage {
	@FindBy(how=How.ID, using="billing_first_name")
	  public static WebElement firstnameBtn;
	
	@FindBy(how=How.ID, using="billing_last_name")
	  public static WebElement lastnameBtn;
	
	@FindBy(how=How.ID, using="billing_address_1")
	  public static WebElement addressBtn;
	
	@FindBy(how=How.ID, using="billing_city")
	  public static WebElement cityBtn;
	
	@FindBy(how=How.ID, using="billing_postcode")
	  public static WebElement postcodeBtn;
	
	@FindBy(how=How.ID, using="billing_phone")
	  public static WebElement phoneBtn;
	
	@FindBy(how=How.ID, using="billing_email")
	  public static WebElement emailBtn;
	//Actions
	

	public void enter_firstname(String firstname){
		firstnameBtn.sendKeys(firstname);
	}
	
	public void enter_lastname(String lastname){
		lastnameBtn.sendKeys(lastname);
	}
	
	public void enter_address(String address){
		lastnameBtn.sendKeys(address);
	}
	
	public void enter_city(String city){
		cityBtn.sendKeys(city);
	}
	
	public void enter_postcode(String postcode){
		postcodeBtn.sendKeys(postcode);
	}
	
	public void enter_phone(String phone){
		phoneBtn.sendKeys(phone);
	}

}
