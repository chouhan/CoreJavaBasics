package com.basics.interfacedefinitions;


/**
 * @author rakeshchouhan
 *
 *	1). Interfaces does not have any method implementation.
 *	2). All methods in an interface are public and/or abstract.
 *	3). Any field that is declared, is public and static.
 *	4). There is no multiple inheritance in Java. Which means, any Java class cannot extend more than one class at a time.
 *			Instead there is a Multiple Interface Inheritance. Which means, any Java can implement/extends more than one interface.
 *	5). Any Java class that implements any interface, will be having a IS-A relationship, between the Java Class and the interface.
 *	6). If a method deceleration in a interface is abstract, the whole interface need not be declared as abstract, this is unlike abstract classes.
 *	7). Java does not support multiple inheritance, because of the Diamond of Death Problem.
 *	8). Method Overriding is allowed in Interfaces. Each method signature in an interface is unique. 
 *			Meaning, you can have multiple methods of same name with different arguments.
 *			
 *
 */

public interface InterfaceExample {
	// This value below is a constant, they cannot be changed.
	int ageLimit = 50; // Even though you don't declare access modifiers to the variables, by default they are public and static.
	public abstract void winPoll(); // There is no implementation here.
	public abstract void makeLaw();
	public void makeDecisions(); // Interface  methods need not be abstract.
	public void winPoll(boolean bool); // Refer Point 8.
}
