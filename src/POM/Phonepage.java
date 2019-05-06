package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phonepage {

	@FindBy(xpath = "(//span[.='Add to Cart'])[2]")
	private WebElement cart;
	
	public Phonepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addtocart()
	{
		cart.click();
	}

}
