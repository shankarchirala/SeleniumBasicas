package testcases;

import java.util.logging.Logger;


public class TestingLogs {

	public static Logger log = Logger.getLogger(TestingLogs.class.getName());
	public static void main(String[] args) {
		
		
		
		log.info("This is info logs");
		log.severe("This is severe logs");
	}

}
