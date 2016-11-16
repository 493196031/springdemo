package net.yl.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;


public class LogAspect {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(LogAspect.class);

	public void logBefore(JoinPoint joinPoint){
		logger.info("do log before....." + joinPoint);
	}
	
	public void logAfter(JoinPoint joinPoint){
		logger.info("do log after....." + joinPoint);
	}
	
}
