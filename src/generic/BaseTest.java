package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant {
	public WebDriver driver;

	@BeforeMethod
	public void openapp() {
		System.setProperty(Key, value);
		driver = new ChromeDriver();
		driver.get(Propertyfiledata.getdataproperty(propertyfilepath, "url"));
	}

	@AfterMethod
	public void closeapp(ITestResult r) {
		String name = r.getName();
		int status = r.getStatus();
		if(status==2)
		{
			Failedtestcase.getphoto(photopath,name, driver);
		}
		
		driver.close();
	}

}
