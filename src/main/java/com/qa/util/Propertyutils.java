package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyutils {
	//code to read the property files

		public static String  getpropertydata(String propertyname) 
		
		{
			Properties pr=new Properties();
			//to get the location of the current working directory adress"
			String path=System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties";
			
		  
		try {
			FileInputStream fis = new FileInputStream(path);
			 pr.load(fis);
			  fis.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		  
		return pr.getProperty(propertyname);
	}

}
