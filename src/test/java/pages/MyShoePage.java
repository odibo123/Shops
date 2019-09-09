package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class MyShoePage {
	@FindBy(how=How.XPATH, using="//*[@id='product-1301']/div[1]/div[2]/h1")
	  public static WebElement ShoeDiscription;
	
	@FindBy(how=How.XPATH, using="//*[@id='product-1301']/div[1]/div[2]/p/span")
	  public static WebElement Price;
	
	@FindBy(how=How.XPATH, using="//*[@id='product-1301']/div[1]/div[1]/div[2]/div/div/div/div[2]/img")
	  public static WebElement ItemImage;
	
	@FindBy(how=How.ID, using="pa_color")
	  public static WebElement drpdwnColour;
	
	@FindBy(how=How.ID, using="pa_size")
	  public static WebElement drpdwnSize;

	 	
	@FindBy(how=How.XPATH, using="//i[@class='icon_plus']")
	  public static WebElement Quantity;
	
	@FindBy(how=How.XPATH, using="//button[@class='single_add_to_cart_button button alt']")
	  public static WebElement AddToCartBtn;
	//methods
	
	public void verify_ShoeDiscription(){
	ShoeDiscription.isDisplayed();
	}
	public void verify_Price(){
		//boolean b2=	Price.isDisplayed();
		//System.out.println(2);
		Price.isDisplayed();
	}
	public void verify_ItemImage(){
			ItemImage.isDisplayed();
		}
	
	public void choose_colour(){
		//Select colour = new Select(drpdwnColour);
		//colour.selectByVisibleText("Nude");
      new Select(drpdwnColour).selectByVisibleText("Nude");
      drpdwnColour.click();
	}
	
	public void choose_size(){
		Select colour = new Select(drpdwnSize);
		colour.selectByVisibleText("36");
		// new Select(drpdwnSize).selectByVisibleText("36");
		drpdwnSize.click();
	}
	public void click_Quantity(){
		Quantity.click();
	}
	public void click_AddToCartBtn(){
		AddToCartBtn.click();
	}
}
