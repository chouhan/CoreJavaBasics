package com.basics.abstractclassdefinitions;



/**
 * @author rakeshchouhan
 *  
 *  There is no overridden method in this class.
 *  I am not calling call() method here. In order to do so, I got to mark this method as abstract.
 *  
 *  So, if a subclass (this class.. which is AbstractClassOtherSubClass) does not override an abstract method (call() method), 
 *  	it should mark itself as abstract to delegate responsibility to its subclasses (See AbstractClassOtherSubClass2) 
 *
 */
public abstract class AbstractClassOtherSubClass extends AbstractClass {


}
