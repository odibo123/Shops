package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
	@FindBy(how=How.XPATH, using="//span[@class='cart-name-and-total']")
	  public static WebElement cart;
	
	
	public void click_cart(){
		cart.click();
	}
}
