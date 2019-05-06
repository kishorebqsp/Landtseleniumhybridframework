package scripts;

import org.testng.annotations.Test;

import POM.Loginpage;

import generic.BaseTest;
import generic.Propertyfiledata;

public class Invalidlogin extends BaseTest {

	@Test
	public void invalid() {

		Loginpage l = new Loginpage(driver);
		l.signinlink();
		l.emailaddresstb(Propertyfiledata.getdataproperty(propertyfilepath, "url"));
		l.passwordtb(Propertyfiledata.getdataproperty(propertyfilepath, "url"));
		l.login();

	}

}
