package scripts;

import org.testng.annotations.Test;

import POM.Homepage;
import POM.Loginpage;

import generic.BaseTest;

import generic.Propertyfiledata;

public class Validlogin extends BaseTest {

	@Test
	public void valid() {

		Loginpage l = new Loginpage(driver);
		l.signinlink();
		l.emailaddresstb(Propertyfiledata.getdataproperty(propertyfilepath, "username"));
		l.passwordtb(Propertyfiledata.getdataproperty(propertyfilepath, "password"));
		l.login();

		Homepage h = new Homepage(driver);
		h.serachtb(Propertyfiledata.getdataproperty(propertyfilepath, "product"));
		h.serachbutton();
	}

}
