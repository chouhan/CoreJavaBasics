package com.basics.abstractclassdefinitions;



/**
 * @author rakeshchouhan
 * 
 * Class Hierarchy:
 * 
 * 			AbstractClass
 * 				^
 * 				|					extends
 * 		AbstractOtherSubClass
 * 				^
 * 				|					extends
 * 		AbstractOtherSubClass2
 *
 */
public class AbstractClassOtherSubClass2 extends AbstractClassOtherSubClass{
	@Override
	public void call(){
		System.out.println("\nThis is Call() method from AbstractClassOtherSubClass2 ");
	}
}
