package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Homepage extends Basepage {
	@FindBy(id="twotabsearchtextbox")
	private WebElement serach;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement serachbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void serachtb(String product)
	{
		serach.sendKeys(product);
	}
	
	public void serachbutton()
	{
		serachbtn.click();
	}
}
