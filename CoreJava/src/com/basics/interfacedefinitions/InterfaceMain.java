package com.basics.interfacedefinitions;

public class InterfaceMain {

	/**
	 * @param args
	 * 
	 * There are 2 Implementation class in this package, One of them implements a interface and the other extends 2 more interfaces.
	 * 
	 * 	2 Implementation Classes:
	 * 		InterfaceImpl ----------------------------------- implements InterfaceExample
	 * 		MultipleInterfaceImplementationImpl-------------- implements MultipleInterfaceImplementation which inturn extends 
	 * 															both interfaces "InterfaceExample" and "AnotherInterface"
	 * 
	 * 	3 Interfaces:
	 * 		InterfaceExample
	 * 		AnotherInterface
	 * 		MultipelInterfaceImplementation
	 * 
	 * 	
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Interface can never be instantiated, but can be implemented. The implemented interface can be instantiated.
//		InterfaceExample intf1 = new InterfaceExample(); 
		
//		 Implementation classes should always be defined as an Interface Implementation
//		InterfaceExample intfEx = new InterfaceImpl();// THIS IS CORRECT
		
//		Implementation Classes should not be defined and instantiated as Implementations. 
//		InterfaceImpl intfEx = new InterfaceImpl(); // THIS IS WRONG.
		
//		Both of the above codes Work. There is no such error that stops from doing so. We do this type of coding because,
//		there could be chances, where you change your mind and would like to have a different Instantiation of the implementation class, 
//		at later point of time.
		
//		For Example: If I decide not to go with InterfaceImpl() instantiation as defined above, I can have interface1 to be AnotherInterfaceImpl() 
//		instead of InterfaceImpl()
		
//		intf1 = new AnotherInterfaceImpl();
		
//		ArrayList al = new ArrayList();
//		LinkedList ll = new LinkedList<>();
		
//		List list = new ArrayList<>();
//		List list = new LinkedList();
		
		// Initializing InterfaceImpl class and invoking its overridden methods.
		
		InterfaceExample intfEx = new InterfaceImpl();
		intfEx.winPoll();
		intfEx.makeLaw();
		intfEx.makeDecisions();
		
		
//		Syntax:
//		{InterfaceName} {variableName} = new {ImplementationClassName};
		
		
		// Initializing MultipleInterfaceImplementationImpl class and invoking its overridden methods.
		
		MultipleInterfaceImplementation multIntfImpl =  new MultipleInterfaceImplementationImpl();
		multIntfImpl.winPoll();
		multIntfImpl.makeLaw();
		multIntfImpl.makeDecisions();
		multIntfImpl.multipleInterfaceInheritance();
		multIntfImpl.doThis();
		
	}

}
