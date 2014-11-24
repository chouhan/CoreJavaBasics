package com.basics.objectreference;

public class ObjectReferenceVariables {

	/**
	 * @param args
	 * 
	 * 	Assigning Object reference Variables.
	 * 
	 * Note: When you assign one object reference variable to another object reference variable, you are not creating a 
	 * 	copy of the object, you are making a copy of the reference.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Hello Aditya"); // Allocates new memory to Object s1
		System.out.println("String S1 is " + s1);
		String s2 = s1; // Assigning s1 Object as a reference to s2. s1 and s2 refers to the same object.
		// The above assignment of s2 does not allocate any memory or copy any part of the original object s1.
		System.out.println("String S2 is "+ s2);
		
		//If you remove/delete/unhook/untie/null the Object s1, s2 does not get affected. s2 still points to the original object s1.
		s1 = null;
		
		System.out.println("String S1 is " + s1);
		System.out.println("String S2 is " + s2);
		
	}

}
