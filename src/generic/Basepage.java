package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	
	public void testbox(WebDriver driver,WebElement element)
	{
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void button(WebDriver driver,WebElement element)
	{
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}

}
