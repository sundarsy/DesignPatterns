package com.github.sundarsy.factorypattern;

public class ImplementationClass {

	/***
	 * Singleton/Simple Factory Pattern implementation
	 * @param args
	 */
	public static void main(String args[]){
		System.out.println(Singleton.getInstance().getSomething());
	}
}
