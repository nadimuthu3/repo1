package com.juneproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class CommonUtilities {

	Properties prop = null;
	File file = null;
	FileInputStream fileinput = null;
	public String readData(String kname, String filepath) {
		String value = null;
		try {

			prop = new Properties();
			file = new File(filepath);

			if (file.exists()) {
				fileinput = new FileInputStream(file);
				prop.load(fileinput);

				value = prop.getProperty(kname);
			} else
				System.out.println("no such data exists");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
}
