package com.github.sundarsy.staticfactorymethod;

public class LogFactoryConcrete implements LogFactory{
	
	public LogFactoryConcrete() {
		
	}

	@Override
	public Log getAppLogger() {
		return new AppLog();
	}

	@Override
	public Log getAuditLogger() {
		return new AuditLog();
	}


}
