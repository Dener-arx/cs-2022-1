package Logging;

import java.util.logging.*;

public class LoggingClass {
    public static void main(String[] args) { 
    	Logger logger = Logger.getLogger(LoggingClass.class.toString());
    	logger.info("Information Log");
    	logger.log(Level.WARNING, "Warning Text");
    }
}