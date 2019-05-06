package scripts;


import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Addtocartpage;
import POM.Homepage;
import POM.Loginpage;
import POM.Phonepage;
import POM.Productpage;

import generic.BaseTest;
import generic.Propertyfiledata;

public class Addingtocart extends BaseTest{

	@Test
	public void adding()
	{
		
		Loginpage l=new Loginpage(driver);
		l.signinlink();
		l.emailaddresstb(Propertyfiledata.getdataproperty(propertyfilepath,"username"));
		l.passwordtb(Propertyfiledata.getdataproperty(propertyfilepath,"password"));
		l.login();
		
		Homepage h=new Homepage(driver);
		h.serachtb(Propertyfiledata.getdataproperty(propertyfilepath,"product"));
		h.serachbutton();
		
		Productpage p=new Productpage(driver);
		p.iphoneproduct();
		p.listboxitems(driver);
		
		Reporter.log("it as been shorted",true);
		
		Phonepage ph=new Phonepage(driver);
		ph.addtocart();
		
		Addtocartpage c=new Addtocartpage(driver);
		c.addtocartbutton();
		

	}

}
