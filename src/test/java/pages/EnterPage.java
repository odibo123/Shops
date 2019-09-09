package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnterPage {
	@FindBy(how=How.XPATH, using="//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")
	  public static WebElement Enterlink;
	

	public void type_footwear() throws InterruptedException{
		Enterlink.sendKeys("shoe");
		Thread.sleep(3000);
		Enterlink.sendKeys(Keys.RETURN);
		Thread.sleep(5000);
	}
	
		
	

}
