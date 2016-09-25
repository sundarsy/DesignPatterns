package com.github.sundarsy.factorypattern;

/***
 * Only one instance the class is created and exposed via a static method
 * @author rg3
 *
 */
public class Singleton {
	
	private static final Singleton INSTANCE = new Singleton();
	
    // Private constructor prevents instantiation from other classes
	// A constructor has to exist because if there's no constructor at all, a public default constructor is included
	private Singleton(){};
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	String getSomething() {
		return "Something";
	}

}
