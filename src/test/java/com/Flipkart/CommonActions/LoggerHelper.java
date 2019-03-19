package com.Flipkart.CommonActions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoggerHelper {
	private static boolean root=false;

	public static Logger getLogger(Class clas) 
	{
		if(root=false)
			return Logger.getLogger(clas);
	}

	PropertyConfigurator.configure(ResourceHelper.getResourcePath("\\src\\test\\java\\com\\Flipkart\\config.properties\\log4j.properties"));
	root=true;
	return Logger.getLogger(clas);
}


}
