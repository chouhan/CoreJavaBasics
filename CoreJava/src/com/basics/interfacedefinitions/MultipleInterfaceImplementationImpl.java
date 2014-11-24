package com.basics.interfacedefinitions;



/**
 * @author rakeshchouhan
 *	
 *	Here MultipleInterfaceImplementationImpl class implements MultipleInterfaceImplementation, which inturn extends 2 more interfaces
 *		InterfaceExmaple and AnotherInterface., so we will need to override all the methods from all the 3 interfaces, which are
 *		MultipleInterfaceImplementation - 1 method
 *		InterfaceExample and  - 3 methods
 *		AnotherInterface. - 1 method
 *
 */
public class MultipleInterfaceImplementationImpl implements MultipleInterfaceImplementation{

	
	// This is the abstract method defined in "InterfaceExample" interface
	@Override
	public void winPoll() {
		// TODO Auto-generated method stub
		System.out.println("winPoll() being called from MultipleInterfaceImplementationImpl");
	}

	// This is the abstract method defined in "InterfaceExample" interface
	@Override
	public void makeLaw() {
		// TODO Auto-generated method stub
		System.out.println("makeLaw() being called from MultipleInterfaceImplementationImpl");
		
	}

	// This is the non-abstract method defined in "InterfaceExample" interface
	@Override
	public void makeDecisions() {
		// TODO Auto-generated method stub
		System.out.println("makeDecisions() being called from MultipleInterfaceImplementationImpl");
		
	}

	// This is the non-abstract method defined in "AnotherInterface" interface
	@Override
	public void doThis() {
		// TODO Auto-generated method stub
		System.out.println("doThis() being called from MultipleInterfaceImplementationImpl");
		
	}

	// This is the non-abstract method defined in "MultipleInterfaceImplementation" interface
	@Override
	public void multipleInterfaceInheritance() {
		// TODO Auto-generated method stub
		System.out.println("multipleInterfaceInheritance() being called from MultipleInterfaceImplementationImpl");
	}

	@Override
	public void winPoll(boolean bool) {
		// TODO Auto-generated method stub
		
	}
	
}
