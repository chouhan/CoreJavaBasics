package com.basics.abstractclassdefinitions;

/**
 * @author rakeshchouhan
 * 	
 * 		AbstractClassSubClass is a sub class of Abstract Class
 * 	
 * 		Caveats:
 * 			Abstract methods are meant to be overridden in the subclasses.
 * 			If you would not like to define the call() method in this class then, this class needs to marked as abstract class (See AbstractClassOtherSubClass)
 * 	
 * 	 Note: By making this class as abstract and implementing the methods as well, will not 
 * 		  give any compile time error., but gives a run time error after Instantiating this 
 * 		  AbstractSubClass. To Check this working see the driver class.
 * 
 * Class Hierarchy:
 * 
 * 			AbstractClass
 * 				^
 * 				|				extends
 * 		AbstractOtherSubClass
 *
 */
// Subclass
public class AbstractClassSubClass extends AbstractClass{

	//	@Override - Not necessary to provide this annotation, because, we are already implementing AbstractClass. 
//	Compiler by default takes care of overriding, when it see's extends keyword.
	public void call(){
		System.out.println("\nThis Call from AbstractClassSubClass");
	}
	
}