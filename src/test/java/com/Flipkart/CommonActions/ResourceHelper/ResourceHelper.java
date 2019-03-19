package com.Flipkart.CommonActions.ResourceHelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceHelper {
	public static String getResourcePath(String resource) 
	{
		String path = getBaseResourcePath()+resource;
		System.out.println("Final resource path is:"+path);
		return path;
	}
	public static String getBaseResourcePath() 
	{
		String basePath = System.getProperty("user.dir");
		System.out.println("Base path is:"+basePath);
		return basePath;
	}
	public static InputStream getResourcePathInputStream(String resource) throws FileNotFoundException 
	{
		return new FileInputStream(ResourceHelper.getResourcePath(resource)) ;
	}
}

