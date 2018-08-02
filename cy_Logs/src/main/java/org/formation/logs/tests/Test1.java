package org.formation.logs.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 {

	private static Logger LOGGER = LoggerFactory.getLogger(Test1.class);
	
	public static void main(String[] args) {
		
		LOGGER.trace("Trace");
		LOGGER.debug("Debug");
		LOGGER.info("Info");
		LOGGER.warn("Warn");
		LOGGER.error("Error");
		
	}

}
