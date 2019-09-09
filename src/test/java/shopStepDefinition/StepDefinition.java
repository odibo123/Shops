package shopStepDefinition;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CartPage;
import pages.CheckOutPage;
import pages.CommonPage;
import pages.EnterPage;
import pages.HomePage;
import pages.MyShoePage;
import shop.TestBase;

public class StepDefinition extends TestBase{
	@Before
	public void setUp() throws IOException{
		initialize();
	}
	
	@Given("^user goes to Home Page$")
	public void user_goes_to_Home_Page() throws Throwable {
		 driver.get(CONFIG.getProperty("URL"));
		    driver.manage().window().maximize(); 
		   // Thread.sleep(5000);
	}

@Given("^he clicks the search icon$")
public void he_clicks_the_search_icon() throws Throwable {
	//LoginPage page = PageFactory.initElements(driver, LoginPage.class);
	//page.type_password(password);
	HomePage homePage = PageFactory.initElements(driver, HomePage .class);
	homePage .click_Search_Btn();
	
}

@Given("^he types shoes in the enter text field$")
public void he_types_shoes_in_the_enter_text_field() throws Throwable {
	EnterPage enterPage =  PageFactory.initElements(driver, EnterPage.class);
	enterPage.type_footwear();
	enterPage.type_footwear();
		
}

@Given("^searches for description and item and price$")
public void searches_for_description_and_item_and_price() throws Throwable {
	 MyShoePage  myShoePage = PageFactory.initElements(driver, MyShoePage.class );
	 myShoePage.verify_ShoeDiscription();
	 myShoePage.verify_ItemImage();
	 myShoePage.verify_Price();
}
@Given("^chooses to buy the first item$")
public void chooses_to_buy_the_first_item() throws Throwable {
	MyShoePage myShoePage = PageFactory.initElements(driver, MyShoePage .class);
	myShoePage.choose_colour();
	myShoePage.choose_size();
}

@Given("^clicks on cart link$")
public void clicks_on_cart_link() throws Throwable {
	CommonPage  commonPage = PageFactory.initElements(driver, CommonPage.class);
	commonPage .click_cart();
}
@Given("^user clicks proceed to checkout$")
public void user_clicks_proceed_to_checkout() throws Throwable {
	CartPage cartPage = PageFactory.initElements(driver, CartPage .class);
	cartPage .click_Proceed_To_Checkout();
}

@Given("^enters personal details \"([^\"]*)\" and \"([^\"]*)\"  and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"   on checkout Page$")
public void enters_personal_details_and_and_and_and_and_and_on_checkout_Page(String firstname, String lastname, String address, String town, String postcode, String phone, String email) throws Throwable {
	CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
	 checkOutPage.enter_firstname(firstname);
	 checkOutPage.enter_lastname(lastname);
	
}


@Given("^place the order$")
public void place_the_order() throws Throwable {

}

@Then("^user confirms seeing order details$")
public void user_confirms_seeing_order_details() throws Throwable {
   
}
}
