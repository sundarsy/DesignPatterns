package com.github.sundarsy.staticfactorymethod;

public interface LogFactory {

	public Log getAppLogger();
	public Log getAuditLogger();

}
