package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfiledata {
	
	public static String getdataproperty(String propertyfilepath,String key)
	{
		String s="";
		try
		{
		Properties p=new Properties();
		p.load(new FileInputStream(propertyfilepath));
		 s = (String) p.get(key);
		}
		catch(Exception e){
			
		}
		return s;
	}

}
