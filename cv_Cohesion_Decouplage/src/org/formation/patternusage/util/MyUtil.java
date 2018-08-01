package org.formation.patternusage.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum MyUtil {
	INSTANCE;
	
	private String environment;
	
	public static final String PROPERTY_FILE = "settings.properties";
	public static final String ENV = "env";
	public static final String PROD = "env.prod";

	private MyUtil() {
		InputStream fi = getClass().getClassLoader().getResourceAsStream(PROPERTY_FILE);
		Properties properties = new Properties();
		try {
			properties.load(fi);
		} catch (IOException e) {
			System.out.println(PROPERTY_FILE+" non trouvé");
			e.printStackTrace();
		}
		this.environment = properties.getProperty(ENV);
	}

	public String getEnvironment() {
		return environment;
	}

}
