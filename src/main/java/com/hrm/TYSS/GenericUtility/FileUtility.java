package com.hrm.TYSS.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String getTheDataFromPropertyFile(String keyvalue) throws Throwable {
		FileInputStream file=new FileInputStream(Iconstants.FilePath);
		Properties property=new Properties();
		property.load(file);
		String value = property.getProperty(keyvalue);
		return value;
	}

}
