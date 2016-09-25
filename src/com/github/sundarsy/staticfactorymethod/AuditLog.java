package com.github.sundarsy.staticfactorymethod;

public class AuditLog implements Log{

	@Override
	public void writeLog(String log) {
		System.out.println("AUDIT_LOG: "+ log);
	}

}
