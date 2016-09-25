package com.github.sundarsy.staticfactorymethod;

public class AppLog implements Log{

	@Override
	public void writeLog(String log){
		System.out.println("APP_LOG: " + log);
	}
}
