package com.basics.abstractclassdefinitions;

public class AbstractMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// When you instantiate a new AbstractClass(), you have to override all those methods marked as abstract.
		AbstractClass absClass = new AbstractClass() {
			
			@Override
			public void call() {
				// TODO Auto-generated method stub
				System.out.println("\nThis is from Overridden method Call. This is the actual place for implementing Call method.");
				
			}
		};
		
		System.out.println("\nHashCode gets changed everytime. HashCode of new AbstractClass " + absClass.hashCode());
		
		// Invoke the abstract class's call() method.
		absClass.call();
		
		
		AbstractClassSubClass absSubClass = new AbstractClassSubClass();
		System.out.println("\nHashCode gets changed everytime. HashCode of new AbstractClassSubClass " + absSubClass.hashCode());
		
		// Invoke the abstract class's call() method.
		absSubClass.call();
		
		// AbstractClassOtherSubClass does not override any super class (AbstractClass) methods, so we have to override it while instantiating it. 
		AbstractClassOtherSubClass absSubOtherClass = new AbstractClassOtherSubClass() {
			
			@Override
			public void call() {
				// TODO Auto-generated method stub
				System.out.println("\nThis call() method is called from AbstractClassOtherSubClass");
			}
		};
		absSubOtherClass.call();
		
		AbstractClassOtherSubClass2 absSubOtherClass2 = new AbstractClassOtherSubClass2();
		absSubOtherClass2.call();
		
	}

}
