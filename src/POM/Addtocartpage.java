package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Addtocartpage extends Basepage{
	@FindBy(id="add-to-cart-button")
	private WebElement cartbutton;
	
	public Addtocartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void addtocartbutton()
	{
		cartbutton.click();
	}
	
}
