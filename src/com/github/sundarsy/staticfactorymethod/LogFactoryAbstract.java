package com.github.sundarsy.staticfactorymethod;

public abstract class LogFactoryAbstract {
	
	public static Log getAppLog(){
		return new AppLog();
	}

	public static Log getAuditLog(){
		return new AuditLog();
	}
}
