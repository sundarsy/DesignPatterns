package com.github.sundarsy.staticfactorymethod;

public class FactoryTest {
	
	public static void main(String args[]){
		
		/***
		 * Static Factory Method creation
		 */
		Log appLogger = LogFactoryAbstract.getAppLog();
		Log auditLogger = LogFactoryAbstract.getAuditLog();

		appLogger.writeLog("Some Log");
		auditLogger.writeLog("Some Log");
		
		/***
		 * Factory Method Pattern
		 */
		
		LogFactory appFactoryLogger = new LogFactoryConcrete();
		Log mylogger = appFactoryLogger.getAppLogger();
		mylogger.writeLog("Some Log");
	}

}
