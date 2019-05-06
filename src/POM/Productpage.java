package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;
import generic.Listbox;

public class Productpage extends Basepage{
	@FindBy(id = "pdagDesktopSparkleHeadline")
	private WebElement iphone;

	@FindBy(id = "s-result-sort-select")
	private WebElement drop;

	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void iphoneproduct() {
		iphone.click();
	}
	
	public void listboxitems(WebDriver driver)
	{
		Listbox.dropdown( drop,"Price: High to Low");
	}

}
